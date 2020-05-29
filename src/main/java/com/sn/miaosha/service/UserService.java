package com.sn.miaosha.service;

import com.sn.miaosha.entity.UserDo;

import java.util.List;
import java.util.Map;

public interface UserService {
    UserDo queryuser(Integer id);
    List<UserDo> queryUserInfosForList();
    int saveUser();
}
