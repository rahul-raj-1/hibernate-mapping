package com.example.hibernatemapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		// to run app from command prompt run
		//$ java -jar hibernate-map-demo-0.0.1-SNAPSHOT.war
	}

}

