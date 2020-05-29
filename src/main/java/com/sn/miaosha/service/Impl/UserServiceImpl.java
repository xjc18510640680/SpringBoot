package com.sn.miaosha.service.Impl;

import com.sn.miaosha.common.ConvertUtils;
import com.sn.miaosha.common.ListUtils;
import com.sn.miaosha.common.RandomName;
import com.sn.miaosha.entity.UserDo;
import com.sn.miaosha.mapper.UserMapper;
import com.sn.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDo queryuser(Integer id) {
        UserDo userDo = userMapper.selectByPrimaryKey(id);
        return userDo;
    }

    @Override
    public List<List<Map<String, Object>>> queryUserInfosForList() throws Exception {
        List<List<Map<String, Object>>> result = ListUtils.groupList(queryUserInfos(), 4);
        return result;
    }

    @Override
    public List<Map<String, Object>> queryUsersForList() throws Exception {
        return queryUserInfos();
    }

    private List<Map<String, Object>> queryUserInfos() throws Exception{
        List<UserDo> list = userMapper.queryUserInfosForList();
        // List<UserDo>转List<Map<String, Object>>
        List<Map<String, Object>> userList = new ArrayList<>();
        for(UserDo userDo : list) {
            userList.add(ConvertUtils.convertObjToMap(userDo));
        }
        return userList;
    }

    @Override
    public int saveUser() {
        UserDo userDo = new UserDo();
        Integer id = UUID.randomUUID().toString().hashCode();
        userDo.setId(id < 0 ? (-id) : id);
        userDo.setUserid(id < 0 ? (-id) : id);
        userDo.setUsername(RandomName.randomName(true, 3));
        userDo.setPassword("123456");
        int success = userMapper.insert(userDo);
        return success;
    }
}
