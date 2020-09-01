package com.xxl.job.admin.core.model;

import java.util.Date;

/**
 * Created by xuxueli on 16/9/30.
 */
public class XxlJobRegistry {

    private int id;
    /**
     * 貌似没啥用
     */
    private String registryGroup;
    /**
     * 注册的appName
     */
    private String registryKey;
    /**
     * 注册的机器信息
     */
    private String registryValue;
    /**
     * 更新时间，作为判断是否超时使用
     */
    private Date updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistryGroup() {
        return registryGroup;
    }

    public void setRegistryGroup(String registryGroup) {
        this.registryGroup = registryGroup;
    }

    public String getRegistryKey() {
        return registryKey;
    }

    public void setRegistryKey(String registryKey) {
        this.registryKey = registryKey;
    }

    public String getRegistryValue() {
        return registryValue;
    }

    public void setRegistryValue(String registryValue) {
        this.registryValue = registryValue;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
