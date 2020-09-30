package com.example.hibernate.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="external/emp")
public class ExternalController {
	@Value("${restUrl}")
	String url;
	
	@GetMapping(value="/hello")
	public ResponseEntity<?> getEmployees(){
		System.out.println(url);
		RestTemplate rest= new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		String response =rest.getForObject(url,String.class);
	//	ResponseEntity<Employee[]> response=rest.getForEntity(url, Employee[].class);
	
		return ResponseEntity.ok(response);
		
		}
//	@GetMapping(value="/{id}")
//	public ResponseEntity<?> getEmployees(@PathVariable int id){
//		
//		
//	}

}
