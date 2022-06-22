package com.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest() 
	{
		//creating object of class
		MyJUnitClass mjunit = new MyJUnitClass();
		int result = mjunit.add(10, 20);
		assertEquals(30,result);
	}

}
