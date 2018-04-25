package com.zstu.manage.dao;

import com.zstu.manage.bean.ResumeJob;
import com.zstu.manage.vo.Param;

import java.util.List;

public interface ResumeJobDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeJob record);

    int insertSelective(ResumeJob record);

    ResumeJob selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeJob record);

    int updateByPrimaryKey(ResumeJob record);

    List<ResumeJob> getAll();

    List<ResumeJob> getByStudentId(Integer studentid);

    List getByEnterpriseId(Integer enterpriseId);

    List getByJobNameAndEnterprise(Param param);

}