package com.xlfd.userweb.controller;

import com.alibaba.fastjson.JSONObject;
import com.xlfd.api.entity.User;
import com.xlfd.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * user controller
 * @auther Allan
 * @date 2018/9/17 19:04
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getUser(String id){
        JSONObject result = new JSONObject();
        User user = userService.getUser(id);
        result.put("user",user);
        return result;
    }
}
