package com.jql.pay.alipay.rpc.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jql.pay.alipay.entity.User;
import com.jql.pay.alipay.rpc.service.TestRpcService;
import com.jql.pay.alipay.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestRpcServiceImpl implements TestRpcService {
    @Reference
    private TestService testService;

    @Override
    public String test(String message) {
        return testService.test(message);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return testService.selectByPrimaryKey(id);
    }
}
