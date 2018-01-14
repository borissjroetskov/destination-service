package com.fabianpoels.destination;

import java.util.ArrayList;
import java.util.List;

public class RootData {

	private final List<Destination> destinations = new ArrayList<>();
	
	public List<Destination> getDestinations() {
		return this.destinations;
	}

	public synchronized void addDestination(Destination d) {
		if (!destinations.contains(d)) {
				destinations.add(d);
		}
		JetstreamDB.instance().storeRequired(destinations);
	}

	public Destination getDestinationByName(String city) {
		Destination dest = destinations.stream().filter(x -> x.getCity().equalsIgnoreCase(city)).findFirst().orElse(null);
		return dest;
	}

	public void generateDestination() {
		Destination dest = new Destination();
		dest.setCity("antwerpen");
		dest.setDescription("charmestad met grote parking");
		addDestination(dest);
	}

}
