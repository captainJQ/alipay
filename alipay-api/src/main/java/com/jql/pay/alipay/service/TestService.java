package com.jql.pay.alipay.service;

import com.jql.pay.alipay.entity.User;

public interface TestService {

    String test(String message);

    User selectByPrimaryKey(Integer id);
}
