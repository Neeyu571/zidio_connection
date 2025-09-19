package com.example.DTO;

import java.util.Date;

import com.example.enums.JobType;

public class JobPostDTO {
	
	public Long id;
	public String jobTitle;
	public JobType jobType;
	public String jobLocation;
	public String jobDescription;
	public String companyName;
	public String postedByEmail;
	public Date postedDate;
	
	
	public JobPostDTO() {}
	public JobPostDTO(Long id,String jobTitle,String jobDescription,String jobLocation,JobType jobType,String companyName,String postedByEmail,Date postedDate) {
		this.id=id;
		this.jobTitle=jobTitle;
		this.jobType=jobType;
		this.jobDescription=jobDescription;
		this.jobLocation=jobLocation;
		this.companyName=companyName;
		this.postedByEmail=postedByEmail;
		this.postedDate=postedDate;
	}

}