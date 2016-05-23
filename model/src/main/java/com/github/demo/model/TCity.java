package com.github.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_city")
public class TCity {
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
     * @t_province. 省份id
     */
    private Integer provinceId;

    /**
     * @t_city. 如是区的话，为其所在城市id, 否则为null
     */
    private Integer cityId;

    /**
     * 名称
     */
    private String name;

    /**
     * longitude(经度)
     */
    private Float longitude;

    /**
     * latitude(纬度)
     */
    private Float latitude;

    /**
     * 更新时间戳
     */
    private Date updateTime;

    /**
     * 拼音首字母
     */
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
     * 获取@t_province. 省份id
     *
     * @return provinceId - @t_province. 省份id
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * 设置@t_province. 省份id
     *
     * @param provinceId @t_province. 省份id
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取@t_city. 如是区的话，为其所在城市id, 否则为null
     *
     * @return cityId - @t_city. 如是区的话，为其所在城市id, 否则为null
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置@t_city. 如是区的话，为其所在城市id, 否则为null
     *
     * @param cityId @t_city. 如是区的话，为其所在城市id, 否则为null
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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
     * 获取longitude(经度)
     *
     * @return longitude - longitude(经度)
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * 设置longitude(经度)
     *
     * @param longitude longitude(经度)
     */
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取latitude(纬度)
     *
     * @return latitude - latitude(纬度)
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * 设置latitude(纬度)
     *
     * @param latitude latitude(纬度)
     */
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
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
     * 获取拼音首字母
     *
     * @return chsCode - 拼音首字母
     */
    public String getChsCode() {
        return chsCode;
    }

    /**
     * 设置拼音首字母
     *
     * @param chsCode 拼音首字母
     */
    public void setChsCode(String chsCode) {
        this.chsCode = chsCode == null ? null : chsCode.trim();
    }
}