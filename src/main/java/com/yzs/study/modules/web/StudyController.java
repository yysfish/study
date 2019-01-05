package com.yzs.study.modules.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzs.study.common.BaseController;
import com.yzs.study.common.ResponseModel;

@RestController
@RequestMapping("/study")
public class StudyController extends BaseController{

	@RequestMapping("/getInfo")
	public ResponseModel getInfo() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("1234");
		list.add("qwerr");
		list.add("XZCvX");
		list.add("adsgd");
		list.add("jhl tyr");
		list.add("nbmfdsg");
		return getSuccessModel(list);
	}
}
