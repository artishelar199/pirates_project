package com.pirates.lab.controller;

import java.util.ArrayList;
import java.util.List;

import com.pirates.lab.dto.upstream.Response;
import com.pirates.lab.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pirates.lab.model.entity.Employee;

@RestController
@RequestMapping("/api/pirates")
public class Controller {

	@Autowired
	private EmployeeService empService;

	@GetMapping("/getAllEmployee")
	public ResponseEntity<Response> getAllEmployee(){
		return ResponseEntity.ok(empService.getAllEmployees());
	}

	@GetMapping("/getEmployeeByPrimarySkill/{primarySkill}")
	public ResponseEntity<Response> getByPrimarySkill(@PathVariable("primarySkill") String primarySkill){
		System.out.println("hello");
		Response response = empService.getEmployeeByPrimarySkill(primarySkill);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/getEmployeeBySecondarySkill/{secondarySkill}")
	public ResponseEntity<Response> getBySecondarySkill(@PathVariable("secondarySkill") String secondarySkill){
		System.out.println("hello");
		Response response = empService.getEmployeeByPrimarySkill(secondarySkill);
		return ResponseEntity.ok(response);
	}
}

