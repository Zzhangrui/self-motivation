package com.yangq.selfmotivation.config;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

import java.util.LinkedList;

/**
 * @Classname DynamicDataSourceContextHolder
 * @Description 存放数据源上下文
 * @Date 2020/7/14 10:57 上午
 * @Created by Rui.Zhang
 */
@Slf4j
public class DynamicDataSourceContextHolder {


    /**
     * 存放当前线程使用的数据源类型信息
     */
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    /**
     * 数据源使用顺序标识
     */
    public static LinkedList<String> dataSourceIds = new LinkedList<>();

    /**
     * 设置数据源
     *
     * @param dataSourceName
     */
    public static void setDataSource(String dataSourceName) {
        contextHolder.set(dataSourceName);
        dataSourceIds.add(dataSourceName);
    }

    /**
     * 获取数据源
     */
    public static String getDataSource() {
        if (contextHolder.get() == null) {
            log.debug("数据源标识为空，使用默认的数据源");
        } else {
            log.debug("使用数据源:" + contextHolder.get() + " 如果数据源不存在将使用默认数据源.");
        }
        return contextHolder.get();
    }

    /**
     * 清除数据源
     */
    public static void clearDataSource() {
        contextHolder.remove();
        dataSourceIds.clear();
    }

    /**
     * 返回上一次使用的数据源
     *
     * @return
     */
    public static void returnDataSource() {
        dataSourceIds.removeLast();
        setDataSource(dataSourceIds.getLast());
    }
}
