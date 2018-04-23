package com.zstu.manage.controller;

import com.zstu.manage.service.CoursesService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("/course")
public class CoursesController {
    @Resource
    CoursesService coursesService;



}
