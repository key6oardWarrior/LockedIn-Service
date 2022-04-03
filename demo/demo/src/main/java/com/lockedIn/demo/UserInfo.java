package com.lockedIn.demo;

import java.util.HashMap;

public class UserInfo {

	private String name;
	private Integer jid;

	public UserInfo(Integer jid) { this.jid = jid; }

	final public String getName() { return name; }

	final public void setName(String name) { this.name = name; }

	final public int getUid() { return jid; }
}