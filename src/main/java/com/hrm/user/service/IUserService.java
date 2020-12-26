package com.hrm.user.service;

import com.hrm.commons.beans.Student;
import com.hrm.commons.beans.User;

public interface IUserService {
    User findUserByLoginUser(User user);

    Student findUser(User user);
}
