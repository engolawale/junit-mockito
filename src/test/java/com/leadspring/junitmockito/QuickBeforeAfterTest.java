package com.leadspring.junitmockito;

import static org.junit.Assert.*;
import org.apache.log4j.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	final static Logger logger = Logger.getLogger(QuickBeforeAfterTest.class);

	@BeforeClass
	public static void beforeClass() {
        // logger.info("test 1 executed");
		System.out.println("Before class executed");
	}
	
	@AfterClass
	public static void afterClass() {
        // logger.info("test 1 executed");
		System.out.println("After class executed");
	}
	
	@Before
	public void setup() {

		// logger.info("test 1 executed");
		System.out.println("Before executed");
	}

	@Test
	public void test1() {

		// logger.info("test 1 executed");
		System.out.println("test 1 executed");
	}

	@Test
	public void test2() {

		// logger.info("test 2 executed");
		System.out.println("test 2 executed");
	}
	
	@After
	public void tearDown() {

		// logger.info("test 1 executed");
		System.out.println("After executed");
	}

}
