package com.yzs.study.common;

import java.util.Map;

public class BaseController {

	
	public ResponseModel getSuccessModel() {
		ResponseModel model = new ResponseModel();
		model.setCode("000000");
		model.setMsg("success");
		return model;
	}
	
	public ResponseModel getSuccessModel(Object data) {
		ResponseModel model = getSuccessModel();
		model.put("data", data);
		return model;
	}
	
	
	public ResponseModel getSuccessModel(Map<String, Object> map) {
		ResponseModel model = getSuccessModel();
		if (map != null) {
			model.putAll(map);			
		}
		return model;
	}
	
	public ResponseModel getErrorModel(Exception e) {
		if (e instanceof ResponseCodeException) {
			ResponseCodeException codeException = (ResponseCodeException) e;
			return new ResponseModel(codeException.getCode(), codeException.getMessage());
		} else {
			return new ResponseModel("9999", "system error");
		}
	}
}
