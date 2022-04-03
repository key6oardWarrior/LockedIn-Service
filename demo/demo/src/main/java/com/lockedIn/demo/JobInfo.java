package com.lockedIn.demo;

import java.util.ArrayList;

public class JobInfo {
	private String position;
	private int pay;
	private boolean isHourly;
	private String location;
	private ArrayList<String> hardSkills = new ArrayList<String>();
	private ArrayList<String> softSkills = new ArrayList<String>();

	public JobInfo() {}

	/**
	 * @returns The job's position
	 */
	final public String getPos() { return position; }

	final public int getPay() { return pay; }

	final public boolean getIsHourly() { return isHourly; }

	final public String getLocation() { return location; }

	final public ArrayList<String> getSoftSkills() { return hardSkills; }

	final public ArrayList<String> getHardSkills() { return hardSkills; }

	/**
	 * Set the position of a job
	 *
	 * @param pos The job's position
	 */
	final public void setPos(final String pos) { position = pos; }

	final public void setPay(final int pay) { this.pay = pay; }
	
	final public void setIsHourly(final boolean isHourly) {
		this.isHourly = isHourly;
	}

	final public void setLocation(final String location) {
		this.location = location;
	}
	
	final public void setHardSkills(final ArrayList<String> hardSkills) {
		this.hardSkills = hardSkills;
	}

	final public void setSoftSkills(final ArrayList<String> softSkills) {
		this.softSkills = softSkills;
	}
}