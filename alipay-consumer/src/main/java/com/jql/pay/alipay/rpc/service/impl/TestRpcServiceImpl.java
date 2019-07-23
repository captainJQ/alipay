package com.jql.pay.alipay.rpc.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jql.pay.alipay.rpc.service.TestRpcService;
import com.jql.pay.alipay.server.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestRpcServiceImpl implements TestRpcService {
    @Reference
    private TestService testService;

    @Override
    public String test(String message) {
        return testService.test(message);
    }
}
