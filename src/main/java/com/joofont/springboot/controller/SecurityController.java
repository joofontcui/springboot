package com.joofont.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cui jun on 2018/11/29.
 * @version 1.0
 */
@Controller
@RequestMapping("/security")
public class SecurityController {

    @RequestMapping("/v1/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/v1/hello")
    public String hello() {
        return "hello";
    }


}
