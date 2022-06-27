package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {
    @RequestMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为" + res);
        return "hello";
    }
    @RequestMapping(value = "h2", method = {RequestMethod.GET})
    public String test2(Model model) {
        model.addAttribute("msg" ,"h1");
        return "hello";
    }
    @RequestMapping("m1/t1")
    public String test3(Model model) {
        model.addAttribute("msg", "周有斌");
        return "hello";
    }
}
