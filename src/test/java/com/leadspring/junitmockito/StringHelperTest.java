package com.leadspring.junitmockito;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {
	//Test Conditions (AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CD
	StringHelper helper = new StringHelper();
	
	@Test
	public void truncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		
	}
	
	@Test
	public void truncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void truncateAInFirst2Positions_NoAInString() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void truncateAInFirst2Positions_AinLast2Positions() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}

	//ABCD => false, ABAB => true, AB => true, A => false
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_AlwaysPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_AlwaysNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
}
