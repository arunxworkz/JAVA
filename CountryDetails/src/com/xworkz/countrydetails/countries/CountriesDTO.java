package com.xworkz.countrydetails.countries;

import java.io.Serializable;

public class CountriesDTO implements Serializable{

	String countryName;
	long population;
	String presidentName;
	Codes code;
	Continents continents;
	
	public CountriesDTO(String countryName, long population, String presidentName, Codes code, Continents continents) {
		super();
		this.countryName = countryName;
		this.population = population;
		this.presidentName = presidentName;
		this.code = code;
		this.continents = continents;
	}
	
	
	

	public String getName() {
		return countryName;
	}




	public void setName(String name) {
		this.countryName = name;
	}




	public long getPopulation() {
		return population;
	}




	public void setPopulation(long population) {
		this.population = population;
	}




	public String getPresidentName() {
		return presidentName;
	}




	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}


	

	
	public Codes getCode() {
		return code;
	}




	public void setCode(Codes code) {
		this.code = code;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((continents == null) ? 0 : continents.hashCode());
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + (int) (population ^ (population >>> 32));
		result = prime * result + ((presidentName == null) ? 0 : presidentName.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountriesDTO other = (CountriesDTO) obj;
		if (code != other.code)
			return false;
		if (continents != other.continents)
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (population != other.population)
			return false;
		if (presidentName == null) {
			if (other.presidentName != null)
				return false;
		} else if (!presidentName.equals(other.presidentName))
			return false;
		return true;
	}




	@Override
	public String toString() {
		//int codeValues = `Codes.getValue(); can not make static refernce to non static method getValue();
		int codeValue = code.getValue();
		//String continents = continents.getValue() Code will be not readable
		return "CountiesDTO: Country Name: " + countryName + ", Population: " + population + ", President Name: " + presidentName
				+ ", code: " + codeValue + ", continents: " + continents;
	}
	
	
	
}
