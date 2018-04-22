package com.zstu.manage.service;

import com.zstu.manage.bean.Manager;


public interface ManagerService {
    Boolean update(Manager record);

    Manager selectByName(Manager record);
}
