package com.example.hibernatemapping.api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ApiCallAndSave {
	
	@Autowired
	RestTemplate restTemplate;

	@PostConstruct
	public void v()
	{
		
		System.out.println( " in v method ------");
	}
	
	
	@PreDestroy
	public void v1()
	{
		
		System.out.println( " in v1 method ------");
	}
	
	@Async("ConcurrentTaskExecutor")
    public Future<ResponseEntity<String>> getEmployee(long employeeId) {
		
		HttpHeaders requestHeaders = new HttpHeaders();
		// set up HTTP Basic Authentication Header
		requestHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);

		HttpEntity<String> requestEntity = new HttpEntity<>(requestHeaders);
		
    	System.out.println( "thread is " +Thread.currentThread().getName());


	       String url = "http://dummy.restapiexample.com/api/v1/employee/" + employeeId;
	       ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
	                String.class);
	       return new AsyncResult<ResponseEntity<String>>(responseEntity);
	   }
	
	
	   
    
	


}
