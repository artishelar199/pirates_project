package com.pirates.lab.service;

import com.pirates.lab.dto.upstream.Response;

public interface EmployeeService {

	public Response getAllEmployees();

	public Response getEmployeeByPrimarySkill(String primarySkill);
}
