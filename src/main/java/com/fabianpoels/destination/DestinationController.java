package com.fabianpoels.destination;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> create(@RequestBody Destination d) {
		JetstreamDB.instance().root().addDestination(d);;
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
