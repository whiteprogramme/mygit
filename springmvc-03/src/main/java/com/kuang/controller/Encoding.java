package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Encoding {
    @PostMapping("/springmvc_03_war_exploded/e/t")
   public String test1(String name, Model model) {
       model.addAttribute("msg", name);
       return "hello";
   }
}
