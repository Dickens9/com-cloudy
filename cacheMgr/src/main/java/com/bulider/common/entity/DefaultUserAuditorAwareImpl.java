package com.bulider.common.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;

import com.cloudy.uam.auth.remote.UamSessionService;

/**
 * Created by lxd on 2014/11/28.
 */
public class DefaultUserAuditorAwareImpl implements AuditorAware<String>
{
    @Autowired
    private UamSessionService uamSessionService;

    public DefaultUserAuditorAwareImpl() {}

    public String getCurrentAuditor()
    {
        return "B2C_FRONEND_USER";
    }
}
