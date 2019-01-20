package com.lijiulong.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class PageController {


    @RequestMapping(value = "/index")
    public String success(HttpServletRequest request, HttpServletResponse response) {
        return "/success";
    }
}
