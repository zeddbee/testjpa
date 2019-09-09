package com.example.demo.app.response;

import java.util.List;

import com.example.demo.app.config.UserDetail;
import com.example.demo.app.domainName.entity.AgingColor;
import com.example.demo.app.domainName.entity.AgingStartDate;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RiskAgingAttributeResponse extends BaseResponse {

	private String responseMessage;
	private List<AgingColor> agingColor;
	private List<AgingStartDate> agingStartDate;
	@JsonProperty("SavedByInformation")
	private UserDetail user;

	public RiskAgingAttributeResponse() {

	}

	public RiskAgingAttributeResponse(String errorMessage, String errorCode, String responseMessage,
			List<AgingColor> agingColor, List<AgingStartDate> agingStartDate, UserDetail user) {
		super(errorMessage, errorCode);
		this.responseMessage = responseMessage;
		this.agingColor = agingColor;
		this.agingStartDate = agingStartDate;
		this.user = user;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
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

	public UserDetail getUser() {
		return user;
	}

	public void setUser(UserDetail user) {
		this.user = user;
	}

}
