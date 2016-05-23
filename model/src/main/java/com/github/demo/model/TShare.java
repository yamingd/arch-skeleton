package com.github.demo.model;

import javax.persistence.*;

@Table(name = "t_share")
public class TShare {
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
     * @t_book. 书id
     */
    private Integer bookId;

    /**
     * @t_activity. 活动id
     */
    private Integer activityId;

    /**
     * 目标平台
     */
    private String target;

    /**
     * 分享时间
     */
    private Integer createTime;

    /**
     * 1:iPhone,2:iPad,3:Android
     */
    private Short createFrom;

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
     * 获取@t_activity. 活动id
     *
     * @return activityId - @t_activity. 活动id
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * 设置@t_activity. 活动id
     *
     * @param activityId @t_activity. 活动id
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取目标平台
     *
     * @return target - 目标平台
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置目标平台
     *
     * @param target 目标平台
     */
    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    /**
     * 获取分享时间
     *
     * @return createTime - 分享时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置分享时间
     *
     * @param createTime 分享时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取1:iPhone,2:iPad,3:Android
     *
     * @return createFrom - 1:iPhone,2:iPad,3:Android
     */
    public Short getCreateFrom() {
        return createFrom;
    }

    /**
     * 设置1:iPhone,2:iPad,3:Android
     *
     * @param createFrom 1:iPhone,2:iPad,3:Android
     */
    public void setCreateFrom(Short createFrom) {
        this.createFrom = createFrom;
    }
}