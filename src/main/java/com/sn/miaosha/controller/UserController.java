package com.sn.miaosha.controller;

import com.sn.miaosha.entity.UserDo;
import com.sn.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    private String NAMESPACE_URL = "freemarker/userlist";

    @RequestMapping("userInfos")
    public String userInfos(ModelMap modelMap) throws Exception{
        modelMap.put("users", userService.queryUsersForList());
        modelMap.put("title", "用户信息");
        return NAMESPACE_URL;
    }

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
    public List<List<Map<String, Object>>> userList() throws Exception {
        List<List<Map<String, Object>>> list = userService.queryUserInfosForList();
        return list;
    }

    @RequestMapping("/index")
    public String index() {
        return "freemarker/index";
    }
}
