package com.zstu.manage.service;

import com.zstu.manage.bean.Enterprise;
import com.zstu.manage.util.Msg;

public interface EnterpriseService {
    Msg login(Enterprise record);

    Boolean register(Enterprise record);

}
