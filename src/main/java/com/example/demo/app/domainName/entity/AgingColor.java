package com.example.demo.app.domainName.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AGING_COLOR")
public class AgingColor extends BaseEntity {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="AGING_COLOR_ID")
	private Long id;
	
	@Column(name="AGE_LEVEL")
	private String ageLevel;
	
	@Column(name="AGE_DESCRIPTION")
	private String ageDesc;
	
	@Column(name="AGE_COLOR_NAME")
	private String ageColorName;
	
	
	public AgingColor() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAgeLevel() {
		return ageLevel;
	}


	public void setAgeLevel(String ageLevel) {
		this.ageLevel = ageLevel;
	}


	public String getAgeDesc() {
		return ageDesc;
	}


	public void setAgeDesc(String ageDesc) {
		this.ageDesc = ageDesc;
	}


	public String getAgeColorName() {
		return ageColorName;
	}


	public void setAgeColorName(String ageColorName) {
		this.ageColorName = ageColorName;
	}
	
	
	
}
