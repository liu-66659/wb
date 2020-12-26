package com.hrm.teacher.handler;

import com.hrm.commons.beans.*;
import com.hrm.teacher.dao.ITeacherDao;
import com.hrm.teacher.service.ITeacherService;
import com.hrm.utils.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.lang.Class;
import java.util.List;

@Controller
@RequestMapping("/course")
public class TeacherHandler {
    @Autowired
    private ITeacherService teacherService;

    @RequestMapping("/findcourse")
    public String findcourse(Model model)
    {
        List<Course> courses=teacherService.findCourses();
        for(Course c:courses)
        {
            System.out.println(c);
        }
        model.addAttribute("courses",courses);
        return "/jsp/teacher/couse.jsp";
    }
    @RequestMapping("/findcoursescore")
    public String findcoursescore(Model model){
        List<CourseScore> cs=teacherService.findCourseScore();
        model.addAttribute("cs",cs);
        return "/jsp/teacher/coursescore.jsp";
    }
    @RequestMapping("/findclass")
    public String findclass(Model model){
        List<Class> cl=teacherService.findByClass();
        model.addAttribute("cl",cl);
        return "/jsp/teacher/class.jsp";

    }
    @RequestMapping("/findstudentscore")
    public String findstudentscore( Model model)
    {
        List<StudentScore>sts =teacherService.findStudentScore();
      for(StudentScore s:sts)
      {
          System.out.println(s);
      }
        model.addAttribute("sts",sts);
        return "/jsp/teacher/studentscore.jsp";
    }
@RequestMapping("findStudentScoreBy")
   public String   findStudentScoreBy(Model model, StudentScore st){
    System.out.println(st);
        List<StudentScore>sts =teacherService.findStudentScoreBy(st);
    for(StudentScore s:sts)
    {
        System.out.println(s);
    }
    model.addAttribute("st",st);
    model.addAttribute("sts",sts);
    return "/jsp/teacher/studentscore.jsp";
}


@RequestMapping("/findclassscore")
    public String findclassscore(String ccn,Model model){
        System.out.println(ccn);
        List<ClassScore>classes = teacherService.findclassscore(ccn);
        ClassScore classscore=new ClassScore();
        int total =classes.size();
        if(total!=0){
            System.out.println("一共有多少条数据"+total);
            double  scoreuall=0;
            double scoretall=0;
            double scoregrade=0;
            for(ClassScore c:classes)
            {
                classscore.setClassid(c.getClassid());
                classscore.setSclass(c.getSclass());
                scoreuall=scoreuall+c.getScoreu();
                scoretall=scoretall+c.getScoret();
                scoregrade=scoregrade+c.getScoregrade();
                System.out.println(c);
            }
            double scoreuaverage =scoreuall/total;
             double scoretaverage =scoretall/total;
            double scoregradeaverage=scoregrade/total;
            System.out.println(scoreuaverage);
            System.out.println(scoretaverage);
            classscore.setScoreu(scoreuall);
            classscore.setScoret(scoretall);
            classscore.setScoregrade(scoregrade);
            classscore.setScoreuaverage(scoreuaverage);
            classscore.setScoretaverage(scoretaverage);
            classscore.setScoregradeaverage(scoregradeaverage);
            System.out.println(classscore);
            model.addAttribute("classscore",classscore);
            model.addAttribute("ccn",ccn);
        }

        return "/jsp/teacher/classscore.jsp";
}


    @RequestMapping("/findstudentmessage")
    public String findstudentmessage(@RequestParam(defaultValue="1")int pageIndex, Model model, String scorecname){
        System.out.println(scorecname);
        PageModel pageModel =new PageModel();
        pageModel.setPageIndex(pageIndex);
        List <StudentMessage> stm=teacherService.findstudentmessage(scorecname,pageModel);
        for(StudentMessage  s: stm)
        {
            System.out.println(s);
        }
        int recordCount= stm.size();//teacherService.findCount(sid);
        System.out.println("几条数据"+recordCount);
        pageModel.setRocordCount(recordCount);
        model.addAttribute("pageModel",pageModel);
        model.addAttribute("stm",stm);
        model.addAttribute("scorecname",scorecname);
        return "/jsp/teacher/stmessage.jsp";
    }
@RequestMapping("/loginout")
    public  String loginout(HttpSession session,Model model){
    session.removeAttribute("login_user");
    model.addAttribute("login_error","退出成功，请重新登录");
    return "redirect:/index.jsp";///我改成重定向，不然出了不了css
}

}
