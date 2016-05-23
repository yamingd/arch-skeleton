package com.github.demo.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_exchange")
public class TExchange {
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
     * @t_user. 目标用户id
     */
    private Integer toUserId;

    /**
     * @t_book. 目标书id
     */
    private Integer toBookId;

    /**
     * 申请时间
     */
    private Integer createTime;

    /**
     * 状态(1:申请,2:成功,3:失败)
     */
    private Short statusId;

    /**
     * 交换地点
     */
    private String address;

    /**
     * latitude(纬度)
     */
    private BigDecimal latitude;

    /**
     * longitude(经度)
     */
    private BigDecimal longitude;

    /**
     * @t_bar. 书吧Id
     */
    private Integer barId;

    /**
     * 交换日期
     */
    private Integer exchangeDate;

    /**
     * 归还日期
     */
    private Integer returnDate;

    /**
     * 1:iPhone,2:iPad,3:Android
     */
    private Short userFrom;

    /**
     * 1:iPhone,2:iPad,3:Android
     */
    private Short toFrom;

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
     * 获取@t_user. 目标用户id
     *
     * @return toUserId - @t_user. 目标用户id
     */
    public Integer getToUserId() {
        return toUserId;
    }

    /**
     * 设置@t_user. 目标用户id
     *
     * @param toUserId @t_user. 目标用户id
     */
    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }

    /**
     * 获取@t_book. 目标书id
     *
     * @return toBookId - @t_book. 目标书id
     */
    public Integer getToBookId() {
        return toBookId;
    }

    /**
     * 设置@t_book. 目标书id
     *
     * @param toBookId @t_book. 目标书id
     */
    public void setToBookId(Integer toBookId) {
        this.toBookId = toBookId;
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
     * 获取状态(1:申请,2:成功,3:失败)
     *
     * @return statusId - 状态(1:申请,2:成功,3:失败)
     */
    public Short getStatusId() {
        return statusId;
    }

    /**
     * 设置状态(1:申请,2:成功,3:失败)
     *
     * @param statusId 状态(1:申请,2:成功,3:失败)
     */
    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    /**
     * 获取交换地点
     *
     * @return address - 交换地点
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置交换地点
     *
     * @param address 交换地点
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
     * 获取@t_bar. 书吧Id
     *
     * @return barId - @t_bar. 书吧Id
     */
    public Integer getBarId() {
        return barId;
    }

    /**
     * 设置@t_bar. 书吧Id
     *
     * @param barId @t_bar. 书吧Id
     */
    public void setBarId(Integer barId) {
        this.barId = barId;
    }

    /**
     * 获取交换日期
     *
     * @return exchangeDate - 交换日期
     */
    public Integer getExchangeDate() {
        return exchangeDate;
    }

    /**
     * 设置交换日期
     *
     * @param exchangeDate 交换日期
     */
    public void setExchangeDate(Integer exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    /**
     * 获取归还日期
     *
     * @return returnDate - 归还日期
     */
    public Integer getReturnDate() {
        return returnDate;
    }

    /**
     * 设置归还日期
     *
     * @param returnDate 归还日期
     */
    public void setReturnDate(Integer returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * 获取1:iPhone,2:iPad,3:Android
     *
     * @return userFrom - 1:iPhone,2:iPad,3:Android
     */
    public Short getUserFrom() {
        return userFrom;
    }

    /**
     * 设置1:iPhone,2:iPad,3:Android
     *
     * @param userFrom 1:iPhone,2:iPad,3:Android
     */
    public void setUserFrom(Short userFrom) {
        this.userFrom = userFrom;
    }

    /**
     * 获取1:iPhone,2:iPad,3:Android
     *
     * @return toFrom - 1:iPhone,2:iPad,3:Android
     */
    public Short getToFrom() {
        return toFrom;
    }

    /**
     * 设置1:iPhone,2:iPad,3:Android
     *
     * @param toFrom 1:iPhone,2:iPad,3:Android
     */
    public void setToFrom(Short toFrom) {
        this.toFrom = toFrom;
    }
}