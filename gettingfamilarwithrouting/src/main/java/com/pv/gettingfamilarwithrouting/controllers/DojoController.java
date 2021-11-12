package com.pv.gettingfamilarwithrouting.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	
//	@RequestMapping("/{dojo}")
//	public String dojo(@PathVariable("dojo") String dojo)
//		return "The dojo is awesome!";
	
	@RequestMapping("")
	public String dojo() {
		return "The dojo is awesome!";
	}
	
	@RequestMapping("/{location}")
	public String location(@PathVariable("location") String locationName) {
		if( locationName == "burbank") {
			return locationName + " dojo is located in Sothern California";
		}
		if( locationName == "san-jose") {
			return locationName + " dojo is the headquarters";
		}		
			else {
				return "hi friend.";
			}
	}

}
