package com.github.demo.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.demo.model.TActivity;
import com.github.demo.service.ActivityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Created by dengyaming on 16/4/27.
 */
@Service(version="1.0.0")
public class ActivityServiceDubboImpl implements ActivityService, InitializingBean {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("activityServiceImpl")
    private ActivityService activityService;

    @Override
    public TActivity find(Integer activityId) {
        return activityService.find(activityId);
    }

    @Override
    public List<TActivity> findAll() {
        return activityService.findAll();
    }

    @Override
    public TActivity add(TActivity activity) {
        return activityService.add(activity);
    }

    @Override
    public TActivity save(TActivity activity) {
        return null;
    }

    @Override
    public TActivity remove(Integer activityId) {
        return null;
    }

    @Override
    public TActivity remove(TActivity activity) {
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.debug("activityService: {}", activityService);
    }
}
