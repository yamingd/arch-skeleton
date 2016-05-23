package com.github.demo.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_moment")
public class TMoment {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 对象id
     */
    private Integer objectId;

    /**
     * 对象类型id
     */
    private Integer objectKind;

    /**
     * @t_attachment. 图片id
     */
    private Integer imageId;

    /**
     * @t_attachment. 视频id
     */
    private Integer videoId;

    /**
     * 标题
     */
    private String title;

    /**
     * latitude(纬度)
     */
    private BigDecimal latitude;

    /**
     * longitude(经度)
     */
    private BigDecimal longitude;

    /**
     * 发布时间
     */
    private Integer createTime;

    /**
     * 1:发布,2:下线,9:删除
     */
    private Short statusId;

    /**
     * 赞个数
     */
    private Integer totalLike;

    /**
     * @t_user. 发表用户id
     */
    private Integer userId;

    /**
     * 浏览次数
     */
    private Integer totalView;

    /**
     * 播放次数
     */
    private Integer totalPlay;

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
     * 获取对象类型id
     *
     * @return objectKind - 对象类型id
     */
    public Integer getObjectKind() {
        return objectKind;
    }

    /**
     * 设置对象类型id
     *
     * @param objectKind 对象类型id
     */
    public void setObjectKind(Integer objectKind) {
        this.objectKind = objectKind;
    }

    /**
     * 获取@t_attachment. 图片id
     *
     * @return imageId - @t_attachment. 图片id
     */
    public Integer getImageId() {
        return imageId;
    }

    /**
     * 设置@t_attachment. 图片id
     *
     * @param imageId @t_attachment. 图片id
     */
    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    /**
     * 获取@t_attachment. 视频id
     *
     * @return videoId - @t_attachment. 视频id
     */
    public Integer getVideoId() {
        return videoId;
    }

    /**
     * 设置@t_attachment. 视频id
     *
     * @param videoId @t_attachment. 视频id
     */
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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
     * 获取发布时间
     *
     * @return createTime - 发布时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置发布时间
     *
     * @param createTime 发布时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取1:发布,2:下线,9:删除
     *
     * @return statusId - 1:发布,2:下线,9:删除
     */
    public Short getStatusId() {
        return statusId;
    }

    /**
     * 设置1:发布,2:下线,9:删除
     *
     * @param statusId 1:发布,2:下线,9:删除
     */
    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    /**
     * 获取赞个数
     *
     * @return totalLike - 赞个数
     */
    public Integer getTotalLike() {
        return totalLike;
    }

    /**
     * 设置赞个数
     *
     * @param totalLike 赞个数
     */
    public void setTotalLike(Integer totalLike) {
        this.totalLike = totalLike;
    }

    /**
     * 获取@t_user. 发表用户id
     *
     * @return userId - @t_user. 发表用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置@t_user. 发表用户id
     *
     * @param userId @t_user. 发表用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取浏览次数
     *
     * @return totalView - 浏览次数
     */
    public Integer getTotalView() {
        return totalView;
    }

    /**
     * 设置浏览次数
     *
     * @param totalView 浏览次数
     */
    public void setTotalView(Integer totalView) {
        this.totalView = totalView;
    }

    /**
     * 获取播放次数
     *
     * @return totalPlay - 播放次数
     */
    public Integer getTotalPlay() {
        return totalPlay;
    }

    /**
     * 设置播放次数
     *
     * @param totalPlay 播放次数
     */
    public void setTotalPlay(Integer totalPlay) {
        this.totalPlay = totalPlay;
    }
}