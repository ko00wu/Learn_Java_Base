package com.demo.service.user;

import com.demo.entity.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}
