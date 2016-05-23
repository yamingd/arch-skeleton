package com.github.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_activity")
public class TActivity {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 拼音代码
     */
    private String chsCode;

    /**
     * @t_bar. 举行书吧id
     */
    private Integer barId;

    /**
     * @t_province. 省份Id
     */
    private Integer provinceId;

    /**
     * @t_city. 城市id
     */
    private Integer cityId;

    /**
     * @t_district. 区/镇id
     */
    private Integer districtId;

    /**
     * 具体街道地址
     */
    private String address;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * @t_user. 发布人id
     */
    private Integer createUserId;

    /**
     * 发布时间
     */
    private Integer createTime;

    /**
     * 最后更新时间
     */
    private Date updateTime;

    /**
     * 状态(1:准备中,2:审核, 3:发布,4:进行中,5:结束,9:删除)
     */
    private Short statusId;

    /**
     * 海报id
     */
    private Integer coverImageId;

    /**
     * @t_catalog. 类别id
     */
    private Integer categoryId;

    /**
     * 报名结束时间
     */
    private Date signEndTime;

    /**
     * 联系电话
     */
    private String contactPhone;

    /**
     * 联系人名称
     */
    private String contactName;

    /**
     * 是否推荐
     */
    private Boolean ifRecommend;

    /**
     * 是否置顶
     */
    private Boolean ifTop;

    /**
     * 是否新活动
     */
    private Boolean ifNew;

    /**
     * 参加人数
     */
    private Integer totalSign;

    /**
     * 想参加人数
     */
    private Integer totalWant;

    /**
     * 浏览数
     */
    private Integer totalView;

    /**
     * 分享数
     */
    private Integer totalShare;

    /**
     * 到场人数
     */
    private Integer totalAttended;

    /**
     * latitude(纬度)
     */
    private BigDecimal latitude;

    /**
     * longitude(经度)
     */
    private BigDecimal longitude;

    /**
     * 1:iPhone,2:iPad,3:Android
     */
    private Short createFrom;

    /**
     * 详细内容
     */
    private String detail;

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
     * 获取拼音代码
     *
     * @return chsCode - 拼音代码
     */
    public String getChsCode() {
        return chsCode;
    }

    /**
     * 设置拼音代码
     *
     * @param chsCode 拼音代码
     */
    public void setChsCode(String chsCode) {
        this.chsCode = chsCode == null ? null : chsCode.trim();
    }

    /**
     * 获取@t_bar. 举行书吧id
     *
     * @return barId - @t_bar. 举行书吧id
     */
    public Integer getBarId() {
        return barId;
    }

    /**
     * 设置@t_bar. 举行书吧id
     *
     * @param barId @t_bar. 举行书吧id
     */
    public void setBarId(Integer barId) {
        this.barId = barId;
    }

    /**
     * 获取@t_province. 省份Id
     *
     * @return provinceId - @t_province. 省份Id
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * 设置@t_province. 省份Id
     *
     * @param provinceId @t_province. 省份Id
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
     * 获取@t_district. 区/镇id
     *
     * @return districtId - @t_district. 区/镇id
     */
    public Integer getDistrictId() {
        return districtId;
    }

    /**
     * 设置@t_district. 区/镇id
     *
     * @param districtId @t_district. 区/镇id
     */
    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    /**
     * 获取具体街道地址
     *
     * @return address - 具体街道地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置具体街道地址
     *
     * @param address 具体街道地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取开始时间
     *
     * @return startTime - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return endTime - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取@t_user. 发布人id
     *
     * @return createUserId - @t_user. 发布人id
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置@t_user. 发布人id
     *
     * @param createUserId @t_user. 发布人id
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
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
     * 获取最后更新时间
     *
     * @return updateTime - 最后更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最后更新时间
     *
     * @param updateTime 最后更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取状态(1:准备中,2:审核, 3:发布,4:进行中,5:结束,9:删除)
     *
     * @return statusId - 状态(1:准备中,2:审核, 3:发布,4:进行中,5:结束,9:删除)
     */
    public Short getStatusId() {
        return statusId;
    }

