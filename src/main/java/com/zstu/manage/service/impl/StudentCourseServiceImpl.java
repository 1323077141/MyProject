package com.zstu.manage.service.impl;

import com.zstu.manage.bean.Courses;
import com.zstu.manage.bean.Student;
import com.zstu.manage.bean.StudentCourses;
import com.zstu.manage.dao.CoursesDao;
import com.zstu.manage.dao.StudentCoursesDao;
import com.zstu.manage.dao.StudentDao;
import com.zstu.manage.service.StudentCourseService;
import com.zstu.manage.util.ExcelUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;

@Service
public class StudentCourseServiceImpl implements StudentCourseService {

    @Resource
    private StudentCoursesDao studentCoursesDao;

    @Resource
    private StudentDao studentDao;

    @Resource
    private CoursesDao coursesDao;

    @Override
    public Boolean add(StudentCourses record) {
        studentCoursesDao.insertSelective(record);
        return true;
    }

    @Override
    public List getByStudentId(Integer studentid) {
        return studentCoursesDao.getByStudentId(studentid);
    }

    @Override
    public Boolean importFile(InputStream in, MultipartFile file) throws Exception {
        List<List<Object>> listob = ExcelUtils.getBankListByExcel(in,file.getOriginalFilename());
        for(int i = 0; i < listob.size(); i++){
            List<Object> ob = listob.get(i);
            StudentCourses item = new StudentCourses();
            String studentNumber = String.valueOf(ob.get(0));
            String coursename = String.valueOf(ob.get(1));
            Float Score = Float.parseFloat(String.valueOf(ob.get(2)));
            Student stu = new Student();
            stu.setStudentnumber(studentNumber);
            Courses cour = new Courses();
            cour.setCoursename(coursename);
            item.setCourseid(coursesDao.getByName(cour).getId());
            item.setCoursename(coursename);
            item.setStudentid(studentDao.getByStuNum(stu).getId());
            item.setStudentnumber(studentNumber);
            item.setScore(Score);
            studentCoursesDao.insertSelective(item);
        }
        return true;
    }

    @Override
    public List<StudentCourses> getAll() {
        return studentCoursesDao.getAll();
    }
}
