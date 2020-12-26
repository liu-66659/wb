package com.hrm.user.service;

import com.hrm.commons.beans.Student;
import com.hrm.commons.beans.User;
import com.hrm.user.dao.IUserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements  IUserService {
   @Resource
    private IUserDao userDao;

    @Override
    public User findUserByLoginUser(User user) {
        return  userDao.selectUserByLoginUser(user);
    }

    @Override
    public Student findUser(User user) {
        return userDao.selectUser(user);
    }
}
