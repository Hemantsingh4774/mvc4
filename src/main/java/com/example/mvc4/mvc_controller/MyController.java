package com.example.mvc4.mvc_controller;

import com.example.mvc4.mvcmodel.User;
import com.example.mvc4.mvcmodel.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class MyController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/addpage")
    public String addUser(){
        return "useradd";  // refering to the useradd jsp
    }

    @GetMapping("/")
    public String viewData(Model model){
        ArrayList<User> namereturn = (ArrayList<User>) userRepo.findAll();
        for(User u:namereturn){
            System.out.println("Name :"+u.getName());
        }
        model.addAttribute("users",namereturn);
        System.out.println(namereturn);


        return "index";
    }

    @PostMapping("/add")
    public String addUser1(@ModelAttribute("user") User user){
        userRepo.save(user);
        return "redirect:/";
    }
    @GetMapping("/deleteuser/{idx}")
    public String deleteUser(@PathVariable("idx")long user_id){
        userRepo.deleteById(user_id);
        return "redirect:/";
    }
//
//    public String updateUser(){
//
//    }
}
// id name age address hobby