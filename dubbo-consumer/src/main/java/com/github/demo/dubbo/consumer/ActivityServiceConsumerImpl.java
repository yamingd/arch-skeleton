package com.github.demo.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.demo.model.TActivity;
import com.github.demo.service.ActivityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dengyaming on 16/4/27.
 */
@Service
public class ActivityServiceConsumerImpl implements ActivityService, InitializingBean {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Reference(version="1.0.0")
    private ActivityService activityService;

    @Override
    public List<TActivity> findAll() {
        List<TActivity> list = activityService.findAll();
        logger.info("list: {}", list);
        return list;
    }

    @Override
    public TActivity add(TActivity activity) {
        logger.debug("add activity: {}", activity);
        activity = activityService.add(activity);
        logger.debug("add activity: {}", activity);
        return activity;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.debug("activityService: {}", activityService);
    }
}
