package com.jql.pay.alipay.log;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class MyBatisStdOutImpl implements Log {
    public MyBatisStdOutImpl(String clazz){
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }
    @Override
    public boolean isTraceEnabled() {
        return true;
    }
    @Override
    public void error(String s, Throwable e) {
        log.error(s);
        e.printStackTrace(System.err);
    }
    @Override
    public void error(String s) {
        log.error(s);
    }
    @Override
    public void debug(String s) {
        log.debug(s);
    }
    @Override
    public void trace(String s) {
        log.trace(s);
    }
    @Override
    public void warn(String s) {
        log.warn(s);
    }
}
