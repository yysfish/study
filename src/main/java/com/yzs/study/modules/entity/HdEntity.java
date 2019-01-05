package com.yzs.study.modules.entity;

import java.io.Serializable;

public class HdEntity implements Serializable{

	private String top7;
	
	private String code;
	
	private String phoneType;
	
	private String cityCode;
	
	private String cityName;

	public String getTop7() {
		return top7;
	}

	public void setTop7(String top7) {
		this.top7 = top7;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}
