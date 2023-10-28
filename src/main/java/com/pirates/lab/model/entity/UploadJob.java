package com.pirates.lab.model.entity;

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
@Table(name = "upload_job")
public class UploadJob {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "job_id")
	public int job_id;
	
	@Column(name = "ps_number")
	public String ps_number; 
	
	@Column(name = "job_level")
	public String job_level;
	
	@Column(name = "job_title")
	public String job_title;
	
	@Column(name = "job_description")
	public String job_description;
	
	@Column(name = "eligibility")
	public String eligibility;
	
	@Column(name = "primary_skill")
	public String primary_skill;
	
	@Column(name = "secondary_skill")
	public String secondary_skill;
	
	@Column(name = "other_skills")
	public String other_skills;
	
	@Column(name = "required_experience")
	public int required_experience;
	
	@Column(name = "roles_and_responsibility")
	public String roles_and_responsibility;
	
	@Column(name = "position")
	public String position;
	
	@Column(name = "upload_date")
	public String upload_date;
	
	@Column(name = "status_id")
	public int status_id;
}
