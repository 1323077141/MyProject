package com.zstu.manage.dao;

import com.zstu.manage.bean.StudentCourses;

import java.util.List;

public interface StudentCoursesDao {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentCourses record);

    int insertSelective(StudentCourses record);

    StudentCourses selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentCourses record);

    int updateByPrimaryKey(StudentCourses record);

    List getByStudentId(Integer studentid);

    List<StudentCourses> getAll();
}