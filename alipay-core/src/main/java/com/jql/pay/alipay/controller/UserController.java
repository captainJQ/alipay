package com.jql.pay.alipay.controller;

import com.jql.pay.alipay.entity.User;
import com.jql.pay.alipay.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/selectUser")
    public User selectUser(Integer id){
        log.debug("yelaila-----------------------");
        return testService.selectByPrimaryKey(id);
    }
}
