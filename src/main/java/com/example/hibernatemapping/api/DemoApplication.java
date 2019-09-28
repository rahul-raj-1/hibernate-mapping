package com.example.hibernatemapping.api;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class DemoApplication implements CommandLineRunner {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired 
	private CallApi callApi;

	public static void main(String[] args) {
	  SpringApplication.run(DemoApplication.class, args);
	/*	new SpringApplicationBuilder(DemoApplication.class)
		.properties("spring.config.name:application1")
		.build()
		.run(args);
		*/
		

		// to run app from command prompt run
		// $ java -jar hibernate-map-demo-0.0.1-SNAPSHOT.war
	}

	@Override
	public void run(String... args) throws Exception {


		List<Long> employeeList = new ArrayList<Long>();
		
		for(long i=25412;i<29412;i++)
		{
		employeeList.add(i);
		}
		
		
		System.out.println(" list size is " + employeeList.size());
		
		
		
		long startTime = System.currentTimeMillis();



		
		

	//   callApi.callApis(employeeList);
		
		long endTime = System.currentTimeMillis();

		
		
		System.out.println("That took " + (endTime - startTime) + " milliseconds");

			
	
	}

}
