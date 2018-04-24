package com.zstu.manage.dao;

import com.zstu.manage.bean.ResumeJob;

import java.util.List;

public interface ResumeJobDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeJob record);

    int insertSelective(ResumeJob record);

    ResumeJob selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeJob record);

    int updateByPrimaryKey(ResumeJob record);

    List<ResumeJob> getAll();

}