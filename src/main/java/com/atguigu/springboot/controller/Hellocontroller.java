package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hellocontroller {

        @RequestMapping("/abc")
        public String helloController(Model model){
            model.addAttribute("msg","你好success.jsp");
            return "success";
        }
}
