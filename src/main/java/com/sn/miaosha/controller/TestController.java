package com.sn.miaosha.controller;

import com.alibaba.druid.support.json.JSONUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: XuJiuCheng
 * @date: Created in 13:43 2021/12/6
 * @description:
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping(value = "/test")
    public String test(String str) {
        return JSONUtils.toJSONString(str);
    }
}
