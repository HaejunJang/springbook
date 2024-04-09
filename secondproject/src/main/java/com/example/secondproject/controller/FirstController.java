package com.example.secondproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "장해준");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "장해준");
        return "goodbye";
    }
    @GetMapping("/bye2")
    public String seeYou(Model model) {
        model.addAttribute("nickname", "장해준");
        return "goodbye";
    }
//    @GetMapping("/bye2")
//    public String seeYou(Model model) {
//        model.addAttribute("nickname", "장해준");
//        return "goodbye";
//    }
    //    @GetMapping("/bye2")
//    public String seeYou(Model model) {
//        model.addAttribute("nickname", "장해준");
//        return "goodbye";
//    }
}

