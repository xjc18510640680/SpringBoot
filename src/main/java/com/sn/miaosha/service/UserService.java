package com.sn.miaosha.service;

import com.sn.miaosha.entity.UserDo;

import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    UserDo queryuser(Integer id);

    /**
     * 查询所有用户list
     * @return
     * @throws Exception
     */
    List<List<Map<String, Object>>> queryUserInfosForList() throws Exception;

    /**
     * 查询所有用户list
     * @return
     * @throws Exception
     */
    List<Map<String, Object>> queryUsersForList() throws Exception;

    /**
     * 保存用户
     * @return
     */
    int saveUser();
}
