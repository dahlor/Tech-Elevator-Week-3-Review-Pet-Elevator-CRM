package com.techelevator.crm;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestPet {
	
	private Pet testCode = new Pet("String", "String");

	@Test
	public void TestListVaccinations() {
		
		ArrayList<String> result = new ArrayList<String>();
		result.add("Rabies");
		result.add("Dengue");
		result.add("Madcow");
		
		testCode.setVaccinations(result);
		
		assertEquals("Wrong Return", "Rabies, Dengue, Madcow, ", testCode.listVaccinations());
		
		
		
	}

}
