package com.jql.pay.alipay.rpc.service;

import com.jql.pay.alipay.entity.User;

public interface TestRpcService {
    String test(String message);
    User selectByPrimaryKey(Integer id);
}
