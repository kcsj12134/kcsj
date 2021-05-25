package com.example.second.service.impl;

import com.example.second.dao.TeacherDao;
import com.example.second.entity.Teacher;
import com.example.second.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class TeacherServiceBean implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;



    public List<Teacher> findAllTeachers() {
        return this.teacherDao.findAllTeachers();
    }


    @Transactional
    public void addTeacher(Teacher teacher) {
        this.teacherDao.addTeacher(teacher);
//        this.teacherCopyDao.addTeacher(teacher);
        Integer count = this.teacherDao.getCountTeachers();
    }

    public void deleteTeacherById(Long uid) {
        this.teacherDao.deleteTeacherById(uid);
        Integer count = this.teacherDao.getCountTeachers();
    }

    public void updateTeacher(Teacher teacher) {
        this.teacherDao.updateTeacher(teacher);
    }

    public List<Teacher> findTeacherByName(String name) {
        return this.teacherDao.findTeacherByName(name);
    }

    public Integer deleteTeachersByIds(Integer[] ids) {
        return this.teacherDao.deleteTeachersByIds(ids);
    }

}
