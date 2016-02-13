/**
 * 
 */
package com.springinaction.springidol;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JugglerTest {

	static ApplicationContext ctx;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx = new ClassPathXmlApplicationContext("classpath:com/springinaction/springidol/spring-idol.xml");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDuke() throws PerformanceException {
		
		Performer aPerformer = (Performer) ctx.getBean("duke");
		aPerformer.perform();
	
	}
	
	@Test
	public void testDuke15() throws PerformanceException {
		Performer aPerformer = (Performer) ctx.getBean("duke15");
		aPerformer.perform();
	
	}
	
	@Test
	public void testSingleton() throws PerformanceException {
		
		Performer aPerformer = (Performer) ctx.getBean("duke");
		Performer aPerformerdd = (Performer) ctx.getBean("dukedd");
		System.out.println(aPerformer);
		System.out.println(aPerformerdd);
	
	}

}
