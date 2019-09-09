package com.example.demo.app.dto;

import java.util.List;

import com.example.demo.app.domainName.entity.AgingColor;
import com.example.demo.app.domainName.entity.AgingStartDate;

public class RiskAgingAttribute {
	private List<AgingColor> agingColor;
	private List<AgingStartDate> agingStartDate;
	public RiskAgingAttribute(List<AgingColor> agingColor, List<AgingStartDate> agingStartDate) {
		super();
		this.agingColor = agingColor;
		this.agingStartDate = agingStartDate;
	}
	public RiskAgingAttribute() {
		super();
	}
	public List<AgingColor> getAgingColor() {
		return agingColor;
	}
	public void setAgingColor(List<AgingColor> agingColor) {
		this.agingColor = agingColor;
	}
	public List<AgingStartDate> getAgingStartDate() {
		return agingStartDate;
	}
	public void setAgingStartDate(List<AgingStartDate> agingStartDate) {
		this.agingStartDate = agingStartDate;
	}
}
