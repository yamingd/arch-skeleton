package com.github.demo.model;

import javax.persistence.*;

@Table(name = "t_device")
public class TDevice {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 设备名称
     */
    private String title;

    /**
     * 添加用户id
     */
    private Integer addUserId;

    /**
     * 设备标识
     */
    private String deviceId;

    /**
     * 设备令牌
     */
    private String deviceToken;

    /**
     * 1:iPhone,2:iPad,3:Android
     */
    private Short kindId;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取设备名称
     *
     * @return title - 设备名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置设备名称
     *
     * @param title 设备名称
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取添加用户id
     *
     * @return addUserId - 添加用户id
     */
    public Integer getAddUserId() {
        return addUserId;
    }

    /**
     * 设置添加用户id
     *
     * @param addUserId 添加用户id
     */
    public void setAddUserId(Integer addUserId) {
        this.addUserId = addUserId;
    }

    /**
     * 获取设备标识
     *
     * @return deviceId - 设备标识
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备标识
     *
     * @param deviceId 设备标识
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    /**
     * 获取设备令牌
     *
     * @return deviceToken - 设备令牌
     */
    public String getDeviceToken() {
        return deviceToken;
    }

    /**
     * 设置设备令牌
     *
     * @param deviceToken 设备令牌
     */
    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken == null ? null : deviceToken.trim();
    }

    /**
     * 获取1:iPhone,2:iPad,3:Android
     *
     * @return kindId - 1:iPhone,2:iPad,3:Android
     */
    public Short getKindId() {
        return kindId;
    }

    /**
     * 设置1:iPhone,2:iPad,3:Android
     *
     * @param kindId 1:iPhone,2:iPad,3:Android
     */
    public void setKindId(Short kindId) {
        this.kindId = kindId;
    }
}