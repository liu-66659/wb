package com.hrm.teacher.service;

import com.hrm.commons.beans.*;
import com.hrm.teacher.dao.ITeacherDao;
import com.hrm.utils.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.Class;
import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {
    @Resource
    private ITeacherDao teacherDao;

    @Override
    public List<Course> findCourses() {
        return teacherDao.selectCourses();
    }

    @Override
    public List<CourseScore> findCourseScore() {
        return teacherDao.selectCourseScore();
    }

    @Override
    public List<Class> findByClass() {
        return teacherDao.selectByClass();
    }

    @Override
    public List<StudentScore> findStudentScore() {
        return teacherDao.findStudentScore();
    }

    @Override
    public List<StudentScore> findStudentScoreBy(StudentScore st) {
        return teacherDao.selectStudentScoreBy(st);
    }

    @Override
    public List<ClassScore> findclassscore(String ccn) {
        return teacherDao.selectclassscore(ccn);
    }

    @Override
    public List<StudentMessage> findstudentmessage(String scorecname, PageModel pageModel) {
        return teacherDao.selectfindstudentmessage(scorecname,pageModel);
    }

   /* @Override
    public int findCount(String sid) {
        return teacherDao.selectCount(sid);
    }
    */


}
