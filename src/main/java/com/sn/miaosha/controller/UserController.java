package com.sn.miaosha.controller;

import com.sn.miaosha.entity.UserDo;
import com.sn.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public UserDo getUser(Integer id) {
        UserDo userDo = userService.queryuser(id);
        return userDo;
    }

    @RequestMapping("/saveUser")
    @ResponseBody
    public String saveUser() {
        int success = userService.saveUser();
        if(success>0) {
            return "成功保存" + success + "条数据";
        } else {
            return "保存失败";
        }
    }

    @RequestMapping("/userList")
    @ResponseBody
    public List<UserDo> userList() {
        List<UserDo> list = userService.queryUserInfosForList();
        return list;
    }

    @RequestMapping("/index")
    public String index() {
        return "freemarker/index";
    }
}
