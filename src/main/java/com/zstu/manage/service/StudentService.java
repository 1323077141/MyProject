package com.zstu.manage.service;

import com.zstu.manage.bean.Student;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

public interface StudentService {

    Boolean add(Student student);
    Boolean update(Student student);
    Student getByStudentNumber(Student student);
    Student getById(Integer id);
    Boolean importStudent(InputStream in, MultipartFile file) throws Exception;

}
