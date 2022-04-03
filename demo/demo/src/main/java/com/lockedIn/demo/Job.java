package com.lockedIn.demo;

import javax.persistence.*;

@Entity
public class Job {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int jobId;
	String company;
	String description;
	String skills;

	public Job() {}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompanyId(String companyId) {
		this.company = company;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Job{" +
				"jobId=" + jobId +
				", company=" + company +
				", description='" + description + '\'' +
				'}';
	}
}