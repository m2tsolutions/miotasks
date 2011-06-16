/**
 * This software is property of M2TSolutions LLC.
 */
package com.m2tsolutions.miotasks.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


/**
 * @author mmohale
 *
 */
public abstract class CustomHibernateDaoSupport extends HibernateDaoSupport
{	
	 @Autowired
	    public void anyMethodName(SessionFactory sessionFactory)
	    {
	        setSessionFactory(sessionFactory);
	    }


}
