package com.reigncode.first.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by johndoe on 28.02.2015.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String goToHome(){
        return "index";
    }
}
