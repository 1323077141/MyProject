package com.zstu.manage.dao;

import com.zstu.manage.bean.Job;

import java.util.List;

public interface JobDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);

    List<Job> getAll();

    List<Job> getByName(Job record);

    List<Job> getAllByEnter(Job record);
}