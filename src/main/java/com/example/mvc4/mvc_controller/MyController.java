package com.example.mvc4.mvc_controller;

import com.example.mvc4.mvcmodel.User;
import com.example.mvc4.mvcmodel.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/add")
    public String addUser(){
        return "useradd";  // refering to the useradd jsp
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("/add")
    public String addUser1(@ModelAttribute("user") User user){
        userRepo.save(user);
        return "index";
    }
}
