package com.github.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_view_log")
public class TViewLog {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 对象id
     */
    private Integer objectId;

    /**
     * 对象类型
     */
    private Integer objectKind;

    /**
     * 会员用户id
     */
    private Integer userId;

    /**
     * 加入时间
     */
    private Integer createTime;

    /**
     * 最后访问时间
     */
    private Date updateTime;

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
    private Short viewFrom;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取对象id
     *
     * @return objectId - 对象id
     */
    public Integer getObjectId() {
        return objectId;
    }

    /**
     * 设置对象id
     *
     * @param objectId 对象id
     */
    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    /**
     * 获取对象类型
     *
     * @return objectKind - 对象类型
     */
    public Integer getObjectKind() {
        return objectKind;
    }

    /**
     * 设置对象类型
     *
     * @param objectKind 对象类型
     */
    public void setObjectKind(Integer objectKind) {
        this.objectKind = objectKind;
    }

    /**
     * 获取会员用户id
     *
     * @return userId - 会员用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置会员用户id
     *
     * @param userId 会员用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取加入时间
     *
     * @return createTime - 加入时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置加入时间
     *
     * @param createTime 加入时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后访问时间
     *
     * @return updateTime - 最后访问时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最后访问时间
     *
     * @param updateTime 最后访问时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
     * @return viewFrom - 1:iPhone,2:iPad,3:Android
     */
    public Short getViewFrom() {
        return viewFrom;
    }

    /**
     * 设置1:iPhone,2:iPad,3:Android
     *
     * @param viewFrom 1:iPhone,2:iPad,3:Android
     */
    public void setViewFrom(Short viewFrom) {
        this.viewFrom = viewFrom;
    }
}