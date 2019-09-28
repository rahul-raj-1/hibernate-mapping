package com.example.hibernatemapping.api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CallApi {

	@Autowired
	private ApiCallAndSave apiCallAndSave;

	static int counter = 0;

	public void callApis(List<Long> employeeList) {

		// Do async calls and store futures in a List
		List<Future<ResponseEntity<String>>> futures = new ArrayList<>();
		for (Long id : employeeList) {
			
			futures.add(apiCallAndSave.getEmployee(id));

			 System.out.println( " futured added --" + counter++);
		}

		// Then process list of future
	/*	for (Future<ResponseEntity<String>> future : futures)
			try {

				System.out.println("saveInDatabase getting called ");

				saveInDatabase(future.get());
			} catch (Exception e) {
				e.printStackTrace();
			} */
	}

	public void saveInDatabase(ResponseEntity<String> responseEntity) {

		counter++;
		System.out.println(" Employee Saved " + counter + " --" + responseEntity.getBody());
	}

}