    /**
     * 设置状态(1:准备中,2:审核, 3:发布,4:进行中,5:结束,9:删除)
     *
     * @param statusId 状态(1:准备中,2:审核, 3:发布,4:进行中,5:结束,9:删除)
     */
    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    /**
     * 获取海报id
     *
     * @return coverImageId - 海报id
     */
    public Integer getCoverImageId() {
        return coverImageId;
    }

    /**
     * 设置海报id
     *
     * @param coverImageId 海报id
     */
    public void setCoverImageId(Integer coverImageId) {
        this.coverImageId = coverImageId;
    }

    /**
     * 获取@t_catalog. 类别id
     *
     * @return categoryId - @t_catalog. 类别id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置@t_catalog. 类别id
     *
     * @param categoryId @t_catalog. 类别id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取报名结束时间
     *
     * @return signEndTime - 报名结束时间
     */
    public Date getSignEndTime() {
        return signEndTime;
    }

    /**
     * 设置报名结束时间
     *
     * @param signEndTime 报名结束时间
     */
    public void setSignEndTime(Date signEndTime) {
        this.signEndTime = signEndTime;
    }

    /**
     * 获取联系电话
     *
     * @return contactPhone - 联系电话
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置联系电话
     *
     * @param contactPhone 联系电话
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    /**
     * 获取联系人名称
     *
     * @return contactName - 联系人名称
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人名称
     *
     * @param contactName 联系人名称
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * 获取是否推荐
     *
     * @return ifRecommend - 是否推荐
     */
    public Boolean getIfRecommend() {
        return ifRecommend;
    }

    /**
     * 设置是否推荐
     *
     * @param ifRecommend 是否推荐
     */
    public void setIfRecommend(Boolean ifRecommend) {
        this.ifRecommend = ifRecommend;
    }

    /**
     * 获取是否置顶
     *
     * @return ifTop - 是否置顶
     */
    public Boolean getIfTop() {
        return ifTop;
    }

    /**
     * 设置是否置顶
     *
     * @param ifTop 是否置顶
     */
    public void setIfTop(Boolean ifTop) {
        this.ifTop = ifTop;
    }

    /**
     * 获取是否新活动
     *
     * @return ifNew - 是否新活动
     */
    public Boolean getIfNew() {
        return ifNew;
    }

    /**
     * 设置是否新活动
     *
     * @param ifNew 是否新活动
     */
    public void setIfNew(Boolean ifNew) {
        this.ifNew = ifNew;
    }

    /**
     * 获取参加人数
     *
     * @return totalSign - 参加人数
     */
    public Integer getTotalSign() {
        return totalSign;
    }

    /**
     * 设置参加人数
     *
     * @param totalSign 参加人数
     */
    public void setTotalSign(Integer totalSign) {
        this.totalSign = totalSign;
    }

    /**
     * 获取想参加人数
     *
     * @return totalWant - 想参加人数
     */
    public Integer getTotalWant() {
        return totalWant;
    }

    /**
     * 设置想参加人数
     *
     * @param totalWant 想参加人数
     */
    public void setTotalWant(Integer totalWant) {
        this.totalWant = totalWant;
    }

    /**
     * 获取浏览数
     *
     * @return totalView - 浏览数
     */
    public Integer getTotalView() {
        return totalView;
    }

    /**
     * 设置浏览数
     *
     * @param totalView 浏览数
     */
    public void setTotalView(Integer totalView) {
        this.totalView = totalView;
    }

    /**
     * 获取分享数
     *
     * @return totalShare - 分享数
     */
    public Integer getTotalShare() {
        return totalShare;
    }

    /**
     * 设置分享数
     *
     * @param totalShare 分享数
     */
    public void setTotalShare(Integer totalShare) {
        this.totalShare = totalShare;
    }

    /**
     * 获取到场人数
     *
     * @return totalAttended - 到场人数
     */
    public Integer getTotalAttended() {
        return totalAttended;
    }

    /**
     * 设置到场人数
     *
     * @param totalAttended 到场人数
     */
    public void setTotalAttended(Integer totalAttended) {
        this.totalAttended = totalAttended;
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

    /**
     * 获取详细内容
     *
     * @return detail - 详细内容
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置详细内容
     *
     * @param detail 详细内容
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}