package com.github.demo.service.impl;

import com.github.demo.model.TActivity;
import com.github.demo.service.ActivityService;
import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by dengyaming on 16/4/27.
 */
@Service
public class ActivityServiceImpl extends BaseServiceImpl implements ActivityService {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TActivityMapper activityMapper;

    @Override
    public TActivity find(Integer activityId) {
        activityMapper.selectByExample()
        return activityMapper.selectByPrimaryKey(activityId);
    }

    @Override
    public List<TActivity> findAll() {
//        List<TActivity> list = new ArrayList<>();
//        Random random = new Random();
//        int max = random.nextInt(100);
//        for (int i=0; i<max; i++) {
//            TActivity activity = new TActivity();
//            activity.setId(i);
//            list.add(activity);
//        }
//        return list;

        List<TActivity> activityList = activityMapper.selectAll();
        return activityList;
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
        activityMapper.insertSelective()
        int id = activityMapper.insert(activity);
        activity.setId(id);
        long end = System.currentTimeMillis() - start;
        logger.info("create 1: {}, {}ms", activity, end);
        return activity;
    }

    @Override
    public TActivity save(TActivity activity) {
        Preconditions.checkNotNull(activity, "activity is NULL");
        activityMapper.updateByPrimaryKey(activity);
        return activity;
    }

    @Override
    public TActivity saveNotNull(TActivity activity) {
        activityMapper.updateByPrimaryKeySelective(activity);
        return activity;
    }

    @Override
    public TActivity remove(Integer activityId) {
        activityMapper.deleteByPrimaryKey(activityId);
        return null;
    }

    @Override
    public TActivity remove(TActivity activity) {
        if (null == activity){
            return activity;
        }
        activityMapper.delete(activity);
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.debug("activityMapper: {}", activityMapper);
    }
}
