 package org.jllc.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SwageerCon {
	private static final Logger log = LoggerFactory.getLogger(SwageerCon.class);
 
	@GetMapping
	public String getMessage() {
		log.info("------------controller----------");
		return "hello Swagger";
	}
}
