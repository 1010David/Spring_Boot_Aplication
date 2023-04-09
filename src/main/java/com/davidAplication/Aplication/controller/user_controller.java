package com.davidAplication.Aplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class user_controller {
    
    @GetMapping("/")
        public String index(){
            return "index";
    }
    @GetMapping("/userForm")
        public String userForm(){
            return "user_form/user_view";
    }

}
