package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jenk.MyCalc;

public class MyCalcTest {

	@Test
	public void test1() {
		assertEquals(10, new MyCalc().getSum(5,5));
	}
	
	@Test
	public void test2() {
		assertEquals(5, new MyCalc().getSum(2,3));
	}
	
	@Test
	public void test3() {
		assertEquals(5, new MyCalc().getDiff(10,5));
	}

}
