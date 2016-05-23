package com.github.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dengyaming on 4/4/16.
 */
@Controller
@RequestMapping("/")
public class HomeIndexController extends HomeBaseController {

    @RequestMapping
    public String get(){
        return "/home/index";
    }

}
