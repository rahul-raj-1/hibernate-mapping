package com.example.hibernatemapping.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Repository
public class ApiCallAndSave2 {
	
	@Autowired
	RestTemplate restTemplate;
	
	void callApi() {
	
	// List of employees ids

	List<Long> employeeList = new ArrayList<Long>();
	employeeList.add(25382l);
	employeeList.add(25426l);
	employeeList.add(25442l);
	employeeList.add(25464l);
	employeeList.add(25476l);

	HttpHeaders requestHeaders = new HttpHeaders();
	// set up HTTP Basic Authentication Header
	requestHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);

	HttpEntity<String> requestEntity = new HttpEntity<>(requestHeaders);

	//for (Long i : employeeList) {

//
//		String url = "http://dummy.restapiexample.com/api/v1/employee/" + i;
//
//		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
//				String.class);
//
//		saveInDatabase(responseEntity);
//		
//		List<ResponseEntity<String>> result = employeeList.parallelStream()
//	            .map(id->restTemplate.exchange("http://dummy.restapiexample.com/api/v1/employee/"+id, HttpMethod.GET, requestEntity, String.class))
//	            .collect(Collectors.toList());
//
//	result.forEach(entity->saveInDatabase(entity));

	//}
}

public synchronized void saveInDatabase(ResponseEntity<String> responseEntity) {

	System.out.println(" Employee Saved " + responseEntity.getBody());
}

}
