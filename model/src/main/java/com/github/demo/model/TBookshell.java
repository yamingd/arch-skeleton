package com.github.demo.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_bookshell")
public class TBookshell {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * @t_user. 用户id
     */
    private Integer userId;

    /**
     * @t_book. 书id
     */
    private Integer bookId;

    /**
     * latitude(纬度)
     */
    private BigDecimal latitude;

    /**
     * longitude(经度)
     */
    private BigDecimal longitude;

    /**
     * 录入时间
     */
    private Integer createTime;

    /**
     * 拥有人(0/1)
     */
    private Boolean ifOwner;

    /**
     * 想看(0/1)
     */
    private Boolean toRead;

    /**
     * 浏览(0/1)
     */
    private Boolean ifView;

    /**
     * 1:iPhone,2:iPad,3:Android
     */
    private Short optFrom;

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
     * 获取@t_user. 用户id
     *
     * @return userId - @t_user. 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置@t_user. 用户id
     *
     * @param userId @t_user. 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取@t_book. 书id
     *
     * @return bookId - @t_book. 书id
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * 设置@t_book. 书id
     *
     * @param bookId @t_book. 书id
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
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
     * 获取录入时间
     *
     * @return createTime - 录入时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置录入时间
     *
     * @param createTime 录入时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取拥有人(0/1)
     *
     * @return ifOwner - 拥有人(0/1)
     */
    public Boolean getIfOwner() {
        return ifOwner;
    }

    /**
     * 设置拥有人(0/1)
     *
     * @param ifOwner 拥有人(0/1)
     */
    public void setIfOwner(Boolean ifOwner) {
        this.ifOwner = ifOwner;
    }

    /**
     * 获取想看(0/1)
     *
     * @return toRead - 想看(0/1)
     */
    public Boolean getToRead() {
        return toRead;
    }

    /**
     * 设置想看(0/1)
     *
     * @param toRead 想看(0/1)
     */
    public void setToRead(Boolean toRead) {
        this.toRead = toRead;
    }

    /**
     * 获取浏览(0/1)
     *
     * @return ifView - 浏览(0/1)
     */
    public Boolean getIfView() {
        return ifView;
    }

    /**
     * 设置浏览(0/1)
     *
     * @param ifView 浏览(0/1)
     */
    public void setIfView(Boolean ifView) {
        this.ifView = ifView;
    }

    /**
     * 获取1:iPhone,2:iPad,3:Android
     *
     * @return optFrom - 1:iPhone,2:iPad,3:Android
     */
    public Short getOptFrom() {
        return optFrom;
    }

    /**
     * 设置1:iPhone,2:iPad,3:Android
     *
     * @param optFrom 1:iPhone,2:iPad,3:Android
     */
    public void setOptFrom(Short optFrom) {
        this.optFrom = optFrom;
    }
}