package com.bulider.decorate.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bulider.decorate.entity.CmRotateAds;

@Repository
public class CmRotateAdsRepositoryImpl {
	@PersistenceContext EntityManager em; 
	public List<CmRotateAds> findCmRotateAdsByModuleId(String moduleId){
		String sql="Select c from CmRotateAds c where c.moduleId="+moduleId;
		String sq="select * from table left join table where ";
		Query query=em.createQuery(sql);
		//query.setParameter("moduleId", moduleId);
		return query.getResultList();
	}
}
