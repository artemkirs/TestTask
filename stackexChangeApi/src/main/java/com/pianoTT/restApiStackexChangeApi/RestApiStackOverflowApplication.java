package com.pianoTT.restApiStackexChangeApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.pianoTT.restApiStackexChangeApi", "com.painoTT.worker"})
public class RestApiStackOverflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiStackOverflowApplication.class, args);
	}


}
