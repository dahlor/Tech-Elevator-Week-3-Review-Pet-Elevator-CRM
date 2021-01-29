package com.techelevator.crm;

import java.util.ArrayList;

public class Pet {

	
	private String name;
	private String species;
	ArrayList<String> vaccinations = new ArrayList<String>();
	
	
	public Pet(String name, String species) {
		this.name = name;
		this.species = species;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public ArrayList<String> getVaccinations() {
		return vaccinations;
	}


	public void setVaccinations(ArrayList<String> vaccinations) {
		this.vaccinations = vaccinations;
	}
	
	public String listVaccinations() {
		String shots = "";
		for(int i = 0; i < vaccinations.size(); i++) 
			shots = shots + vaccinations.get(i) + ", ";
		
		return shots;
	}
	
}
