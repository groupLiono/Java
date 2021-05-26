package com.example.second.service.impl;

import com.example.second.dao.CourseDao;
import com.example.second.entity.Course;
import com.example.second.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
//@Transactional(rollbackFor = Exception.class)
public class CourseServiceBean implements CourseService {

    @Autowired
    private CourseDao courseDao;

    //@Autowired
    //private CourseCountDao courseCountDao;

    //@Autowired
    //CourseCopyDao courseCopyDao;

    public List<Course> findAllCourses() {
        return this.courseDao.findAllCourses();
    }


    @Transactional
    public void addCourse(Course course) {
        this.courseDao.addCourse(course);
//        this.courseCopyDao.addCourse(course);
     //   Integer count = this.courseDao.getCountCourses();
   //     this.courseCountDao.addCount(count);
    }

    public void deleteCourseById(Long uid) {
        this.courseDao.deleteCourseById(uid);
        Integer count = this.courseDao.getCountCourses();
        //this.courseCountDao.addCount(count);
    }

    public void updateCourse(Course course) {
        this.courseDao.updateCourse(course);
    }

    public List<Course> findCourseByName(String name) {
        return this.courseDao.findCourseByName(name);
    }

    public Integer deleteCoursesByIds(Integer[] ids) {
        return this.courseDao.deleteCoursesByIds(ids);
    }

}
