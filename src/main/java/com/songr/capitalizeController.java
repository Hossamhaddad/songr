package com.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class capitalizeController {
    @GetMapping("/capitalize/{id}")
    public String showTemplate(Model t, @PathVariable("id") String id){
      id.toUpperCase();
     t.addAttribute("capital",id.toUpperCase());
        return "capitalize.html";
    }

    }
