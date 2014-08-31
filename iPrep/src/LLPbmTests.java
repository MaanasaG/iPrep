

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

public class LLPbmTests extends TestCase{

	@Test
	public void testEmptyInputset() {
		ArrayList<String> input = new ArrayList<String>();
		input.add("");
		//assertFalse(Cities.readData(input));
	}
    public void testNullInput() {
    	ArrayList<String> input = new ArrayList<String>();
		assertFalse(LLPbm.readData(input));
	}
    public void test() {
    	ArrayList<String> input = new ArrayList<String>();
    	input.add("");
		assertFalse(LLPbm.readData(input));
	}
    public void testwrongOP() {
    	ArrayList<String> input = new ArrayList<String>();
		input.add("d,q,fremont");
		assertFalse(LLPbm.readData(input));
	}
    public void testrightOP() {
    	ArrayList<String> input = new ArrayList<String>();
		input.add("d,q,fremont,CA");
		input.add("b,q,UnionCity,CA");
		input.add("a,q,San jose,CA");
		assertTrue(LLPbm.readData(input));
	}
    public void testAlphaNumeric() {
    	ArrayList<String> input = new ArrayList<String>();
		input.add("1,2,fremont,*");
		assertTrue(LLPbm.readData(input));
	}
    public void testExtraSpaces() {
    	ArrayList<String> input = new ArrayList<String>();
		input.add("A  ,  2,fremont,k  ");
		assertTrue(LLPbm.readData(input));
	}
    public void testExtraLines() {
    	ArrayList<String> input = new ArrayList<String>();
		input.add("A  ,  ,fremont,k  ");
		assertTrue(LLPbm.readData(input));
	}
    public void testEmptyNames() {
    	ArrayList<String> input = new ArrayList<String>();
		input.add("  ,  ,fremont,k  ");
		assertTrue(LLPbm.readData(input));
	}
    public void testblanknames() {
    	ArrayList<String> input = new ArrayList<String>();
		input.add(",,fremont,k  ");
		assertTrue(LLPbm.readData(input));
	}
    
}
