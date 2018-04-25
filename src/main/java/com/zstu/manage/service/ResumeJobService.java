package com.zstu.manage.service;

import com.zstu.manage.bean.ResumeJob;
import com.zstu.manage.vo.Param;

import java.util.List;

/**
 * Created by Administrator on 2018-04-23.
 */
public interface ResumeJobService {

    Boolean add(ResumeJob record);

    Boolean update(ResumeJob record);

    Boolean delete(Integer id);

    List<ResumeJob> getByStudentId(Integer studentId);

    List getByEnterpriseId(Integer EnterpriseId);

    List<ResumeJob> getAll();

    List getByJobNameAndEnterprise(Param param);

}
