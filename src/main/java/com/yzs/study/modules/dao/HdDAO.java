package com.yzs.study.modules.dao;

import java.util.List;

import com.yzs.study.modules.entity.HdEntity;

public interface HdDAO {

	public List<String> qry(HdEntity entity) throws Exception;
}
