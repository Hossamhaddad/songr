package com.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloworld {
@GetMapping("/hello")
public String showHelloWorld(){
    return "hello.html";
}
    @GetMapping("/")
    public String showHomePage(){
        return "home.html";
    }

}
