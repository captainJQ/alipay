package com.jql.pay.alipay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jql.pay.alipay.server.TestService;
import org.springframework.stereotype.Component;

@Service
@Component
public class TestServiceImpl implements TestService {
    @Override
    public String test(String message) {
        return "dubbo-service recived"+message;
    }
}
