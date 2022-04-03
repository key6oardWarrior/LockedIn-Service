package com.lockedIn.demo;

import javax.persistence.*;


public class MatchingJob {


	//private int jobId;
	private int userId;


	//@OneToOne
	//@OneToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name="matching_job_id", referencedColumnName="job_id")
	//	//@OneToOne(mappedBy="jobId", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	//
	//	//@PrimaryKeyJoinColumn(name = "job_id")
	//@OneToOne
	private Job job;

	public MatchingJob() {}



	//public int getJobId() {
	//	return jobId;
	//}

	//public void setJobId(int jobId) {
	//	this.jobId = jobId;
	//}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
}