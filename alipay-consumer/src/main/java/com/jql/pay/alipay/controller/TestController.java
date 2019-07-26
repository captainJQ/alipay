package com.jql.pay.alipay.controller;

import com.jql.pay.alipay.rpc.service.TestRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestRpcService testRpcService;

    @RequestMapping(value = "/test")
    public String test(String message){
        return  testRpcService.test(message);
    }

    @RequestMapping(value = "/selectUser")
    public String selectUser(String message){
        return  testRpcService.test(message);
    }
}
