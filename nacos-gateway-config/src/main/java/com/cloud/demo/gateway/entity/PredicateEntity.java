package com.cloud.demo.gateway.entity;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 路由断言实体类
 * @author ：Jerry
 * @date ：Created in 2020/6/3 14:00
 */
public class PredicateEntity {

    /**
     * 断言对应的Name
     */
    private String name;

    /**
     * 断言规则
     */
    private Map<String, String> args = new LinkedHashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getArgs() {
        return args;
    }

    public void setArgs(Map<String, String> args) {
        this.args = args;
    }
}
