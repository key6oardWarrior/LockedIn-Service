package com.lockedIn.demo;
import com.lockedIn.demo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User, Integer> {
	public User findById(int id);
}