package com.hrm.user.dao;

import com.hrm.commons.beans.Student;
import com.hrm.commons.beans.User;

public interface IUserDao {
    User selectUserByLoginUser(User user);

    Student selectUser(User user);
}
