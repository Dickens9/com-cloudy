package com.bulider.decorate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bulider.common.service.CacheableBaseService;
import com.bulider.decorate.entity.CmRotateAds;
import com.bulider.decorate.vo.CmRotateAdsVo;

/**
 * TODO(服务类)
 * @author by ibm core generator
 * @version 1.0.0
 */
@Service
public interface CmRotateAdsService extends CacheableBaseService<CmRotateAds, String>{
    /**
	 * 用于保存轮换广告
	 * @param vo
	 * @return
	 * @
	 */
    CmRotateAdsVo saveCmRotateAdsVo(CmRotateAdsVo vo);
    /**
     * 根据模块的Id来查看当前对应的轮换广告
     * @param moudleId
     * @return
     * @
     */
    List<CmRotateAdsVo> findCmRotateAdsVoByModuleId(String moudleId);
    /**
     * 用于保存和更新轮换广告
     * @param vo
     * @return
     * @
     */
    CmRotateAdsVo saveAndUpdateCmRotateAdsVo(CmRotateAdsVo vo);
    /**
     * 根据当前模块的Id和tagId来查找对应的轮换广告
     * @param moduleId
     * @param tagId
     * @return
     */
    List<CmRotateAds> getCmRotateAdsByMoudleIdAndTagId(String moduleId,String tagId);
    /**
     * 根据Id查找CmRotateAds
     * @param id
     * @return
     */
    CmRotateAdsVo findRotationById(String id);
}
