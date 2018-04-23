package com.zstu.manage.service;

import com.zstu.manage.bean.ResumeJob;

import java.util.List;

/**
 * Created by Administrator on 2018-04-23.
 */
public interface ResumeJobService {

    Boolean add(ResumeJob record);

    Boolean update(ResumeJob record);

    Boolean delete(ResumeJob record);

    List<ResumeJob> getByStudentId(Integer studentId);

    List<ResumeJob> getByEnterpriseId(Integer EnterpriseId);



}
