package se.lexicon.michelle.SpringMVCexercisesandthymeleafweek1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("/index")
    public String index(){

        return "index";
    }
}
