package com.joofont.springboot.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author cui jun on 2018/12/5.
 * @version 1.0
 */
@FeignClient(name= "springboot-service", fallback = HelloFeignHystrix.class)
public interface HelloFeign {

    @GetMapping(value = "/feign/v1/hello")
    String hello(@RequestParam(value = "name") String name);

}
