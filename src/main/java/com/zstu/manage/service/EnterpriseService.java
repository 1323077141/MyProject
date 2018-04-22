package com.zstu.manage.service;

import com.zstu.manage.bean.Enterprise;
import com.zstu.manage.util.Msg;

import java.util.List;

public interface EnterpriseService {
    Enterprise login(Enterprise record);
    Boolean register(Enterprise record);
    Boolean update(Enterprise record);
    List<Enterprise> getAll();
    Boolean delete(Integer id);

}
