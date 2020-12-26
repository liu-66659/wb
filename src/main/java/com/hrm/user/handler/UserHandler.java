package com.hrm.user.handler;

import com.hrm.commons.beans.Student;
import com.hrm.commons.beans.User;
import com.hrm.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")

public class UserHandler {
    @Autowired
    private IUserService userService;


    @RequestMapping("login")
    public String login(User user, HttpSession session , Model model){
        User login_user= userService.findUserByLoginUser(user);
        System.out.println(login_user);
        if(login_user !=null){
            session.setAttribute("login_user",login_user);
            if("1".equals(login_user.getType()) )

                return "/jsp/teacher.jsp";
             else if("2".equals(login_user.getType()))

               return "/jsp/studentall.jsp";

        }else
        {
              model.addAttribute("login_error","用户名或者密码错误");
            return  "redirect:/index.jsp";
        }
        return "/jsp/error.jsp";

    }
    @RequestMapping("/findUser")

    public  String findUser(HttpSession  session ,Model model){
        User user = (User) session.getAttribute("login_user");
        System.out.println(user);
        Student student=userService.findUser(user);
        System.out.println(student);
        model.addAttribute("student",student);
        return "/jsp/student.jsp";
    }
}
