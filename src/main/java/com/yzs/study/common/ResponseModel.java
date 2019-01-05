package com.yzs.study.common;

import org.springframework.ui.ModelMap;

public class ResponseModel extends ModelMap{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2916036607121960380L;

	public ResponseModel() {
		setCode("0");
	}
	
	public ResponseModel(String code) {
		setCode(code);
	}
	
	public ResponseModel(String code, String msg) {
		setCode(code);
		setMsg(msg);
	}

	public String getCode() {
		return (String) get("code");
	}

	public void setCode(String code) {
		put("code", code);
	}

	public String getMsg() {
		return (String) get("msg");
	}

	public void setMsg(String msg) {
		put("msg", msg);
	}
	
}
