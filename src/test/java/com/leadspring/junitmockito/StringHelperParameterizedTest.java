package com.leadspring.junitmockito;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	//Test Conditions (AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CD
	StringHelper helper = new StringHelper();
	
	private String input;
	private String expected;
	

	public StringHelperParameterizedTest(String input, String expected) {
		super();
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedActual[][] =
			{{"AACD", "CD"}, {"ACD", "CD"}, {"CDEF", "CDEF"}, {"CDAA", "CDAA"}};
				//{"ABCD", "false"}, {"ABAB", "true"}, {"AB", "true"}, {"A", "false"}};
	return Arrays.asList(expectedActual);	
	}
	
	@Test
	public void truncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals(expected, helper.truncateAInFirst2Positions(input));
		
	}
	
	@Test
	public void truncateAInFirst2Positions_AinFirstPosition() {
		assertEquals(expected, helper.truncateAInFirst2Positions(input));
	}
	
	@Test
	public void truncateAInFirst2Positions_NoAInString() {
		assertEquals(expected, helper.truncateAInFirst2Positions(input));
	}
	
	@Test
	public void truncateAInFirst2Positions_AinLast2Positions() {
		assertEquals(expected, helper.truncateAInFirst2Positions(input));
	}

	//ABCD => false, ABAB => true, AB => true, A => false
	/**
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_AlwaysPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_AlwaysNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	**/
}
