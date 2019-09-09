package com.example.demo.app.request;

import com.example.demo.app.config.UserDetail;
import com.example.demo.app.domainName.entity.AgingColor;
import com.example.demo.app.domainName.entity.AgingStartDate;
import com.example.demo.app.repo.AgingStartDateRepository;

public class RiskAgingAttributeRequest extends BaseRequest {
	private AgingColor agingColor;
	private AgingStartDate agingStartDate;
	
	public RiskAgingAttributeRequest(UserDetail user) {
		super(user);
	}
	public RiskAgingAttributeRequest(UserDetail user, AgingColor agingColor, AgingStartDate agingStartDate) {
		super(user);
		this.agingColor = agingColor;
		this.agingStartDate = agingStartDate;
	}
	public AgingColor getAgingColor() {
		return agingColor;
	}
	public void setAgingColor(AgingColor agingColor) {
		this.agingColor = agingColor;
	}
	public AgingStartDate getAgingStartDate() {
		return agingStartDate;
	}
	public void setAgingStartDate(AgingStartDate agingStartDate) {
		this.agingStartDate = agingStartDate;
	}
	
}
