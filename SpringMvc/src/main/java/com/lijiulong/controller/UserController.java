package com.lijiulong.controller;


import com.lijiulong.model.User;
import com.lijiulong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getuser")
    public User getUser(HttpServletRequest request, HttpServletResponse response){
        return userService.getUserById(Integer.parseInt(request.getParameter("id")));
    }
}
