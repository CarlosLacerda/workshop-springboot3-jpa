package com.carloslacerda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carloslacerda.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
