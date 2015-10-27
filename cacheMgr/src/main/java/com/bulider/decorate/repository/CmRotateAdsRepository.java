
package com.bulider.decorate.repository;

import java.util.List;

import com.bulider.common.repository.ICacheableBaseRepository;
import com.bulider.decorate.entity.CmRotateAds;
/**
 * TODO(持久化类)
 * @author by ibm core generator
 * @version 1.0.0
 */
public interface CmRotateAdsRepository extends  ICacheableBaseRepository<CmRotateAds, String> {
	
	public List<CmRotateAds> findCmRotateAdsByModuleId(String moudleId);

}

