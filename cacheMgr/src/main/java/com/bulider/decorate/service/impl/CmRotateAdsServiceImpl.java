package com.bulider.decorate.service.impl;



import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bulider.common.entity.search.CacheableQuery;
import com.bulider.common.service.impl.AbstractCacheableBaseService;
import com.bulider.common.utils.CommonDate;
import com.bulider.decorate.entity.CmRotateAds;
import com.bulider.decorate.repository.CmRotateAdsRepository;
import com.bulider.decorate.service.CmRotateAdsService;
import com.bulider.decorate.vo.CmRotateAdsVo;

/**
 * TODO(服务层实现类)
 * @author by ibm core generator
 * @version 1.0.0
 */
@Service
public class CmRotateAdsServiceImpl extends AbstractCacheableBaseService<CmRotateAds, String> implements CmRotateAdsService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
  /*  @Autowired
    private CmAdsModuleService cmAdsModuleService;*/
	@SuppressWarnings("unused")
    private CmRotateAdsRepository getCmRotateAdsRepository() {
		return (CmRotateAdsRepository) baseRepository;
	}
	@Override
	@Transactional
	public CmRotateAdsVo saveCmRotateAdsVo(CmRotateAdsVo vo)  {
		CmRotateAds entity=new CmRotateAds ();
      /*  CmAdsModule cmAdsModule = cmAdsModuleService.findByModuleCode(vo.getModuleId());
        entity.setModuleId(cmAdsModule.getId());
		entity.setBackgroundColor(vo.getBackgroundColor());
		entity.setEndTime(vo.getEndTime());
		entity.setHref(vo.getHref());
		entity.setIsNewWindow(vo.getIsNewWindow());
		entity.setTitle(vo.getTitle());
		entity.setPicId(vo.getPicId());
		entity.setTip(vo.getTip());
		entity.setPosition(vo.getPosition());
		entity.setStartTime(vo.getStartTime());
		this.save(entity);*/
		vo.setId(entity.getId());
		return vo;
	}
	@Override
	public List<CmRotateAdsVo> findCmRotateAdsVoByModuleId(String moudleCode)
			 {
		List<CmRotateAdsVo> volist=new ArrayList();
	/*	CmAdsModule cmAdsModule = new CmAdsModule() //cmAdsModuleService.findByModuleCode(moudleCode);
		 List<CmRotateAds> entitylist =getCmRotateAdsRepository().findByConditions(CacheableQuery.newInstance().addQuery(CmRotateAdsVo.MODULE_ID, cmAdsModule.getId()));
		for(CmRotateAds entity:entitylist){
			CmRotateAdsVo vo=new CmRotateAdsVo();
			BeanUtils.copyProperties(entity, vo);
			if(entity.getStartTime()!=null){
				String effectDate=CommonDate.getInstance(entity.getStartTime(), 1).toString()+ " 至 " +CommonDate.getInstance(entity.getEndTime(), 1).toString();
				vo.setEffectiveDate(effectDate);
			}
			volist.add(vo);
		}*/
		return volist;
	}

	@Override
	@Transactional
	public CmRotateAdsVo saveAndUpdateCmRotateAdsVo(CmRotateAdsVo vo)  {
		CmRotateAds entity=null;
		if(StringUtils.isNotEmpty(vo.getId())){
			 entity=this.findCmRotateAdsByKey(vo.getId().trim());
		}
		if(entity==null){
			CmRotateAdsVo bean=this.saveCmRotateAdsVo(vo);
			return bean;
		}
		entity.setBackgroundColor(vo.getBackgroundColor());
		entity.setEndTime(vo.getEndTime());
		entity.setHref(vo.getHref());
		entity.setIsNewWindow(vo.getIsNewWindow());
		entity.setTitle(vo.getTitle());
		entity.setTip(vo.getTip());
		entity.setModuleId(vo.getModuleId());
		entity.setPicId(vo.getPicId());
		entity.setPosition(vo.getPosition());
		entity.setStartTime(vo.getStartTime());
		this.update(entity);
		return vo;
	}

	@Override
	public CmRotateAdsVo findRotationById(String id)  {
		CmRotateAds entity=findCmRotateAdsByKey( id);
		CmRotateAdsVo vo =new CmRotateAdsVo();
		BeanUtils.copyProperties(entity, vo);
		//vo.setFilePath(FileSystemUtils.getUrlByFileId(entity.getPicId()));
		return vo;	
	}
	private CmRotateAds findCmRotateAdsByKey(String id){
		 CmRotateAds cmRotateAds =getCmRotateAdsRepository().findOneByConditions(CacheableQuery.newInstance().addQuery(CmRotateAds.ID, id));
		 return cmRotateAds;
	}
    public List<CmRotateAds> getCmRotateAdsByMoudleIdAndTagId(String moduleId,String tagId){
        CacheableQuery query = CacheableQuery.newInstance().addQuery(CmRotateAds.MODULE_ID, moduleId);
        if (StringUtils.isNotBlank(tagId)){
            query.addQuery(CmRotateAds.TAG_ID,tagId);
        }
        return getCmRotateAdsRepository().findByConditions(query);
    }

}