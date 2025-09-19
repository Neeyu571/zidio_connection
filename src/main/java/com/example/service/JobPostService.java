package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.JobPostDTO;
import com.example.entity.JobPost;
import com.example.enums.JobType;
import com.example.repository.JobPostRepository;

@Service

public class JobPostService {

	@Autowired
	private JobPostRepository jobPostRepository;
	
	public JobPostDTO postJob(JobPostDTO dto) {
		JobPost jobPost = new JobPost();
				
		jobPost.setId(dto.id);
		jobPost.setJobTitle(dto.jobTitle);
		jobPost.setCompanyName(dto.companyName);
		jobPost.setJobDescription(dto.jobDescription);
		jobPost.setJobLocation(dto.jobLocation);
		jobPost.setJobType(dto.jobType);
		jobPost.setPostedByEmail(dto.postedByEmail);
		jobPost.setPostedDate(dto.postedDate);
		
		
		JobPost saved =jobPostRepository.save(jobPost);
		return mapToDTO(saved);
	}
	
	public List<JobPostDTO>getByPostedByEmail(String email){
		return jobPostRepository.findByPostedByEmail(email).stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	public List<JobPostDTO>getByJobTitle(String jobTitle){
		return jobPostRepository.findByJobTitle(jobTitle).stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public List<JobPostDTO>getByJobType(JobType jobType){
		return jobPostRepository.findByJobType(jobType).stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	public List<JobPostDTO>getByCompanyName(String companyName){
		return jobPostRepository.findByCompanyName(companyName).stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	private JobPostDTO mapToDTO(JobPost job) {
		return new JobPostDTO(
				job.getId(),
				job.getJobTitle(),
				job.getJobDescription(),
				job.getJobLocation(),
				job.getJobType(),
				job.getCompanyName(),
				job.getPostedByEmail(),
				job.getPostedDate()
				);
	}
}