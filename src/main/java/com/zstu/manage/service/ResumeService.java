package com.zstu.manage.service;

import com.zstu.manage.bean.Resume;

import java.util.List;

/**
 * Created by Administrator on 2018-04-23.
 */
public interface ResumeService {

    List<Resume> getByStudentId(Integer studentId);

    Resume getByResumeId(Integer id);

    Boolean add(Resume resume);

    Boolean delete(Integer id);

    Boolean update(Resume resume);
}
