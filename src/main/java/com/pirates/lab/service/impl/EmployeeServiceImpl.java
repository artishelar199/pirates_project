package com.pirates.lab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pirates.lab.dto.upstream.Data;
import com.pirates.lab.dto.upstream.Response;
import com.pirates.lab.dto.upstream.Status;
import com.pirates.lab.model.entity.Employee;
import com.pirates.lab.model.repository.EmployeeRepository;
import com.pirates.lab.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public Response getAllEmployees() {
		// TODO Auto-generated method stub
		Response response = new Response();
		Status status = new Status();
		Data data = new Data<List<Employee>>();
		data.setValue(empRepo.findEmployees());
		response.setData(data);
		response.setStatus(Status.builder()
				.httpCode(200)
				.message("Success")
				.description("success")
				.build());
		return response;
	}

	@Override
	public Response getEmployeeByPrimarySkill(String primarySkill) {
		Response response = new Response();
		Status status = new Status();
		Data data = new Data<List<Employee>>();
		data.setValue(empRepo.findEmployeeByPrimarySkill(primarySkill));
		response.setData(data);
		response.setStatus(Status.builder()
				.httpCode(200)
				.message("Success")
				.description("success")
				.build());
		return response;
	}

	@Override
	public Response getEmployeeBySecondarySkill(String secondarySkill) {
		Response response = new Response();
		Status status = new Status();
		Data data = new Data<List<Employee>>();
		data.setValue(empRepo.findEmployeeBySecondarySkill(secondarySkill));
		response.setData(data);
		response.setStatus(Status.builder()
				.httpCode(200)
				.message("Success")
				.description("success")
				.build());
		return response;
	}

}
