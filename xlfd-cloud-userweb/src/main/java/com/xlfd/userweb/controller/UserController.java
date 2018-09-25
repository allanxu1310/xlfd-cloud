package com.xlfd.userweb.controller;

import com.alibaba.fastjson.JSONObject;
import com.xlfd.common.constant.ResponseEnum;
import com.xlfd.domain.user.User;
import com.xlfd.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getUser")
    @ResponseBody
    public JSONObject getUser(@RequestParam String id){
        JSONObject result = new JSONObject();
        User user = userService.getUser(id);
        result.put("user",user);
        result.put("code",ResponseEnum.CODE.getType());
        result.put("msg",ResponseEnum.CODE.getComment());
        return result;
    }
    @PostMapping(value = "/getUser1")
    @ResponseBody
    public JSONObject getUser1(@RequestParam String id){
        JSONObject result = new JSONObject();
        User user = userService.getUser(id);
        result.put("user",user);
        return result;
    }

}
