package com.pirates.lab.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	
	@Column(name = "ps_number")
	private String ps_number;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "grade")
	private String grade;
	
	@Column(name = "primary_skill_cluster")
	private String primary_skill_cluster;
	
	@Column(name = "primary_skill")
	private String primary_skill;
	
	@Column(name = "secondary_skill")
	private String secondary_skill;
	
	@Column(name = "tertiary_skill")
	private String tertiary_skill;
	
	@Column(name = "other_skills")
	private String other_skills;
	
	@Column(name = "experience")
	private String experience;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "base_location")
	private String base_location;
	
	@Column(name = "reporting_manager")
	private String reporting_manager;
	
	@Column(name = "bench_period")
	private int bench_period;
	
	@Column(name = "billed")
	private boolean billed;

}
