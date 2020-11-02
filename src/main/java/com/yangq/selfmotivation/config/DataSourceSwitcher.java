package com.yangq.selfmotivation.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


/**
 * @Classname DataSourceSwitcher
 * @Description 数据源切换类
 * @Date 2020/7/14 10:57 上午
 * @Created by Rui.Zhang
 */
public class DataSourceSwitcher extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSource();
    }
}
