package com.example.recipe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/tamales")
    public String tamales(){
        return "tamales";
    }

    @RequestMapping("/crabcake")
    public String crabcake(){
        return "crabcake";
    }

    @RequestMapping("/cheesecake")
    public String cheesecake(){
        return "cheesecake";
    }

    @RequestMapping("/recipespic")
    public String recipespic(){
        return "recipespic";
    }
}
