package com.hrm.teacher.service;

import com.hrm.commons.beans.*;
import com.hrm.utils.PageModel;

import java.lang.Class;
import java.util.List;

public interface ITeacherService  {
    List<Course> findCourses();

    List<CourseScore> findCourseScore();



    List<Class> findByClass();

    List<StudentScore> findStudentScore();

    List<StudentScore> findStudentScoreBy(StudentScore st);



    List<ClassScore> findclassscore(String ccn);

    List<StudentMessage> findstudentmessage(String scorecname, PageModel pageModel);

    //int findCount(String sid);
}
