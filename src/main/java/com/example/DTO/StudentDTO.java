package com.example.DTO;

import com.example.enums.ExperienceLevel;
import com.example.enums.Gender;
import com.example.enums.NoticePeriod;
import com.example.enums.PreferredJobLocation;
import com.example.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

public class StudentDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String qualification;
    private String resumeURL;
    private Set<String> skills;
    private String githubURL;
    private String linkedinURL;
    private ExperienceLevel experienceLevel;
    private Gender gender;
    private Integer graduationYear;
    private Set<PreferredJobLocation> preferredJobLocations;
    private Double expectedSalary;
    private NoticePeriod noticePeriod;
    private String projects;
    @JsonIgnore
    private User user;  // ✅ include User for relation

    // -------- Constructors --------
    public StudentDTO() {}

    public StudentDTO(Long id, String name, String email, String phone, String qualification,
                      String resumeURL, Set<String> skills, String githubURL, String linkedinURL,
                      ExperienceLevel experienceLevel, Gender gender, Integer graduationYear,
                      Set<PreferredJobLocation> preferredJobLocations, Double expectedSalary,
                      NoticePeriod noticePeriod, String projects, User user) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.qualification = qualification;
        this.resumeURL = resumeURL;
        this.skills = skills;
        this.githubURL = githubURL;
        this.linkedinURL = linkedinURL;
        this.experienceLevel = experienceLevel;
        this.gender = gender;
        this.graduationYear = graduationYear;
        this.preferredJobLocations = preferredJobLocations;
        this.expectedSalary = expectedSalary;
        this.noticePeriod = noticePeriod;
        this.projects = projects;
        this.user = user;
    }

    // -------- Getters & Setters --------
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }

    public String getResumeURL() { return resumeURL; }
    public void setResumeURL(String resumeURL) { this.resumeURL = resumeURL; }

    public Set<String> getSkills() { return skills; }
    public void setSkills(Set<String> skills) { this.skills = skills; }

    public String getGithubURL() { return githubURL; }
    public void setGithubURL(String githubURL) { this.githubURL = githubURL; }

    public String getLinkedinURL() { return linkedinURL; }
    public void setLinkedinURL(String linkedinURL) { this.linkedinURL = linkedinURL; }

    public ExperienceLevel getExperienceLevel() { return experienceLevel; }
    public void setExperienceLevel(ExperienceLevel experienceLevel) { this.experienceLevel = experienceLevel; }

    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    public Integer getGraduationYear() { return graduationYear; }
    public void setGraduationYear(Integer graduationYear) { this.graduationYear = graduationYear; }

    public Set<PreferredJobLocation> getPreferredJobLocations() { return preferredJobLocations; }
    public void setPreferredJobLocations(Set<PreferredJobLocation> preferredJobLocations) { this.preferredJobLocations = preferredJobLocations; }

    public Double getExpectedSalary() { return expectedSalary; }
    public void setExpectedSalary(Double expectedSalary) { this.expectedSalary = expectedSalary; }

    public NoticePeriod getNoticePeriod() { return noticePeriod; }
    public void setNoticePeriod(NoticePeriod noticePeriod) { this.noticePeriod = noticePeriod; }

    public String getProjects() { return projects; }
    public void setProjects(String projects) { this.projects = projects; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
