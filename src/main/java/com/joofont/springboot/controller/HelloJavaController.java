package com.joofont.springboot.controller;

import com.joofont.springboot.entity.User;
import com.joofont.springboot.exception.MyException;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * @author cui jun on 2018/11/27.
 * @version 1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloJavaController {

    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
//    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @GetMapping("/java")
    public String helloJava(@RequestParam Long id) {
        return "Hello World id = " + id;
    }

    @GetMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误啦，自定义异常");
    }

    @ApiOperation(value="获取用户信息", notes="获取用户信息")
    @GetMapping("/v1/user")
    public User getUser() {
        User user = new User();
        user.setAge(1);
        user.setAmount(10);
        user.setDescription("描述");
        user.setCreateDate(LocalDate.now());

        return user;
    }

}
