package com.springboot.thymeleaf.demo.controller;

import com.springboot.thymeleaf.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/user.html")
    public String toUser(Model model){
        model.addAttribute("msg","hello world");

        User smallhead=new User(1L,"小头爸爸",18,new Date(new Date().getTime()-60000),new User());
        User bighead=new User(2L,"大头儿子",18,new Date(),smallhead);
        model.addAttribute("user",smallhead);
        model.addAttribute("bighead",bighead);

        List<User> users = new ArrayList<>(Arrays.asList(smallhead,bighead));
        model.addAttribute("users",users);
        return "user";
    }

}
