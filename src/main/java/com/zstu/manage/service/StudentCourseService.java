package com.zstu.manage.service;

import com.zstu.manage.bean.StudentCourses;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

public interface StudentCourseService {

    Boolean add(StudentCourses record);

    List getByStudentId(Integer studentid);

    Boolean importFile(InputStream in,MultipartFile file) throws Exception;

    List<StudentCourses> getAll();

}
