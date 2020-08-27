package se.lexicon.michelle.SpringMVCexercisesandthymeleafweek1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {

    private List<String> strings = new ArrayList<>();

    @GetMapping("/index")
    public String index(){

        return "index";
    }

   @GetMapping("/contact")
    public String contact(){

        return "contact";
    }

    @PostMapping("/contact")
    public String contact( @RequestParam("input") String input){

        strings.add(input);
        return "contact";
    }

    @GetMapping("/contactList")
    public String contactList(Model model){
        model.addAttribute("strings", strings);
        return "contactList";
    }

    @GetMapping("/about")
    public String about(){

        return "about";
    }
}
