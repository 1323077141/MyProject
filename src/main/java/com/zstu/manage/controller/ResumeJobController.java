package com.zstu.manage.controller;

import com.zstu.manage.service.ResumeJobService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018-04-23.
 */
@Controller("/resumrJob")
public class ResumeJobController {
    @Resource
    ResumeJobService resumeJobService;



}
