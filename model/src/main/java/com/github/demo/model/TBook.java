package com.github.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_book")
public class TBook {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 书名
     */
    private String title;

    /**
     * 作者
     */
    private String author;

    /**
     * @t_attachment. 封面图片id
     */
    private Integer coverIconId;

    /**
     * @t_category. 书类型id
     */
    private Integer categoryId;

    /**
     * @t_category. 书大类id
     */
    private Integer parentCategoryId;

    /**
     * ISBN
     */
    private String isbn;

    /**
     * 内容介绍
     */
    private String remark;

    /**
     * 浏览次数
     */
    private Integer totalView;

    /**
     * 多少人有
     */
    private Integer totalOwner;

    /**
     * 交换多少次
     */
    private Integer totalExchange;

    /**
     * 更新时间戳
     */
    private Date updateTime;

    /**
     * 录入时间
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
     * 获取书名
     *
     * @return title - 书名
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置书名
     *
     * @param title 书名
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * 获取@t_attachment. 封面图片id
     *
     * @return coverIconId - @t_attachment. 封面图片id
     */
    public Integer getCoverIconId() {
        return coverIconId;
    }

    /**
     * 设置@t_attachment. 封面图片id
     *
     * @param coverIconId @t_attachment. 封面图片id
     */
    public void setCoverIconId(Integer coverIconId) {
        this.coverIconId = coverIconId;
    }

    /**
     * 获取@t_category. 书类型id
     *
     * @return categoryId - @t_category. 书类型id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置@t_category. 书类型id
     *
     * @param categoryId @t_category. 书类型id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取@t_category. 书大类id
     *
     * @return parentCategoryId - @t_category. 书大类id
     */
    public Integer getParentCategoryId() {
        return parentCategoryId;
    }

    /**
     * 设置@t_category. 书大类id
     *
     * @param parentCategoryId @t_category. 书大类id
     */
    public void setParentCategoryId(Integer parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    /**
     * 获取ISBN
     *
     * @return isbn - ISBN
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * 设置ISBN
     *
     * @param isbn ISBN
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    /**
     * 获取内容介绍
     *
     * @return remark - 内容介绍
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置内容介绍
     *
     * @param remark 内容介绍
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
     * 获取多少人有
     *
     * @return totalOwner - 多少人有
     */
    public Integer getTotalOwner() {
        return totalOwner;
    }

    /**
     * 设置多少人有
     *
     * @param totalOwner 多少人有
     */
    public void setTotalOwner(Integer totalOwner) {
        this.totalOwner = totalOwner;
    }

    /**
     * 获取交换多少次
     *
     * @return totalExchange - 交换多少次
     */
    public Integer getTotalExchange() {
        return totalExchange;
    }

    /**
     * 设置交换多少次
     *
     * @param totalExchange 交换多少次
     */
    public void setTotalExchange(Integer totalExchange) {
        this.totalExchange = totalExchange;
    }

    /**
     * 获取更新时间戳
     *
     * @return updateTime - 更新时间戳
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间戳
     *
     * @param updateTime 更新时间戳
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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