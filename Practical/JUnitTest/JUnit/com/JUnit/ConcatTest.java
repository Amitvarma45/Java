package com.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatTest {

	@Test
	public void Concat() 
	{
		//creating object of class
		MyJUnitClass mjunit = new MyJUnitClass();
		String result = mjunit.Concat("My Life", " My Rule");
		assertEquals("My Life My Rule",result);
	}

}
