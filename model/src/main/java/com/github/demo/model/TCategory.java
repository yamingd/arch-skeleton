package com.github.demo.model;

import javax.persistence.*;

@Table(name = "t_category")
public class TCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 父类id
     */
    private Integer parentId;

    /**
     * 级别编码
     */
    private String code;

    /**
     * 创建时间
     */
    private Integer createTime;

    /**
     * 状态(1:入库,2:发布,9:删除)
     */
    private Short statusId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取父类id
     *
     * @return parentId - 父类id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父类id
     *
     * @param parentId 父类id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取级别编码
     *
     * @return code - 级别编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置级别编码
     *
     * @param code 级别编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取状态(1:入库,2:发布,9:删除)
     *
     * @return statusId - 状态(1:入库,2:发布,9:删除)
     */
    public Short getStatusId() {
        return statusId;
    }

    /**
     * 设置状态(1:入库,2:发布,9:删除)
     *
     * @param statusId 状态(1:入库,2:发布,9:删除)
     */
    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }
}