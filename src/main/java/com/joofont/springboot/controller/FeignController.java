package com.joofont.springboot.controller;

import com.joofont.springboot.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cui jun on 2018/12/5.
 * @version 1.0
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private HelloFeign helloFeign;

    @GetMapping("/v1/testFeign")
    public String testFeign(@RequestParam("name") String name) {
        return helloFeign.hello(name);
    }

}
