package com.evolutionnext.model;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalcStatsTest {

	@Test
	public void testMinValueWithNoElements() {
		List<Integer> integers = new ArrayList<Integer>();
		CalcStats calcStats = new CalcStats(integers);
		assertNull(calcStats.getMinimum());
	}
	
	@Test
	public void testMinValueWithOneElements() {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(5);
		CalcStats calcStats = new CalcStats(integers);
		assertEquals(new Integer(5), calcStats.getMinimum());
	}
	
	@Test
	public void testMinValueWithTwoElements() {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(5);
		integers.add(-10);
		CalcStats calcStats = new CalcStats(integers);
		assertEquals(new Integer(-10), calcStats.getMinimum());
	}
	@Test
	public void testMinValueWithSameElements() {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(5);
		integers.add(5);
		integers.add(5);
		CalcStats calcStats = new CalcStats(integers);
		assertEquals(new Integer(5), calcStats.getMinimum());
	}
	@Test
	public void testThatWePassNullAtConstruction() {	
		CalcStats calcStats = new CalcStats(null);
		assertNull(calcStats.getMinimum());
	}
	@Test
	public void testAverageWithNoElements() {	
		List<Integer> integers = new ArrayList<Integer>();
		CalcStats calcStats = new CalcStats(integers);
		try {
			calcStats.getAverage();
			fail("This line should not be invoked.");
		} catch (IllegalStateException e) {
			System.out.println("The Average method threw an exception: "+e.getMessage());
		}catch (NullPointerException e) {
			System.out.println("The Average method threw an exception: "+e.getMessage());
		}
	}
}
