package com.zstu.manage.service.impl;

import com.zstu.manage.bean.Student;
import com.zstu.manage.dao.StudentDao;
import com.zstu.manage.service.StudentService;
import com.zstu.manage.util.ExcelUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentDao studentDao;


    @Override
    public Boolean add(Student student) {
        studentDao.insertSelective(student);
        return true;
    }

    @Override
    public Boolean update(Student student) {
        studentDao.updateByPrimaryKeySelective(student);
        return true;
    }

    @Override
    public Student getByStudentNumber(Student student) {
        return studentDao.getByStuNum(student);
    }


    @Override
    public Boolean importStudent(InputStream in, MultipartFile file) throws Exception{
        List<List<Object>> listob = ExcelUtils.getBankListByExcel(in,file.getOriginalFilename());
        for(int i = 0; i < listob.size(); i++){
            List<Object> ob = listob.get(i);
            Student item = new Student();
            item.setStudentnumber(String.valueOf(ob.get(0)));
            item.setStudentname(String.valueOf(ob.get(1)));
            item.setTelephone(String.valueOf(ob.get(2)));
            item.setAddress(String.valueOf(ob.get(3)));
            item.setAcdemy(String.valueOf(ob.get(4)));
            item.setClassname(String.valueOf(ob.get(5)));
            item.setEmail(String.valueOf(ob.get(6)));
            item.setSex(String.valueOf(ob.get(7)));
            studentDao.insertSelective(item);
        }
        return true;
    }


    @Override
    public Student getById(Integer id) {
        return studentDao.selectByPrimaryKey(id);
    }
}
