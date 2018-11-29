package com.aaa.rent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className:EmpController
 * discription:
 * author:luRuiHua
 * createTime:2018-11-29 09:34
 */
@RestController
public class EmpController {

    @RequestMapping("/hello")
    public Object getList() {
        return "hello world!";
    }

}
