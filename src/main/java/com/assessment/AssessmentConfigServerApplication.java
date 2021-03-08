package com.assessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AssessmentConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentConfigServerApplication.class, args);
	}

}
