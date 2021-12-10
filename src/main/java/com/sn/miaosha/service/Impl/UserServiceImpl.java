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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDo queryUser(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<List<Map<String, Object>>> queryUserInfosForList() throws Exception {
        List<Integer> idList = new ArrayList<>();
        idList.add(100000);
        idList.add(100001);
        idList.add(100003);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("idList", idList);
        List<UserDo> list = userMapper.queryUserInfosForLists(params);
        List<Map<String, Object>> userList = new ArrayList<>();
        for(UserDo userDo : list) {
            userList.add(ConvertUtils.convertObjToMap(userDo));
        }
        return ListUtils.groupList(userList, 4);
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
        int id = UUID.randomUUID().toString().hashCode();
        userDo.setId(id < 0 ? (-id) : id);
        userDo.setUserid(id < 0 ? (-id) : id);
        userDo.setUsername(RandomName.randomName(true, 3));
        userDo.setPassword("123456");
        return userMapper.insert(userDo);
    }
}
