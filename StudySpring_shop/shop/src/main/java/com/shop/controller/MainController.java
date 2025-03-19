package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    //MemberController.java에서 return "redirect:/";하면 메인으로 넘어감.
    @GetMapping(value = "/")
    public String main(){
        return "main";
    }
}
