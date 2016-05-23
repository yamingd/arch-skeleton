package com.github.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by dengyaming on 16/4/27.
 */
public class BaseServiceImpl implements InitializingBean {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
