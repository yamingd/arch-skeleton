package com.github.demo.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_activity_member")
public class TActivityMember {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 申请时间
     */
    private Integer createTime;

    /**
     * 是否到现场(0/1)
     */
    private Boolean ifAttended;

    /**
     * 想参加(0/1)
     */
    private Boolean ifWant;

    /**
     * latitude(纬度)
     */
    private BigDecimal latitude;

    /**
     * longitude(经度)
     */
    private BigDecimal longitude;

    /**
     * 1:iPhone,2:iPad,3:Android
     */
    private Short joinFrom;

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
     * 获取用户id
     *
     * @return userId - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取活动id
     *
     * @return activityId - 活动id
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * 设置活动id
     *
     * @param activityId 活动id
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取申请时间
     *
     * @return createTime - 申请时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置申请时间
     *
     * @param createTime 申请时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取是否到现场(0/1)
     *
     * @return ifAttended - 是否到现场(0/1)
     */
    public Boolean getIfAttended() {
        return ifAttended;
    }

    /**
     * 设置是否到现场(0/1)
     *
     * @param ifAttended 是否到现场(0/1)
     */
    public void setIfAttended(Boolean ifAttended) {
        this.ifAttended = ifAttended;
    }

    /**
     * 获取想参加(0/1)
     *
     * @return ifWant - 想参加(0/1)
     */
    public Boolean getIfWant() {
        return ifWant;
    }

    /**
     * 设置想参加(0/1)
     *
     * @param ifWant 想参加(0/1)
     */
    public void setIfWant(Boolean ifWant) {
        this.ifWant = ifWant;
    }

    /**
     * 获取latitude(纬度)
     *
     * @return latitude - latitude(纬度)
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 设置latitude(纬度)
     *
     * @param latitude latitude(纬度)
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取longitude(经度)
     *
     * @return longitude - longitude(经度)
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 设置longitude(经度)
     *
     * @param longitude longitude(经度)
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取1:iPhone,2:iPad,3:Android
     *
     * @return joinFrom - 1:iPhone,2:iPad,3:Android
     */
    public Short getJoinFrom() {
        return joinFrom;
    }

    /**
     * 设置1:iPhone,2:iPad,3:Android
     *
     * @param joinFrom 1:iPhone,2:iPad,3:Android
     */
    public void setJoinFrom(Short joinFrom) {
        this.joinFrom = joinFrom;
    }
}