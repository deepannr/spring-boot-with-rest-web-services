package com.spring.boot.micro.services.filter.staticc;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "hideField1", "hideField2" })
class FilterFields {
	private String showField1;

	private String hideField1;

	private String hideField2;

	@JsonIgnore
	private String hideField3;

	public FilterFields(String showField1, String hideField1, String hideField2, String hideField3) {
		super();
		this.showField1 = showField1;
		this.hideField1 = hideField1;
		this.hideField2 = hideField2;
		this.hideField3 = hideField3;
	}

	public String getShowField1() {
		return showField1;
	}

	public void setShowField1(String showField1) {
		this.showField1 = showField1;
	}

	public String getHideField1() {
		return hideField1;
	}

	public void setHideField1(String hideField1) {
		this.hideField1 = hideField1;
	}

	public String getHideField2() {
		return hideField2;
	}

	public void setHideField2(String hideField2) {
		this.hideField2 = hideField2;
	}

	public String getHideField3() {
		return hideField3;
	}

	public void setHideField3(String hideField3) {
		this.hideField3 = hideField3;
	}
}
