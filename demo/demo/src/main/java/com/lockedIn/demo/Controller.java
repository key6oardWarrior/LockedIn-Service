package com.lockedIn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {
	private Users users;

	@Autowired
	public Controller() {
		users = new Users();
	}

	@RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserInfo> getUser(final HttpServletRequest httpServletRequest, @PathVariable String id) {
		HttpHeaders rrsp = new HttpHeaders();
		rrsp.set("Headers", "Value");

		return new ResponseEntity<UserInfo>(users.getUserInfo(Integer.valueOf(id)), rrsp, HttpStatus.I_AM_A_TEAPOT);
	}

	@RequestMapping(value = "/getUser/{id}", method = RequestMethod.POST)
	public ResponseEntity<String> setUser(UserInfo user) {
		users.setUserInfo(user.getUid(), user);
		return new ResponseEntity<String>("Success", HttpStatus.I_AM_A_TEAPOT);
	}
}