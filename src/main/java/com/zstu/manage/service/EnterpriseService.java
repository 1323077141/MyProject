package com.zstu.manage.service;

import com.zstu.manage.bean.Enterprise;
import org.springframework.stereotype.Service;

@Service
public interface EnterpriseService {
    Enterprise login(Enterprise record);
}
