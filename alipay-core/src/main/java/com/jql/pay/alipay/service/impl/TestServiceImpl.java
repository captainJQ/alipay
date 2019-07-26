package com.jql.pay.alipay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jql.pay.alipay.entity.User;
import com.jql.pay.alipay.mapper.UserMapper;
import com.jql.pay.alipay.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String test(String message) {
        return "dubbo-service recived"+message;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
