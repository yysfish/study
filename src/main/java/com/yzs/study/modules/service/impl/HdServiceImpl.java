package com.yzs.study.modules.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzs.study.common.ResponseCodeException;
import com.yzs.study.modules.dao.HdDAO;
import com.yzs.study.modules.entity.HdEntity;
import com.yzs.study.modules.service.HdService;

@Service
public class HdServiceImpl implements HdService{

	@Autowired
	private HdDAO hdDAO;
	
	String[] cityList = new String[] {
//		"四川","江苏","上海","北京","浙江",
			"广东","山东","安徽"
	};
	
	public void qry() throws Exception {
		for(String name : cityList) {
			qry1(name);
		}
		
	}
	
	public void qry1(String cityName) throws Exception {
		HdEntity entity = new HdEntity();
		entity.setCityName(cityName);

		entity.setPhoneType("YD");
		write(getName(cityName, "YD"), list2Str(hdDAO.qry(entity)));

		entity.setPhoneType("LT");
		write(getName(cityName, "LT"), list2Str(hdDAO.qry(entity)));

		entity.setPhoneType("DX");
		write(getName(cityName, "DX"), list2Str(hdDAO.qry(entity)));


	}
	
	private String getName(String cityName, String phoneType) throws Exception {
		return new StringBuilder(cityName).
			append("YD".equals(phoneType) ? "移动" :"LT".equals(phoneType) ? "联通" : "电信").
			append(".txt").
			toString();
	}
	
	private String list2Str(List<String> list) throws Exception{
		if (list == null) {
			throw new ResponseCodeException("未找到对应的号段");			
		}
		StringBuilder sb = new StringBuilder();
		for(String str:list) {
			sb.append(';').append(str);
		}
		return sb.substring(1);
	}
	
	private void write(String name, String content) throws Exception{
		String base = "C:\\Users\\005\\Desktop\\hd\\";
		File file = new File(base + name);
		if (file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file);
		writer.write(content);
		writer.close();
	}


}
