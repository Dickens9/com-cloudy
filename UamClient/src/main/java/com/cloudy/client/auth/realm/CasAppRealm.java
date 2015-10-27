package com.cloudy.client.auth.realm;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cas.CasAuthenticationException;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.cas.CasToken;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.validation.Assertion;
import org.jasig.cas.client.validation.TicketValidationException;
import org.jasig.cas.client.validation.TicketValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cloudy.uam.auth.remote.UamCrossAppSessionService;
import com.cloudy.uam.auth.remote.vo.SessionUser;
import com.cloudy.uam.permission.remote.UamPermissionService;
import com.cloudy.uam.permission.remote.vo.Resource;
import com.cloudy.uam.permission.remote.vo.Role;
import com.cloudy.uam.userorg.remote.UamUserOrgService;
import com.cloudy.uam.userorg.remote.vo.Job;
import com.cloudy.uam.userorg.remote.vo.Org;
import com.cloudy.uam.userorg.remote.vo.User;
import com.cloudy.uam.userorg.remote.vo.UserOrgJob;

public class CasAppRealm extends CasRealm
{
  private Logger logger;
  private UamUserOrgService uamUserOrgService;
  private UamPermissionService uamPermissionService;
  private UamCrossAppSessionService uamCrossAppSessionService;

