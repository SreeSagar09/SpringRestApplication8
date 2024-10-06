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
		ResponseEntity<Object> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<Object>(object, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@PostMapping(path = "/postProduct")
	public ResponseEntity<Product> postProduct(@RequestBody Product product){
		ResponseEntity<Product> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<Product>(product, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Product>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@PostMapping(path = "/postData")
	public ResponseEntity<Map<String, Object>> postData(@RequestBody Map<String, Object> data){
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@PostMapping(path = "/postList")
	public ResponseEntity<List<Object>> postList(@RequestBody List<Object> list){
		ResponseEntity<List<Object>> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<List<Object>>(list, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<List<Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@PostMapping(path = "/postSet")
	public ResponseEntity<Set<Object>> postSet(@RequestBody Set<Object> set){
		ResponseEntity<Set<Object>> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<Set<Object>>(set, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Set<Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@PostMapping(path = "/postMessage")
	public ResponseEntity<String> postMessage(@RequestBody String message){
		ResponseEntity<String> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@PostMapping(path = "/postProperties")
	public ResponseEntity<Properties> postProperties(@RequestBody Properties properties){
		ResponseEntity<Properties> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<Properties>(properties, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Properties>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@PostMapping(path = "/postDataOptional")
	public ResponseEntity<Map<String, Object>> postDataOptional(@RequestBody(required = false) Map<String, Object> data){
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
}
