package com.org.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.org.DS.EProblem1;

public class EProblem1Test {

	@Test
	public void test() {
		EProblem1.eProblem1(0);
		EProblem1.eProblem1(1);
		EProblem1.eProblem1(10);
		EProblem1.eProblem1(1000);
		EProblem1.eProblem1(-1);
	}

}
