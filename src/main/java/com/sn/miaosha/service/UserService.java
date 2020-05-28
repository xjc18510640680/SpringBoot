package com.sn.miaosha.service;

import com.sn.miaosha.entity.UserDo;

public interface UserService {
    UserDo queryuser(Integer id);
    int saveUser();
}
