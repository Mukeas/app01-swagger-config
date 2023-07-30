package org.jllc.main.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swaggerconfig {
	static {
		System.out.println("jshdkjsahdkj");
	}
	private static final Logger log = LoggerFactory.getLogger(Swaggerconfig.class);

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis((com.google.common.base.Predicate<RequestHandler>) RequestHandlerSelectors
						.basePackage("org.jllc.main.controller"))
				.paths((com.google.common.base.Predicate<String>) PathSelectors.any()).build();
	}
}
