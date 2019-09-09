package com.example.demo.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.app.domainName.entity.AgingStartDate;

@Repository
public interface AgingStartDateRepository extends JpaRepository<AgingStartDate, Long> {

	
	List<AgingStartDate> findByStartDateType(String startDateType);
}