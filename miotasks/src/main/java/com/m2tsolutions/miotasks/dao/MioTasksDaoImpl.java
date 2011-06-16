/**
 * This software is property of M2TSolutions LLC.
 */
package com.m2tsolutions.miotasks.dao;

import com.m2tsolutions.common.domain.Event;
import com.m2tsolutions.miotasks.util.CustomHibernateDaoSupport;

/**
 * @author mmohale
 *
 */
public class MioTasksDaoImpl extends CustomHibernateDaoSupport implements MioTasksDao {

	/* (non-Javadoc)
	 * @see com.m2tsolutions.miotasks.dao.MioTasksDao#addEvent(com.m2tsolutions.common.domain.Event)
	 */
	@Override
	public void addEvent(Event event) {
		getHibernateTemplate().save( event );
	}

}
