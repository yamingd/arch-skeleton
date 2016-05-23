package com.github.demo.integration;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.github.demo.model.TActivity;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dengyaming on 16/4/27.
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {

    @Override
    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        classes.add(TActivity.class);

        return classes;
    }

}
