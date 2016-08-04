package com.github.demo.service;

import com.github.demo.model.TActivity;

import java.util.List;

/**
 * Created by dengyaming on 16/4/27.
 */
public interface ActivityService {
    /**
     * 按主键读取
     * @param activityId
     * @return
     */
    TActivity find(Integer activityId);
    /**
     * 查询所有活动
     * @return List
     */
    List<TActivity> findAll();
    /**
     * 新建活动
     * @param activity
     * @return TActivity
     */
    TActivity add(TActivity activity);

    /**
     * 修改活动
     * @param activity
     * @return TActivity
     */
    TActivity saveNotNull(TActivity activity);
    /**
     * 修改活动
     * @param activity
     * @return
     */
    TActivity save(TActivity activity);
    /**
     * 删除活动
     * @param activityId
     * @return TActivity
     */
    TActivity remove(Integer activityId);

    /**
     * 删除活动
     * @param activity
     * @return
     */
    TActivity remove(TActivity activity);
}
