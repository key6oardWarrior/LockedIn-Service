package com.lockedIn.demo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends CrudRepository<Job, Integer> {
	public User findById(int id);
	public List<Job> findAll();
}