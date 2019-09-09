package com.example.demo.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.app.domainName.entity.AgingColor;

@Repository
public interface AgingColorRepository extends JpaRepository<AgingColor, Long> {

	List<AgingColor> findByAgeColorName(String ageColorName);
	
}
