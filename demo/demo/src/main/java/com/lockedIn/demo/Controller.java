package com.lockedIn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class Controller {

	@Autowired
	private JobRepo jobRepo;

	@Autowired
	private IUserRepo userRepo;

	public Controller() {}

	@RequestMapping(value = "/getJobsList/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<Job>> getJobsLst(final HttpServletRequest httpServletRequest, @PathVariable int id) {
		List<Job> jobsList = jobRepo.findAll();
		return new ResponseEntity<List<Job>>(jobsList, HttpStatus.OK);
	}

	@RequestMapping(value = "/getJob/{id}", method = RequestMethod.GET)
	public ResponseEntity<Job> getJobsLst2(final HttpServletRequest httpServletRequest, @PathVariable String id) {
		HttpHeaders rrsp = new HttpHeaders();
		rrsp.set("Headers", "Value");
		final int uid = Integer.valueOf(id.substring(id.indexOf('-')+1));

		List<Job> jobsList = jobRepo.findAll();
		for(Job job : jobsList) {
			if(job.getJobId() == uid) {
				return new ResponseEntity<Job>(job, HttpStatus.OK);
			}
		}

		return new ResponseEntity<Job>(jobsList.get(0), HttpStatus.OK);
	}
}