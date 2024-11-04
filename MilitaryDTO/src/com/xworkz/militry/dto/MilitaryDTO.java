package com.xworkz.militry.dto;

import java.util.Optional;

public class MilitaryDTO implements Comparable<MilitaryDTO>{
	int id;
	String name;
	String countryMade;
	int manfDate;
	
	public MilitaryDTO(int id, String name, String countryMade, int manfDate) {
		super();
		this.id = id;
		this.name = name;
		this.countryMade = countryMade;
		this.manfDate = manfDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryMade == null) ? 0 : countryMade.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		MilitaryDTO other = (MilitaryDTO) obj;
		if (countryMade == null) {
			if (other.countryMade != null)
				return false;
		} else if (!countryMade.equals(other.countryMade))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MilitaryDTO [id=" + id + ", name=" + name + ", countryMade=" + countryMade + ", manfDate=" + manfDate
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryMade() {
		return countryMade;
	}

	public void setCountryMade(String countryMade) {
		this.countryMade = countryMade;
	}

	public int getManfDate() {
		return manfDate;
	}

	public void setManfDate(int manfDate) {
		this.manfDate = manfDate;
	}

	@Override
	public int compareTo(MilitaryDTO o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, o.id);
	}
	
	
}
