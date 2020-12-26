package com.hrm.filter;

import com.hrm.commons.beans.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {

    String [] IG_URI={"/index.jsp","loginForm.jsp","/login","/",".css",".js",".jpg"};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request =(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        String requestURI=request.getRequestURI();
        for(String s:IG_URI)
        {//如果本次请求是不进行过滤的请求
            if(requestURI.endsWith(s)){
               //放行
                filterChain.doFilter(request,response);
                return ;
            }

        }
        //对于其他页面要获取用户登录，信息，
        User login_user= (User) request.getSession().getAttribute("login_user");
        //用户是否登录
        if(login_user!=null){
            //放行
            filterChain.doFilter(request,response);

        }else
        {
            //用户没有登录
            request.setAttribute("login_error","您还没有登录，请登录后访问");
            //request.getRequestDispatcher("/index.jsp").forward(request,response);
        response.sendRedirect("/index.jsp");
            // 我改成了这个，但是这个就不起作用了，     request.setAttribute("login_error","您还没有登录，请登录后访问");，，主要是，不这样的话就会，css样式出不来，
        }
    }

    @Override
    public void destroy() {

    }
}
