package com.app.controller;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Product;

@RestController
@RequestMapping(path = "/app")
public class ApplicationController {
	
	@PostMapping(path = "/postObject")
	public ResponseEntity<Object> postObject(@RequestBody Object object){
		ResponseEntity<Object> responseEntity = new ResponseEntity<Object>(object, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@PostMapping(path = "/postProduct")
	public ResponseEntity<Product> postProduct(@RequestBody Product product){
		ResponseEntity<Product> responseEntity = new ResponseEntity<Product>(product, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@PostMapping(path = "/postData")
	public ResponseEntity<Map<String, Object>> postData(@RequestBody Map<String, Object> data){
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@PostMapping(path = "/postList")
	public ResponseEntity<List<Object>> postList(@RequestBody List<Object> list){
		ResponseEntity<List<Object>> responseEntity = new ResponseEntity<List<Object>>(list, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@PostMapping(path = "/postSet")
	public ResponseEntity<Set<Object>> postSet(@RequestBody Set<Object> set){
		ResponseEntity<Set<Object>> responseEntity = new ResponseEntity<Set<Object>>(set, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@PostMapping(path = "/postMessage")
	public ResponseEntity<String> postMessage(@RequestBody String message){
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@PostMapping(path = "/postProperties")
	public ResponseEntity<Properties> postProperties(@RequestBody Properties properties){
		ResponseEntity<Properties> responseEntity = new ResponseEntity<Properties>(properties, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@PostMapping(path = "/postDataOptional")
	public ResponseEntity<Map<String, Object>> postDataOptional(@RequestBody(required = false) Map<String, Object> data){
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		
		return responseEntity;
	}
	
}
