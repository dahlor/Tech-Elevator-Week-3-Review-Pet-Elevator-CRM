package com.techelevator.crm;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestCustomer {
	
	private Customer testCode = new Customer("Frank", "Fella");

	@Test
	public void TestGetBalanceDue() {
		
		Map<String, Double> services = new HashMap<String, Double>();
		services.put("Grooming", 10.00);
		services.put("Walking", 20.00);
		services.put("Sitting", 30.00);
		
		assertEquals("FATAL ERROR", 60.00, testCode.getBalanceDue(services), .001);
	}

}
