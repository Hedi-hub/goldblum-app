package com.example.goldblumapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfilePageController {

    @RequestMapping("/myProfile")
    public String getProfilePage(){
        return "my-profile";
    }

}
