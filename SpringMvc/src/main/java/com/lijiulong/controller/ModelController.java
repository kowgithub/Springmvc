package com.lijiulong.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/model")
public class ModelController {

    @RequestMapping("/index")
    public String model(Model model){
        model.addAttribute("a","a");
        return "success";
    }
}
