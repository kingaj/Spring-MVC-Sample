package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController
{
    @RequestMapping("/home")
    public String testPage()
    {
        return "html-page";
    }

    @RequestMapping("/loadName")
    public String loadName(@RequestParam("name") String name, Model model)
    {
        name = "Yo! "+name.toUpperCase();

        model.addAttribute("message",name);

        return "welcome-page";
    }

    @RequestMapping("/home/welcome")
    public String testPageWelCome()
    {
        return "welcome-page";
    }
}
