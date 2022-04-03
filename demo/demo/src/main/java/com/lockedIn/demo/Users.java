package com.lockedIn.demo;

import java.util.HashMap;

public class Users {
	private HashMap<Integer, UserInfo> users = new HashMap<Integer, UserInfo>();

	public Users() {}

	final UserInfo getUserInfo(final Integer uid) {
		return users.get(uid);
	}

	final void setUserInfo(int uid, final UserInfo userInfo) {
		users.replace(uid, userInfo);
	}
}