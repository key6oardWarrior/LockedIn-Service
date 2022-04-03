package com.lockedIn.demo;

import java.util.HashMap;

public class UserInfo {
	private HashMap<Integer, JobInfo> jobInfo = new HashMap<Integer, JobInfo>();
	private String name;
	private Integer uid;

	public UserInfo(Integer uid) { this.uid = uid; }

	final public String getName() { return name; }

	final public void setName(String name) { this.name = name; }

	final public int getUid() { return uid; }
}