package com.techelevator.crm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techelevator.Billable;
import com.techelevator.Person;

public class Customer extends Person implements Billable {

		// Variables
	
		private String phoneNumber;
		private List pets = new ArrayList();
	
		
		// Setters & Getters
	
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public List getPets() {
			return pets;
		}
		public void setPets(List pets) {
			this.pets = pets;
		}
		
		
		// Constructors
		
		public Customer(String firstName, String lastName, String phoneNumber) {
			super(firstName, lastName);
			this.phoneNumber = phoneNumber;
		}
		
		public Customer(String firstName, String lastName) {
			super(firstName, lastName);
			phoneNumber = "";
		}
		
		// Method (Implementing Billable)
		
				
		public double getBalanceDue(Map<String, Double> servicesRendered) {
			
			double totalCost = 0.00;
			
			for(Map.Entry<String, Double> loopy : servicesRendered.entrySet()) {
					totalCost = totalCost + loopy.getValue();
			}
			
			return totalCost;	
		}
}
