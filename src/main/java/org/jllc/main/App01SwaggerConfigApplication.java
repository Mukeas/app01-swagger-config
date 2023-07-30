package org.jllc.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class App01SwaggerConfigApplication {
	private static final Logger log = LoggerFactory.getLogger(App01SwaggerConfigApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(App01SwaggerConfigApplication.class, args);
		log.info("----------Start main Class-------------");
	}

	

}
