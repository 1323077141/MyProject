package com.zstu.manage.service;

import com.zstu.manage.bean.Job;

import java.util.List;

public interface JobService {
    List<Job> getAll();

    List<Job> getByName(Job job);

    List<Job> getByEnterprise(Job job);

    Boolean update(Job job);

    Boolean insert(Job job);

    Boolean delete(Integer id);

}
