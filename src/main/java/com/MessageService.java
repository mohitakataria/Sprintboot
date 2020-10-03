package com;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class MessageService {
		
		@GetMapping("/uppercase/{s1}")
		public String uppercase(@PathVariable("s1") String s1) {
			return s1.toUpperCase();
		}
		
		@GetMapping("/lowercase/{s1}")
		public String lowercase(@PathVariable("s1") String s1) {
			return s1.toLowerCase();
		}
		
		@GetMapping("/concat/{s1}/{s2}")
		public String concat(@PathVariable("s1") String s1, @PathVariable("s2") String s2) {
			return s1.concat(s2);
		}
		
		@GetMapping("/substring/{s1}")
		public String substring(@PathVariable("s1") String s1) {
			return s1.substring(0, 2);
		}
		
		@GetMapping("/trim/{s1}")
		public String trim(@PathVariable("s1") String s1) {
			return s1.trim();
		}
	}