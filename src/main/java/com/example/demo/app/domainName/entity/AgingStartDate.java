package com.example.demo.app.domainName.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AGING_START_DATE")
public class AgingStartDate  extends BaseEntity{

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="AGING_START_DATE_ID")
	private Long id;
	
	@Column(name="START_DATE_DESC")
	private String startDateDesc;
	
	@Column(name="START_DATE")
	private String startDateType;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="EXISTING_COMMENT")
	private String existingComment;

	
	public AgingStartDate() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStartDateDesc() {
		return startDateDesc;
	}

	public void setStartDateDesc(String startDateDesc) {
		this.startDateDesc = startDateDesc;
	}

	public String getStartDateType() {
		return startDateType;
	}

	public void setStartDateType(String startDateType) {
		this.startDateType = startDateType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getExistingComment() {
		return existingComment;
	}

	public void setExistingComment(String existingComment) {
		this.existingComment = existingComment;
	}

	
}
