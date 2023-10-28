package com.pirates.lab.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pirates.lab.model.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query(value = "select e from employee e", nativeQuery = true)
	public List<Employee> findEmployees();

	@Query(value = "select * from employee e where e.primary_skill = :primarySkill", nativeQuery = true)
	public List<Employee> findEmployeeByPrimarySkill(@Param("primarySkill") String primarySkill);
	
	@Query(value = "select * from employee e where e.secondary_skill = :secondarySkill", nativeQuery = true)
	public List<Employee> findEmployeeBySecondarySkill(@Param("secondarySkill") String secondarySkill);
}
