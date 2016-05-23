package com.github.demo.model;

import javax.persistence.*;

@Table(name = "t_province")
public class TProvince {
    /**
     * 记录id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 国家id
     */
    private Integer countryId;

    /**
     * 名称
     */
    private String name;

    private String chsCode;

    /**
     * 获取记录id
     *
     * @return id - 记录id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置记录id
     *
     * @param id 记录id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取国家id
     *
     * @return countryId - 国家id
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * 设置国家id
     *
     * @param countryId 国家id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return chsCode
     */
    public String getChsCode() {
        return chsCode;
    }

    /**
     * @param chsCode
     */
    public void setChsCode(String chsCode) {
        this.chsCode = chsCode == null ? null : chsCode.trim();
    }
}