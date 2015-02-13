package Tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Wrapper.WordWrapper;

public class WrapperTester {

	@Test
	public void simpleTest() {
		WordWrapper wrapper = new WordWrapper(6);
		List<String> groups = wrapper.wrap("Hello World!");
		
		assertEquals(2,groups.size());
		assertEquals("Hello",groups.get(0));
		assertEquals("World!",groups.get(1));
	}
	
	@Test
	public void bigRowLenghtTester(){
		WordWrapper wrapper = new WordWrapper(60);
		List<String> groups = wrapper.wrap("Hello World!");
		
		assertEquals(1, groups.size());
		assertEquals("Hello World!",groups.get(0));
	}
	
	@Test
	public void smallRowLenghtTester(){
		WordWrapper wrapper = new WordWrapper(2);
		List<String> groups = wrapper.wrap("Hello World!");
		
		assertEquals(6,groups.size());
		assertEquals("He",groups.get(0));
		assertEquals("ll",groups.get(1));
		assertEquals("o",groups.get(2));
		assertEquals("Wo",groups.get(3));
		assertEquals("rl",groups.get(4));
		assertEquals("d!",groups.get(5));
	}

}
