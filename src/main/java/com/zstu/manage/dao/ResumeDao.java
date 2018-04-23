package com.zstu.manage.dao;

import com.zstu.manage.bean.Resume;

import java.util.List;

public interface ResumeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Resume record);

    int insertSelective(Resume record);

    Resume selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);

    List<Resume> getByStudentId(Integer studentid);
}