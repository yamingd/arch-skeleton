package com.github.demo.mapper;

import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by dengyaming on 8/3/16.
 */
public interface AllMapper<T> extends Mapper<T> {

    @SelectProvider(type = SelectInProvider.class, method = "dynamicSQL")
    List<T> selectIn(List<Integer> itemIds);

}