  public CasAppRealm()
  {
    this.logger = LoggerFactory.getLogger(super.getClass());
  }

  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals)
  {
    try
    {
      SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

      SessionUser sessionUser = null;
      sessionUser = (SessionUser)SecurityUtils.getSubject().getSession().getAttribute("SESSION_USER");
      if (sessionUser == null) {
        sessionUser = (SessionUser)SecurityUtils.getSubject().getPrincipal();
      }

      SessionUser xaSessionUser = (SessionUser)this.uamCrossAppSessionService.getObjectFrom("SESSION_USER");
      if (xaSessionUser == null) {
        xaSessionUser = sessionUser;
        this.uamCrossAppSessionService.putObjectInto("SESSION_USER", xaSessionUser);
      }

      if ((!sessionUser.getServiceJobId().equals(xaSessionUser.getServiceJobId())) || (!sessionUser.getServiceOrgId().equals(xaSessionUser.getServiceOrgId())))
      {
        BeanUtils.copyProperties(sessionUser, xaSessionUser);

        buildAuthorizationInfo(authorizationInfo, sessionUser);
        Subject subject = SecurityUtils.getSubject();
        subject.getSession().setAttribute("SESSION_USER", sessionUser);
        subject.getSession().setAttribute(SimpleAuthorizationInfo.class.getName(), authorizationInfo);
      } else {
        Subject subject = SecurityUtils.getSubject();

        authorizationInfo = (SimpleAuthorizationInfo)subject.getSession().getAttribute(SimpleAuthorizationInfo.class.getName());
        if (authorizationInfo == null) {
          authorizationInfo = new SimpleAuthorizationInfo();
          buildAuthorizationInfo(authorizationInfo, sessionUser);
          subject.getSession().setAttribute(SimpleAuthorizationInfo.class.getName(), authorizationInfo);
        }
      }
      return authorizationInfo;
    }
    catch (RuntimeException e) {
      this.logger.error("Init User authorizationInfo Failed", e);
      throw e;
    } catch (IllegalAccessException e) {
      this.logger.error("Init User authorizationInfo Failed", e);
      throw new AuthenticationException(e);
    } catch (InvocationTargetException e) {
      this.logger.error("Init User authorizationInfo Failed", e);
      throw new AuthenticationException(e);
    }
  }

  private void buildAuthorizationInfo(SimpleAuthorizationInfo authorizationInfo, SessionUser sessionUser)
  {
    List<Role> roles = this.uamPermissionService.getRoleByJobId(sessionUser.getServiceJobId());
    if ((roles != null) && (!roles.isEmpty())) {
      Set rolesSet = new HashSet();
      for (Role role : roles) {
        rolesSet.add(role.getRoleName());
      }
      authorizationInfo.setRoles(rolesSet);
    }

    List<Resource> resources = this.uamPermissionService.getResourceByJobId(sessionUser.getServiceJobId());
    if ((resources != null) && (!resources.isEmpty())) {
      Set permissionSet = new HashSet();
      for (Resource resource : resources) {
        permissionSet.add(resource.getResourceCode());
      }
      authorizationInfo.setStringPermissions(permissionSet);
    }
  }

  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
    throws AuthenticationException
  {
    try
    {
      CasToken casToken = (CasToken)token;
      if (token == null) {
        return null;
      }

      String ticket = (String)casToken.getCredentials();
      if (!StringUtils.hasText(ticket)) {
        return null;
      }

      TicketValidator ticketValidator = ensureTicketValidator();
      try
      {
        Assertion casAssertion = ticketValidator.validate(ticket, getCasService());

        AttributePrincipal casPrincipal = casAssertion.getPrincipal();
        String username = casPrincipal.getName();

        Map attributes = casPrincipal.getAttributes();

        this.logger.debug("Validate ticket : {} in CAS server : {} to retrieve user : {}", new Object[] { ticket, getCasServerUrlPrefix(), username });

        casToken.setUserId(username);

        String rememberMeAttributeName = getRememberMeAttributeName();
        String rememberMeStringValue = (String)attributes.get(rememberMeAttributeName);

        boolean isRemembered = (rememberMeStringValue != null) && (Boolean.parseBoolean(rememberMeStringValue));
        if (isRemembered) {
          casToken.setRememberMe(true);
        }

        String ssoSessionId = (String)attributes.get("ssoSessionId");

        SessionUser sessionUser = buildSessionUser(username, ssoSessionId);

        return new SimpleAuthenticationInfo(sessionUser, ticket, getName());
      }
      catch (TicketValidationException e) {
        this.logger.debug("Unable to validate ticket [" + ticket + "]", e);
        throw new CasAuthenticationException("Unable to validate ticket [" + ticket + "]", e);
      }
    } catch (Exception e) {
      this.logger.debug("CasAppRealm Auth", e);
      throw e;
    }
  }

  private SessionUser buildSessionUser(String username, String ssoSessionId)
  {
    SessionUser sessionUser = (SessionUser)this.uamCrossAppSessionService.getObjectFrom(ssoSessionId, "SESSION_USER");
    if (sessionUser == null) {
      sessionUser = new SessionUser();
      User user = this.uamUserOrgService.getUserByUsername(username);
      List userOrgJobList = this.uamUserOrgService.getUserOrgJobByUserId(user.getId());

      sessionUser.setId(user.getId());
      sessionUser.setUsername(username);
      sessionUser.setSsoSessionId(ssoSessionId);
      sessionUser.setEmployeeCode(user.getEmployeeCode());
      sessionUser.setEmployeeType(user.getEmployeeType());
      sessionUser.setEmail(user.getEmail());
      sessionUser.setMobile(user.getMobile());
      sessionUser.setRealName(user.getRealName());
      sessionUser.setSex(user.getSex());
      if ((userOrgJobList != null) && (!userOrgJobList.isEmpty())) {
        UserOrgJob mainUserOrgJob = findMainUserOrgJob(userOrgJobList);

        Job job = this.uamUserOrgService.getJobById(mainUserOrgJob.getJobId());
        sessionUser.setServiceJobId(mainUserOrgJob.getJobId());
        sessionUser.setServiceJobName(job.getJobName());
        sessionUser.setServiceJobCode(job.getJobCode());

        Org dep = this.uamUserOrgService.getOrgById(mainUserOrgJob.getOrgId());
        sessionUser.setServiceDepId(mainUserOrgJob.getOrgId());
        sessionUser.setServiceDepName(dep.getOrgName());
        sessionUser.setServiceDepCode(dep.getOrgCode());
        sessionUser.setServiceDepAddress(dep.getAddress());
        sessionUser.setServiceDepChannel(dep.getChannel());
        sessionUser.setServiceDepFax(dep.getFax());
        sessionUser.setServiceDepHierarchy(dep.getDepHierarchy());
        sessionUser.setServiceDepIsOwned(dep.getIsOwned());
        sessionUser.setServiceDepPhone(dep.getPhone());
        sessionUser.setServiceDepType(dep.getDepType());
        sessionUser.setServiceDepOrgType(dep.getOrgType());

        Org company = this.uamUserOrgService.getComapnyByOrgId(dep.getId());
        if (company != null) {
          sessionUser.setServiceCompanyId(company.getId());
          sessionUser.setServiceCompanyName(company.getOrgName());
          sessionUser.setServiceCompanyAddress(company.getAddress());
          sessionUser.setServiceCompanyFax(company.getFax());
          sessionUser.setServiceCompanyPhone(company.getPhone());
          sessionUser.setServiceCompanyCode(company.getOrgCode());
          sessionUser.setServiceCompanyIsOwned(company.getIsOwned());
        }
      }

      this.uamCrossAppSessionService.putObjectInto(ssoSessionId, "SESSION_USER", sessionUser);
    }

    return sessionUser;
  }

  private UserOrgJob findMainUserOrgJob(List<UserOrgJob> userOrgJobList) {
    if ((userOrgJobList == null) || (userOrgJobList.isEmpty())) {
      return null;
    }
    UserOrgJob main = null;
    for (UserOrgJob uoj : userOrgJobList) {
      if ("Y".equals(uoj.getIsmain())) {
        main = uoj;
        break;
      }
    }
    if (main == null) {
      main = (UserOrgJob)userOrgJobList.get(0);
    }
    return main;
  }

  public void setUamUserOrgService(UamUserOrgService uamUserOrgService)
  {
    this.uamUserOrgService = uamUserOrgService;
  }

  public void setUamPermissionService(UamPermissionService uamPermissionService)
  {
    this.uamPermissionService = uamPermissionService;
  }

  public void setUamCrossAppSessionService(UamCrossAppSessionService uamCrossAppSessionService)
  {
    this.uamCrossAppSessionService = uamCrossAppSessionService;
  }
}
