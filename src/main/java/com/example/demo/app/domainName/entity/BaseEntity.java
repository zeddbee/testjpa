package com.example.demo.app.domainName.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity implements Serializable{

   private static final long serialVersionUID = 1L;
	
	@Column(name = "created_on")
    private Date createdOn;
 
    @Column(name = "created_by")
    private String createdBy;
}
