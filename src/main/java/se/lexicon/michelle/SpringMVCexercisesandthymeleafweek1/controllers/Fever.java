package se.lexicon.michelle.SpringMVCexercisesandthymeleafweek1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
Create a Fever controller and methods with views to handle the following
• Ask the user for their body temperature
• Show the user if they have fever /normal / hyperthermia based on body temperature and treatment if needed
• Use Model
• You may not use JavaScript
 */

@Controller
public class Fever {

    @GetMapping("/feverCheck")
    public String feverCheck(){

        return "feverCheck";
    }

}
