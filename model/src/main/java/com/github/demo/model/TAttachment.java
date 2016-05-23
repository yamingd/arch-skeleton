package com.github.demo.model;

import javax.persistence.*;

@Table(name = "t_attachment")
public class TAttachment {
    /**
     * 文件/视频/图片id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 上传用户id
     */
    private Integer userId;

    /**
     * mime类型名称
     */
    private String mime;

    /**
     * 文件大小(bytes)
     */
    private Integer size;

    /**
     * 存储路径
     */
    private String realPath;

    /**
     * 上传时间戳
     */
    private Integer createAt;

    /**
     * 第三方访问URL
     */
    private String accessUrl;

    /**
     * 访问次数
     */
    private Integer acessCount;

    /**
     * 业务类型Id
     */
    private Short categoryId;

    /**
     * 1:iPhone,2:iPad,3:Android
     */
    private Short createFrom;

    /**
     * 获取文件/视频/图片id
     *
     * @return id - 文件/视频/图片id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置文件/视频/图片id
     *
     * @param id 文件/视频/图片id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取上传用户id
     *
     * @return userId - 上传用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置上传用户id
     *
     * @param userId 上传用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取mime类型名称
     *
     * @return mime - mime类型名称
     */
    public String getMime() {
        return mime;
    }

    /**
     * 设置mime类型名称
     *
     * @param mime mime类型名称
     */
    public void setMime(String mime) {
        this.mime = mime == null ? null : mime.trim();
    }

    /**
     * 获取文件大小(bytes)
     *
     * @return size - 文件大小(bytes)
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 设置文件大小(bytes)
     *
     * @param size 文件大小(bytes)
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 获取存储路径
     *
     * @return realPath - 存储路径
     */
    public String getRealPath() {
        return realPath;
    }

    /**
     * 设置存储路径
     *
     * @param realPath 存储路径
     */
    public void setRealPath(String realPath) {
        this.realPath = realPath == null ? null : realPath.trim();
    }

    /**
     * 获取上传时间戳
     *
     * @return createAt - 上传时间戳
     */
    public Integer getCreateAt() {
        return createAt;
    }

    /**
     * 设置上传时间戳
     *
     * @param createAt 上传时间戳
     */
    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    /**
     * 获取第三方访问URL
     *
     * @return accessUrl - 第三方访问URL
     */
    public String getAccessUrl() {
        return accessUrl;
    }

    /**
     * 设置第三方访问URL
     *
     * @param accessUrl 第三方访问URL
     */
    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl == null ? null : accessUrl.trim();
    }

    /**
     * 获取访问次数
     *
     * @return acessCount - 访问次数
     */
    public Integer getAcessCount() {
        return acessCount;
    }

    /**
     * 设置访问次数
     *
     * @param acessCount 访问次数
     */
    public void setAcessCount(Integer acessCount) {
        this.acessCount = acessCount;
    }

    /**
     * 获取业务类型Id
     *
     * @return categoryId - 业务类型Id
     */
    public Short getCategoryId() {
        return categoryId;
    }

    /**
     * 设置业务类型Id
     *
     * @param categoryId 业务类型Id
     */
    public void setCategoryId(Short categoryId) {
        this.categoryId = categoryId;
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