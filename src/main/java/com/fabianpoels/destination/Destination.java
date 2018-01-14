package com.fabianpoels.destination;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Destination {

	private long id;
	private String city;
	private String description;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object d) {
		if ((d instanceof Destination) && this.city.equalsIgnoreCase(((Destination) d).getCity())) {
			return true;
		} else {
			return false;
		}
	}
	
}
