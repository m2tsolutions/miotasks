/**
 * This software is property of M2TSolutions LLC.
 */
package com.m2tsolutions.miotasks.dao;

import java.util.Calendar;

import junit.framework.Assert;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;

import com.m2tsolutions.common.domain.Event;
import com.m2tsolutions.miotasks.service.MioTasksService;


/**
 * @author mmohale
 *
 */
@ContextConfiguration(locations={"/SpringBeans.xml"})
public class EventHandlingTest extends AbstractJUnit38SpringContextTests {
	
	private Log logger = LogFactory.getLog(this.getClass());
	
	@Autowired
	private MioTasksService miotasksService;
	
	public void testAddEvent() {
		logger.debug( "Starting add event test" );
		Event event = new Event();
		event.setName("First Event");
		event.setStartDate( Calendar.getInstance().getTime() );
		event.setEndDate( Calendar.getInstance().getTime() );
		
		miotasksService.addEvent( event );
		
		Assert.assertTrue( event.getId() > 0 );
	}
	
	
}
