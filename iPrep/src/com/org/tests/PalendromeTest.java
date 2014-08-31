package com.org.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.org.strings.Palendrome;

public class PalendromeTest {
/*null
 * empty
 * only white spaces
 * integer.tostring()
 * lower case
 * upper case
 * ascii ansi characters
 * extended strings
 * binary numbers
 * sql injection
 * numbers in string
 * spaces before and after
 * special characters
 * passing from other methods
 * alphanumeric
 * 
 * 
 */
	
	
	@Test
	public void test() {
		String input="";
		String input1="w";
		String input2="wow";
		String input3="Maanasa";
		String input4="847824c099823";
		String input5=null;
		assertFalse(Palendrome.palendrome(input));
		assertTrue(Palendrome.palendrome(input1));
		assertTrue(Palendrome.palendrome(input2));
		assertFalse(Palendrome.palendrome(input3));
		assertFalse(Palendrome.palendrome(input4));
		assertFalse(Palendrome.palendrome(input5));


				
	}

}
