package com.it18.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/11/1.
 */
@Controller
public class HomeController {

    @RequestMapping(value="/home")
    public String openHome(){
       System.out.println("hello mvc");
        return "index";
   }
}
