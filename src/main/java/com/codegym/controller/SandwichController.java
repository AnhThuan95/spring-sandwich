package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @GetMapping("/")
    public String show(){
        return "index";
    }

    @GetMapping("/save")
    public String save(@RequestParam String lettuce, String tomato, String mustard, String sprouts, Model model){
        if (!(lettuce == null))
            model.addAttribute("lettuce", "- Lettuce");
        if (!(tomato == null))
            model.addAttribute("tomato", "- Tomato");
        if (!(mustard == null))
            model.addAttribute("mustard", "- Mustard");
        if (!(sprouts == null))
            model.addAttribute("sprouts", "- Sprouts");
        return "result";
    }
}
