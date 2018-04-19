package com.zstu.manage.dao;

import com.zstu.manage.bean.EnterpriseStudent;

public interface EnterpriseStudentDao {
    int deleteByPrimaryKey(Integer id);

    int insert(EnterpriseStudent record);

    int insertSelective(EnterpriseStudent record);

    EnterpriseStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EnterpriseStudent record);

    int updateByPrimaryKey(EnterpriseStudent record);
}