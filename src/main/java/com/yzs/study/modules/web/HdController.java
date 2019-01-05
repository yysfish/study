package com.yzs.study.modules.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yzs.study.common.BaseController;
import com.yzs.study.common.ResponseModel;
import com.yzs.study.modules.service.HdService;

@RestController
@RequestMapping("/hd")
public class HdController extends BaseController{

	@Autowired
	private HdService hdservice;
	
	@RequestMapping("/qry")
	public ResponseModel qry() throws Exception {
		try {
			hdservice.qry();
			return getSuccessModel();
		} catch (Exception e) {
			System.out.println(e);
			return getErrorModel(e);
		}
	}
	
	@RequestMapping("/qry1")
	public ResponseModel qry1(@RequestParam(required=true) String cn) throws Exception {
		try {
			hdservice.qry1(cn);
			return getSuccessModel();
		} catch (Exception e) {
			System.out.println(e);
			return getErrorModel(e);
		}
	}
}
