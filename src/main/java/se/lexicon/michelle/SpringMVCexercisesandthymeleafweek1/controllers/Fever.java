package se.lexicon.michelle.SpringMVCexercisesandthymeleafweek1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Fever {

    private String temperatureResult;

    @GetMapping("/feverCheck")
    public String feverCheck(){

        return "feverCheck";
    }

    @PostMapping("/feverCheck")
    public String feverCheck(@RequestParam("temperature") String temperature){

        String replaceTemp = temperature.replace(",", ".");

        double temp = Double.parseDouble(replaceTemp);

        if(temp < 35){
            temperatureResult = "You Have Hypothermia";
        }else if(temp >= 35 && temp < 38){
            temperatureResult = "Your Temperature Is Normal";
        }else{
            temperatureResult = "You Have A Fever";
        }
        return "redirect:/tempResult";
    }

    @GetMapping("/tempResult")
    public String tempResult(Model model){
        model.addAttribute("temperatureResult", temperatureResult );

        return "tempResult";
    }

}
