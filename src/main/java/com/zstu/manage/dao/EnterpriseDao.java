package com.zstu.manage.dao;

import com.zstu.manage.bean.Enterprise;

import java.util.List;


public interface EnterpriseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    Enterprise selectByEnterpriseNumber(Enterprise record);

    List<Enterprise> selectAll();

    Enterprise getByEnterpriseName(Enterprise record);

    Enterprise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
}