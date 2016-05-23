package com.github.demo.service;

import com.github.demo.model.TActivity;

import java.util.List;

/**
 * Created by dengyaming on 16/4/27.
 */
public interface ActivityService {

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
}
