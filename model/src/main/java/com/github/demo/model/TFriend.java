package com.github.demo.model;

import javax.persistence.*;

@Table(name = "t_friend")
public class TFriend {
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
     * @t_user. 好友Id
     */
    private Integer friendId;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 1:iPhone,2:iPad,3:Android
     */
    private Short userFrom;

    /**
     * 1:iPhone,2:iPad,3:Android
     */
    private Short friendFrom;

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
     * 获取@t_user. 好友Id
     *
     * @return friendId - @t_user. 好友Id
     */
    public Integer getFriendId() {
        return friendId;
    }

    /**
     * 设置@t_user. 好友Id
     *
     * @param friendId @t_user. 好友Id
     */
    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    /**
     * 获取添加时间
     *
     * @return addTime - 添加时间
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * 设置添加时间
     *
     * @param addTime 添加时间
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
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
     * @return friendFrom - 1:iPhone,2:iPad,3:Android
     */
    public Short getFriendFrom() {
        return friendFrom;
    }

    /**
     * 设置1:iPhone,2:iPad,3:Android
     *
     * @param friendFrom 1:iPhone,2:iPad,3:Android
     */
    public void setFriendFrom(Short friendFrom) {
        this.friendFrom = friendFrom;
    }
}