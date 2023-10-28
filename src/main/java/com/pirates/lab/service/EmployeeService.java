package com.pirates.lab.service;

import com.pirates.lab.dto.upstream.Response;

public interface EmployeeService {

	public Response getAllEmployees();

	public Response getEmployeeByPrimarySkill(String primarySkill);
	
	public Response getEmployeeBySecondarySkill(String secondarySkill);
	
	public Response getEmployeeByTertiarySkill(String tertiarySkill);
	
	public Response getEmployeeByGrade(String grade);
	
	public Response getEmployeeByExperience(String experience);
}
