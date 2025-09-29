package com.example.DTO;

public class AnalysticsResponse {
	
	public Long totalAuth;
	public Long totalStudents;
	public Long totalRecruiters;
	public Long totalJobPosts;
	public Long totalApplications;
    public Long totalAdmins;
	public Long totalFileUpload;
	public Long  totalEmails;
	public Long totalSubscriptionPlan;
	public Long totalPayment;
	public Long totalUserPayment;
	
	
	
	public AnalysticsResponse() {}
	
	public AnalysticsResponse( Long totalAuth,Long totalStudents,Long totalRecruiters, Long totalJobPosts, Long totalApplications,Long totalAdmins,Long totalFileUplaod,Long totalEmails,Long totalSubscriptionPlan, Long totalPayment, Long totalUserPayment ) {
		this.totalAuth=totalAuth;
		this.totalStudents=totalStudents;
		this.totalRecruiters=totalRecruiters;
		this.totalJobPosts=totalJobPosts;
		this.totalApplications=totalApplications;
        this.totalAdmins=totalAdmins;
		this.totalFileUpload=totalFileUplaod;
		this.totalEmails=totalEmails;
		this.totalSubscriptionPlan = totalSubscriptionPlan;
		this.totalPayment = totalPayment;
		this.totalUserPayment = totalUserPayment;
	}

	public Long getTotalAuth() {
		return totalAuth;
	}

	public void setTotalAuth(Long totalAuth) {
		this.totalAuth = totalAuth;
	}

	public Long getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(Long totalStudents) {
		this.totalStudents = totalStudents;
	}

	public Long getTotalRecruiters() {
		return totalRecruiters;
	}

	public void setTotalRecruiters(Long totalRecruiters) {
		this.totalRecruiters = totalRecruiters;
	}

	public Long getTotalJobPosts() {
		return totalJobPosts;
	}

	public void setTotalJobPosts(Long totalJobPosts) {
		this.totalJobPosts = totalJobPosts;
	}

	public Long getTotalApplications() {
		return totalApplications;
	}

	public void setTotalApplications(Long totalApplications) {
		this.totalApplications = totalApplications;
	}

	public Long getTotalAdmins() {
		return totalAdmins;
	}

	public void setTotalAdmins(Long totalAdmins) {
		this.totalAdmins = totalAdmins;
	}

	public Long getTotalFileUpload() {
		return totalFileUpload;
	}

	public void setTotalFileUpload(Long totalFileUpload) {
		this.totalFileUpload = totalFileUpload;
	}

	public Long getTotalEmails() {
		return totalEmails;
	}

	public void setTotalEmails(Long totalEmails) {
		this.totalEmails = totalEmails;
	}

	public Long getTotalSubscriptionPlan() {
		return totalSubscriptionPlan;
	}

	public void setTotalSubscriptionPlan(Long totalSubscriptionPlan) {
		this.totalSubscriptionPlan = totalSubscriptionPlan;
	}

	public Long getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(Long totalPayment) {
		this.totalPayment = totalPayment;
	}

	public Long getTotalUserPayment() {
		return totalUserPayment;
	}

	public void setTotalUserPayment(Long totalUserPayment) {
		this.totalUserPayment = totalUserPayment;
	}
	
	


	

}