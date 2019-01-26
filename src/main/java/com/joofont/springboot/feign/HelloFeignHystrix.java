package com.joofont.springboot.feign;

import org.springframework.stereotype.Component;

/**
 * @author cui jun on 2018/12/6.
 * @version 1.0
 */
@Component
public class HelloFeignHystrix implements HelloFeign {

    @Override
    public String hello(String name) {
        return "hello," + name + ", this messge send failed ";
    }

}
