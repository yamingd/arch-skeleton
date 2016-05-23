package com.github.demo.model;

import javax.persistence.*;

@Table(name = "t_catalog")
public class TCatalog {
    /**
     * 分类id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类目组名称
     */
    private String name;

    /**
     * 标题
     */
    private String title;

    /**
     * 显示顺序(越小显示在前面)
     */
    private Integer orderNo;

    /**
     * 父分类id
     */
    private Integer parentId;

    /**
     * 业务值, 可以用于URL标识
     */
    private String valueCode;

    /**
     * 获取分类id
     *
     * @return id - 分类id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置分类id
     *
     * @param id 分类id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取类目组名称
     *
     * @return name - 类目组名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置类目组名称
     *
     * @param name 类目组名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * 获取显示顺序(越小显示在前面)
     *
     * @return orderNo - 显示顺序(越小显示在前面)
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * 设置显示顺序(越小显示在前面)
     *
     * @param orderNo 显示顺序(越小显示在前面)
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取父分类id
     *
     * @return parentId - 父分类id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父分类id
     *
     * @param parentId 父分类id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取业务值, 可以用于URL标识
     *
     * @return valueCode - 业务值, 可以用于URL标识
     */
    public String getValueCode() {
        return valueCode;
    }

    /**
     * 设置业务值, 可以用于URL标识
     *
     * @param valueCode 业务值, 可以用于URL标识
     */
    public void setValueCode(String valueCode) {
        this.valueCode = valueCode == null ? null : valueCode.trim();
    }
}