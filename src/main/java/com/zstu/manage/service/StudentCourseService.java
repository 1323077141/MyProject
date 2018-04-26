package com.zstu.manage.service;

import com.zstu.manage.bean.StudentCourses;

import java.util.List;

public interface StudentCourseService {

    Boolean add(StudentCourses record);

    List getByStudentId(Integer studentid);

}
