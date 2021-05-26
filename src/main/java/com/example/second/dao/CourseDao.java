package com.example.second.dao;

import com.example.second.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component(value = "CourseDao")
public interface CourseDao {

    List<Course> findAllCourses();

    int deleteCourseById(Long uid);

    int insert(Course cqnu);

    int addCourse(Course cqnu);

    Course selectByPrimaryKey(Long uid);

    int updateCourse(Course cqnu);

    int updateByPrimaryKey(Course cqnu);

    List<Course> findCourseByName(String name);

    Integer deleteCoursesByIds(@Param("ids") Integer[] ids);

    int getCountCourses();
}
