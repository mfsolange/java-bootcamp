package Tests;
import static org.junit.Assert.*;

import org.junit.Test;

import Check.AmountReader;


public class CheckReaderTester {

	@Test
	public void oneDigitReaderTest(){
		
		//Given
		String expected = "Nine dollars";
		AmountReader reader = new AmountReader();
		
		//When
		String actual = reader.read(9);
		
		//Then
		assertNotNull(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	public void twoDigitReaderTest(){
		
		//Given
		String expected = "Seventeen dollars";
		AmountReader reader = new AmountReader();
		
		//When
		String actual = reader.read(17);
		
		//Then
		assertNotNull(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	public void threeDigitReaderTest(){
		
		//Given
		String expected = "One hundred Seventy Nine dollars";
		AmountReader reader = new AmountReader();
		
		//When
		String actual = reader.read(179);
		
		//Then
		assertNotNull(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	public void thousandReaderTest(){
		
		//Given
		String expected = "Four hundred Seventy Four thousand Six hundred Forty Seven dollars";
		AmountReader reader = new AmountReader();
		
		//When
		String actual = reader.read(474647);
		
		//Then
		assertNotNull(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	public void millionReaderTest(){
		
		//Given
		String expected = "Nine hundred Thirty Two million Four hundred Seventy Four thousand Six hundred Forty Seven dollars";
		AmountReader reader = new AmountReader();
		
		//When
		String actual = reader.read(932474647);
		
		//Then
		assertNotNull(actual);
		assertEquals(expected, actual);
	}

	@Test
	public void centsReaderTest(){
		
		//Given
		String expected = "Two thousand Three hundred Forty Five dollars with 07/100 cents";
		AmountReader reader = new AmountReader();
		
		//When
		String actual = reader.read((double)2345.07);
		
		//Then
		assertNotNull(actual);
		assertEquals(expected, actual);
	}
}
