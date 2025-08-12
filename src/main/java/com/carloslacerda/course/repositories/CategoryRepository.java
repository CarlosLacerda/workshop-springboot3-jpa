package com.carloslacerda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carloslacerda.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
