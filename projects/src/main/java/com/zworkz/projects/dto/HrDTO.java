package com.zworkz.projects.dto;

import java.io.Serializable;

public class HrDTO implements Serializable{

	String name;
	String email;
	String location;
	int experience;
	String qulification;
	public HrDTO(String name, String email, String location, int experience, String qulification) {
		super();
		this.name = name;
		this.email = email;
		this.location = location;
		this.experience = experience;
		this.qulification = qulification;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getQulification() {
		return qulification;
	}
	public void setQulification(String qulification) {
		this.qulification = qulification;
	}

	@Override

	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((email == null) ? 0 : email.hashCode());
	    result = prime * result + experience; // Directly include experience as an int
	    result = prime * result + ((location == null) ? 0 : location.hashCode());
	    result = prime * result + ((name == null) ? 0 : name.hashCode());
	    result = prime * result + ((qulification == null) ? 0 : qulification.hashCode());
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
	    HrDTO other = (HrDTO) obj;
	    if (email == null) {
	        if (other.email != null)
	            return false;
	    } else if (!email.equals(other.email))
	        return false;
	    // No need to check for null since experience is primitive int
	    if (experience != other.experience)
	        return false;
	    if (location == null) {
	        if (other.location != null)
	            return false;
	    } else if (!location.equals(other.location))
	        return false;
	    if (name == null) {
	        if (other.name != null)
	            return false;
	    } else if (!name.equals(other.name))
	        return false;
	    if (qulification == null) {
	        if (other.qulification != null)
	            return false;
	    } else if (!qulification.equals(other.qulification))
	        return false;
	    return true;
	}

	@Override
	public String toString() {
		return "HrDTO [name=" + name + ", email=" + email + ", location=" + location + ", experience=" + experience
				+ ", qulification=" + qulification + "]";
	}

	
	
	
}
