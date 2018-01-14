package com.fabianpoels.destination;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/destinations")
public class DestinationController {

	@GetMapping
	public List<Destination> getDestinations() {
		return JetstreamDB.instance().root().getDestinations();
	}
	
	@GetMapping("/{city}")
	public Destination getDestination(@PathVariable String city) {
		return JetstreamDB.instance().root().getDestinationByName(city);
	}
	
	@GetMapping("/generate")
	public String generate() {
		JetstreamDB.instance().root().generateDestination();
		return "generated!";
	}
}
