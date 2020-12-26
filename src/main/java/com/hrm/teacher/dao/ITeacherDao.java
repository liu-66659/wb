package com.hrm.teacher.dao;

import com.hrm.commons.beans.*;
import com.hrm.utils.PageModel;
import org.apache.ibatis.annotations.Param;

import java.lang.Class;
import java.util.List;

public interface ITeacherDao {
    List<Course> selectCourses();

    List<CourseScore> selectCourseScore();

    List<Class> selectByClass();

    List<StudentScore> findStudentScore();

    List<StudentScore> selectStudentScoreBy(StudentScore st);

    List<ClassScore> selectclassscore(String ccn);

    int selectCount(String sid);

    List<StudentMessage> selectfindstudentmessage(@Param("scorecname")String scorecname,@Param("pageModel") PageModel pageModel);
}
