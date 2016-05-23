package com.github.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class TUser {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 登录密码
     */
    private String hashPasswd;

    /**
     * 微信id
     */
    private String wxId;

    /**
     * 微信Token
     */
    private String wxToken;

    /**
     * QQID
     */
    private String qqId;

    /**
     * QQ令牌
     */
    private String qqToken;

    /**
     * weibo标识
     */
    private String weiboId;

    /**
     * weibo令牌
     */
    private String weiboToken;

    /**
     * @t_attachment. 头像id
     */
    private Integer iconId;

    /**
     * 头像路径
     */
    private String iconPath;

    /**
     * 性别id(1:男,2:女)
     */
    private Short genderId;

    /**
     * 生日
     */
    private Date birthdate;

    /**
     * @t_province. 省份id
     */
    private Integer provinceId;

    /**
     * @t_city. 城市id
     */
    private Integer cityId;

    /**
     * @t_city. 区id
     */
    private Integer districtId;

    /**
     * 创建时间戳
     */
    private Integer createDate;

    /**
     * 最后更新时间戳
     */
    private Date updateTime;

    /**
     * 登录次数
     */
    private Integer totalLogin;

    /**
     * VIP级别(会员等级t_grade)
     */
    private Short vipLevel;

    /**
     * 积分
     */
    private Integer totalCredit;

    /**
     * 状态id(1:注册,2:激活,3:封号,4:待审核,9:删除)
     */
    private Short statusId;

    /**
     * 未读消息数
     */
    private Integer totalUnreadMsg;

    /**
     * 证件号码
     */
    private String idcardNo;

    /**
     * @t_catalog. 证件类型
     */
    private Integer idcardTypeId;

    /**
     * @t_attachment. 证件正面照片
     */
    private Integer idcardImageId1;

    /**
     * @t_attachment. 证件反面照片
     */
    private Integer idcardImageId2;

    /**
     * 审核时间
     */
    private Integer approveTime;

    /**
     * 审核意见
     */
    private String approveMark;

    /**
     * latitude(纬度)
     */
    private BigDecimal latitude;

    /**
     * longitude(经度)
     */
    private BigDecimal longitude;

    /**
     * 具体地址
     */
    private String address;

    /**
     * 1:iPhone,2:iPad,3:Android
     */
    private Short signFrom;

    /**
     * @t_device. 注册设备
     */
    private Integer deviceId;

    /**
     * @t_device. 最后登录设备
     */
    private Integer lastDeviceId;

    /**
     * 1:iPhone,2:iPad,3:Android
     */
    private Short lastFrom;

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
     * 获取真实姓名
     *
     * @return realName - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 获取昵称
     *
     * @return nickName - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取登录密码
     *
     * @return hashPasswd - 登录密码
     */
    public String getHashPasswd() {
        return hashPasswd;
    }

    /**
     * 设置登录密码
     *
     * @param hashPasswd 登录密码
     */
    public void setHashPasswd(String hashPasswd) {
        this.hashPasswd = hashPasswd == null ? null : hashPasswd.trim();
    }

    /**
     * 获取微信id
     *
     * @return wxId - 微信id
     */
    public String getWxId() {
        return wxId;
    }

    /**
     * 设置微信id
     *
     * @param wxId 微信id
     */
    public void setWxId(String wxId) {
        this.wxId = wxId == null ? null : wxId.trim();
    }

    /**
     * 获取微信Token
     *
     * @return wxToken - 微信Token
     */
    public String getWxToken() {
        return wxToken;
    }

    /**
     * 设置微信Token
     *
     * @param wxToken 微信Token
     */
    public void setWxToken(String wxToken) {
        this.wxToken = wxToken == null ? null : wxToken.trim();
    }

    /**
     * 获取QQID
     *
     * @return qqId - QQID
     */
    public String getQqId() {
        return qqId;
    }

    /**
     * 设置QQID
     *
     * @param qqId QQID
     */
    public void setQqId(String qqId) {
        this.qqId = qqId == null ? null : qqId.trim();
    }

    /**
     * 获取QQ令牌
     *
     * @return qqToken - QQ令牌
     */
    public String getQqToken() {
        return qqToken;
    }

    /**
     * 设置QQ令牌
     *
     * @param qqToken QQ令牌
     */
    public void setQqToken(String qqToken) {
        this.qqToken = qqToken == null ? null : qqToken.trim();
    }

    /**
     * 获取weibo标识
     *
     * @return weiboId - weibo标识
     */
    public String getWeiboId() {
        return weiboId;
    }

    /**
     * 设置weibo标识
     *
     * @param weiboId weibo标识
     */
    public void setWeiboId(String weiboId) {
        this.weiboId = weiboId == null ? null : weiboId.trim();
    }

    /**
     * 获取weibo令牌
     *
     * @return weiboToken - weibo令牌
     */
    public String getWeiboToken() {
        return weiboToken;
    }

    /**
     * 设置weibo令牌
     *
     * @param weiboToken weibo令牌
     */
    public void setWeiboToken(String weiboToken) {
        this.weiboToken = weiboToken == null ? null : weiboToken.trim();
    }

    /**
     * 获取@t_attachment. 头像id
     *
     * @return iconId - @t_attachment. 头像id
     */
    public Integer getIconId() {
        return iconId;
    }

    /**
     * 设置@t_attachment. 头像id
     *
     * @param iconId @t_attachment. 头像id
     */
    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    /**
     * 获取头像路径
     *
     * @return iconPath - 头像路径
     */
    public String getIconPath() {
        return iconPath;
    }

    /**
     * 设置头像路径
     *
     * @param iconPath 头像路径
     */
    public void setIconPath(String iconPath) {
        this.iconPath = iconPath == null ? null : iconPath.trim();
    }

    /**
     * 获取性别id(1:男,2:女)
     *
     * @return genderId - 性别id(1:男,2:女)
     */
    public Short getGenderId() {
        return genderId;
    }

    /**
     * 设置性别id(1:男,2:女)
     *
     * @param genderId 性别id(1:男,2:女)
     */
    public void setGenderId(Short genderId) {
        this.genderId = genderId;
    }

    /**
     * 获取生日
     *
     * @return birthdate - 生日
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * 设置生日
     *
     * @param birthdate 生日
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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
     * 获取@t_city. 区id
     *
     * @return districtId - @t_city. 区id
     */
    public Integer getDistrictId() {
        return districtId;
    }

    /**
     * 设置@t_city. 区id
     *
     * @param districtId @t_city. 区id
     */
    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    /**
     * 获取创建时间戳
     *
     * @return createDate - 创建时间戳
     */
    public Integer getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间戳
     *
     * @param createDate 创建时间戳
     */
    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取最后更新时间戳
     *
     * @return updateTime - 最后更新时间戳
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最后更新时间戳
     *
     * @param updateTime 最后更新时间戳
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取登录次数
     *
     * @return totalLogin - 登录次数
     */
    public Integer getTotalLogin() {
        return totalLogin;
    }

    /**
     * 设置登录次数
     *
     * @param totalLogin 登录次数
     */
    public void setTotalLogin(Integer totalLogin) {
        this.totalLogin = totalLogin;
    }

    /**
     * 获取VIP级别(会员等级t_grade)
     *
     * @return vipLevel - VIP级别(会员等级t_grade)
     */
    public Short getVipLevel() {
        return vipLevel;
    }

    /**
     * 设置VIP级别(会员等级t_grade)
     *
     * @param vipLevel VIP级别(会员等级t_grade)
     */
    public void setVipLevel(Short vipLevel) {
        this.vipLevel = vipLevel;
    }

    /**
     * 获取积分
     *
     * @return totalCredit - 积分
     */
    public Integer getTotalCredit() {
        return totalCredit;
    }

    /**
     * 设置积分
     *
     * @param totalCredit 积分
     */
    public void setTotalCredit(Integer totalCredit) {
        this.totalCredit = totalCredit;
    }

    /**
     * 获取状态id(1:注册,2:激活,3:封号,4:待审核,9:删除)
     *
     * @return statusId - 状态id(1:注册,2:激活,3:封号,4:待审核,9:删除)
     */
    public Short getStatusId() {
        return statusId;
    }

    /**
     * 设置状态id(1:注册,2:激活,3:封号,4:待审核,9:删除)
     *
     * @param statusId 状态id(1:注册,2:激活,3:封号,4:待审核,9:删除)
     */
    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    /**
     * 获取未读消息数
     *
     * @return totalUnreadMsg - 未读消息数
     */
    public Integer getTotalUnreadMsg() {
        return totalUnreadMsg;
    }

    /**
     * 设置未读消息数
     *
     * @param totalUnreadMsg 未读消息数
     */
    public void setTotalUnreadMsg(Integer totalUnreadMsg) {
        this.totalUnreadMsg = totalUnreadMsg;
    }

    /**
     * 获取证件号码
     *
     * @return idcardNo - 证件号码
     */
    public String getIdcardNo() {
        return idcardNo;
    }

    /**
     * 设置证件号码
     *
     * @param idcardNo 证件号码
     */
    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo == null ? null : idcardNo.trim();
    }

    /**
     * 获取@t_catalog. 证件类型
     *
     * @return idcardTypeId - @t_catalog. 证件类型
     */
    public Integer getIdcardTypeId() {
        return idcardTypeId;
    }

    /**
     * 设置@t_catalog. 证件类型
     *
     * @param idcardTypeId @t_catalog. 证件类型
     */
    public void setIdcardTypeId(Integer idcardTypeId) {
        this.idcardTypeId = idcardTypeId;
    }

    /**
     * 获取@t_attachment. 证件正面照片
     *
     * @return idcardImageId1 - @t_attachment. 证件正面照片
     */
    public Integer getIdcardImageId1() {
        return idcardImageId1;
    }

    /**
     * 设置@t_attachment. 证件正面照片
     *
     * @param idcardImageId1 @t_attachment. 证件正面照片
     */
    public void setIdcardImageId1(Integer idcardImageId1) {
        this.idcardImageId1 = idcardImageId1;
    }

    /**
     * 获取@t_attachment. 证件反面照片
     *
     * @return idcardImageId2 - @t_attachment. 证件反面照片
     */
    public Integer getIdcardImageId2() {
        return idcardImageId2;
    }

    /**
     * 设置@t_attachment. 证件反面照片
     *
     * @param idcardImageId2 @t_attachment. 证件反面照片
     */
    public void setIdcardImageId2(Integer idcardImageId2) {
        this.idcardImageId2 = idcardImageId2;
    }

    /**
     * 获取审核时间
     *
     * @return approveTime - 审核时间
     */
    public Integer getApproveTime() {
        return approveTime;
    }

    /**
     * 设置审核时间
     *
     * @param approveTime 审核时间
     */
    public void setApproveTime(Integer approveTime) {
        this.approveTime = approveTime;
    }

    /**
     * 获取审核意见
     *
     * @return approveMark - 审核意见
     */
    public String getApproveMark() {
        return approveMark;
    }

    /**
     * 设置审核意见
     *
     * @param approveMark 审核意见
     */
    public void setApproveMark(String approveMark) {
        this.approveMark = approveMark == null ? null : approveMark.trim();
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
     * 获取具体地址
     *
     * @return address - 具体地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置具体地址
     *
     * @param address 具体地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取1:iPhone,2:iPad,3:Android
     *
     * @return signFrom - 1:iPhone,2:iPad,3:Android
     */
    public Short getSignFrom() {
        return signFrom;
    }

    /**
     * 设置1:iPhone,2:iPad,3:Android
     *
     * @param signFrom 1:iPhone,2:iPad,3:Android
     */
    public void setSignFrom(Short signFrom) {
        this.signFrom = signFrom;
    }

    /**
     * 获取@t_device. 注册设备
     *
     * @return deviceId - @t_device. 注册设备
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * 设置@t_device. 注册设备
     *
     * @param deviceId @t_device. 注册设备
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取@t_device. 最后登录设备
     *
     * @return lastDeviceId - @t_device. 最后登录设备
     */
    public Integer getLastDeviceId() {
        return lastDeviceId;
    }

    /**
     * 设置@t_device. 最后登录设备
     *
     * @param lastDeviceId @t_device. 最后登录设备
     */
    public void setLastDeviceId(Integer lastDeviceId) {
        this.lastDeviceId = lastDeviceId;
    }

    /**
     * 获取1:iPhone,2:iPad,3:Android
     *
     * @return lastFrom - 1:iPhone,2:iPad,3:Android
     */
    public Short getLastFrom() {
        return lastFrom;
    }

    /**
     * 设置1:iPhone,2:iPad,3:Android
     *
     * @param lastFrom 1:iPhone,2:iPad,3:Android
     */
    public void setLastFrom(Short lastFrom) {
        this.lastFrom = lastFrom;
    }
}