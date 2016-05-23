package com.github.demo.service.impl;

import com.github.demo.mapper.TActivityMapper;
import com.github.demo.model.TActivity;
import com.github.demo.service.ActivityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by dengyaming on 16/4/27.
 */
@Service
public class ActivityServiceImpl extends BaseServiceImpl implements ActivityService {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TActivityMapper activityMapper;

    @Override
    public List<TActivity> findAll() {
        List<TActivity> list = new ArrayList<>();
        Random random = new Random();
        int max = random.nextInt(100);
        for (int i=0; i<max; i++) {
            TActivity activity = new TActivity();
            activity.setId(i);
            list.add(activity);
        }
        return list;
    }

    @Override
    public TActivity add(TActivity activity) {
        long start = System.currentTimeMillis();
        logger.info("create 0: {}", activity);
        activity = new TActivity();
        activity.setTitle("Title");
        activity.setChsCode("ChsCode");
        activity.setProvinceId(1);
        activity.setCityId(1);
        activity.setStatusId((short)1);
        activity.setAddress("Address");
        activity.setCreateTime((int)(System.currentTimeMillis()/1000));
        activity.setContactName("Contact Name");
        activity.setContactPhone("Contact Phone");
        activity.setIfNew(false);
        activity.setIfRecommend(false);
        activity.setIfTop(false);
        activity.setDetail("详细内容");
        activity.setCoverImageId(1);
        activity.setStartTime(new Date());
        activity.setEndTime(new Date());
        activity.setCreateUserId(1);
        activity.setTotalAttended(0);
        activity.setTotalShare(0);
        activity.setTotalSign(0);
        activity.setTotalView(0);
        activity.setTotalWant(0);
        int id = activityMapper.insert(activity);
        activity.setId(id);
        long end = System.currentTimeMillis() - start;
        logger.info("create 1: {}, {}ms", activity, end);
        return activity;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.debug("activityMapper: {}", activityMapper);
    }
}
