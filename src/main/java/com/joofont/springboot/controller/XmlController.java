package com.joofont.springboot.controller;

import com.joofont.springboot.entity.XmlUser;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author cui jun on 2018/11/28.
 * @version 1.0
 */
@Controller
@RequestMapping("/xml")
public class XmlController {

    @ApiOperation(value="xml请求", notes="xml请求")
    @PostMapping(value = "/v1/xml/user")
    @ResponseBody
    public XmlUser getXmlUser(@RequestBody XmlUser xmlUser) {
        xmlUser.setName(xmlUser.getName() + "test");
        xmlUser.setAge(xmlUser.getAge() + 100);
        return xmlUser;
    }

}
