package com.zstu.manage.service;

import com.zstu.manage.bean.EnterpriseStudent;

import java.util.List;

/**
 * Created by Administrator on 2018-04-23.
 */
public interface EnterpriseStudentService {
    List<EnterpriseStudent> getAll();

    List<EnterpriseStudent> getByStudentId(Integer id);

    Boolean update(EnterpriseStudent record);

    Boolean insert(EnterpriseStudent record);

    Boolean delete(Integer id);

    List<EnterpriseStudent> getByState(EnterpriseStudent record);
}
