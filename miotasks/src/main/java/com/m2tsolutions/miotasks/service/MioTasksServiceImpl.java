/**
 * This software is property of M2TSolutions LLC.
 */
package com.m2tsolutions.miotasks.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.m2tsolutions.common.domain.Event;
import com.m2tsolutions.miotasks.dao.MioTasksDao;

/**
 * @author mmohale
 *
 */
public class MioTasksServiceImpl implements MioTasksService {
	
	@Autowired
	MioTasksDao mioTasksDao;

	/**
	 * @return the mioTasksDao
	 */
	public MioTasksDao getMioTasksDao() {
		return mioTasksDao;
	}

	/**
	 * @param mioTasksDao the mioTasksDao to set
	 */
	public void setMioTasksDao(MioTasksDao mioTasksDao) {
		this.mioTasksDao = mioTasksDao;
	}

	/* (non-Javadoc)
	 * @see com.m2tsolutions.miotasks.service.MioTasksService#addEvent(com.m2tsolutions.common.domain.Event)
	 */
	@Override
	public void addEvent(Event event) {
		mioTasksDao.addEvent(event);
	}

}
