package com.github.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_bar")
public class TBar {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    private String title;

    /**
     * @t_catalog. 吧类型id
     */
    private Integer categoryId;

    /**
     * @t_user. 添加人id
     */
    private Integer addUserId;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * @t_province. 省份id
     */
    private Integer provinceId;

    /**
     * @t_city. 城市id
     */
    private Integer cityId;

    /**
     * @t_city. 区/镇id
     */
    private Integer districtId;

    /**
     * 街道地址
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
     * @t_attachment. 门店照片id
     */
    private Integer iconId;

    /**
     * 描述内容
     */
    private String remark;

    /**
     * 更新时间戳
     */
    private Date updateTime;

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
     * 获取名称
     *
     * @return title - 名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置名称
     *
     * @param title 名称
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取@t_catalog. 吧类型id
     *
     * @return categoryId - @t_catalog. 吧类型id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置@t_catalog. 吧类型id
     *
     * @param categoryId @t_catalog. 吧类型id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取@t_user. 添加人id
     *
     * @return addUserId - @t_user. 添加人id
     */
    public Integer getAddUserId() {
        return addUserId;
    }

    /**
     * 设置@t_user. 添加人id
     *
     * @param addUserId @t_user. 添加人id
     */
    public void setAddUserId(Integer addUserId) {
        this.addUserId = addUserId;
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
     * 获取@t_city. 城市id
     *
     * @return cityId - @t_city. 城市id
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置@t_city. 城市id
     *
     * @param cityId @t_city. 城市id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取@t_city. 区/镇id
     *
     * @return districtId - @t_city. 区/镇id
     */
    public Integer getDistrictId() {
        return districtId;
    }

    /**
     * 设置@t_city. 区/镇id
     *
     * @param districtId @t_city. 区/镇id
     */
    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    /**
     * 获取街道地址
     *
     * @return address - 街道地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置街道地址
     *
     * @param address 街道地址
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
     * 获取@t_attachment. 门店照片id
     *
     * @return iconId - @t_attachment. 门店照片id
     */
    public Integer getIconId() {
        return iconId;
    }

    /**
     * 设置@t_attachment. 门店照片id
     *
     * @param iconId @t_attachment. 门店照片id
     */
    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    /**
     * 获取描述内容
     *
     * @return remark - 描述内容
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置描述内容
     *
     * @param remark 描述内容
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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