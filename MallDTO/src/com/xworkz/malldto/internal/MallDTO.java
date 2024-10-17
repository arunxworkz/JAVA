package com.xworkz.malldto.internal;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor

public class MallDTO implements Serializable, Comparable<MallDTO>{
	
	int id;
	String name;
	Location location;
	String owner;
	int landDimension;
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
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getLandDimension() {
		return landDimension;
	}
	public void setLandDimension(int landDimension) {
		this.landDimension = landDimension;
	}
	@Override
	public String toString() {
		return "Id: " + id + ", Name: " + name + ", Location: " + location + ", Owner: " + owner
				+ ", Land Dimension: " + landDimension +" sq feet";
	}
	@Override
	public int compareTo(MallDTO o) {
		
		return Integer.compare(this.id, o.id);
	}	
}
