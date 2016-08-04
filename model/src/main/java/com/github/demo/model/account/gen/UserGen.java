package com.github.demo.model.account.gen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.msgpack.annotation.MessagePackMessage;

@Table(name = "t_user")
@MessagePackMessage
public abstract class UserGen implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 真实姓名
     */
    private String real_name;

    /**
     * 昵称
     */
    private String nick_name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 登录密码
     */
    private String hash_passwd;

    /**
     * 微信id
     */
    private String wx_id;

    /**
     * 微信Token
     */
    private String wx_token;

    /**
     * QQID
     */
    private String qq_id;

    /**
     * QQ令牌
     */
    private String qq_token;

    /**
     * weibo标识
     */
    private String weibo_id;

    /**
     * weibo令牌
     */
    private String weibo_token;

    /**
     * @t_attachment. 头像id
     */
    private Integer icon_id;

    /**
     * 头像路径
     */
    private String icon_path;

    /**
     * 性别id(1:男,2:女)
     */
    private Short gender_id;

    /**
     * 生日
     */
    private Date birthdate;

    /**
     * @t_province. 省份id
     */
    private Integer province_id;

    /**
     * @t_city. 城市id
     */
    private Integer city_id;

    /**
     * @t_city. 区id
     */
    private Integer district_id;

    /**
     * 创建时间戳
     */
    private Date create_date;

    /**
     * 最后更新时间戳
     */
    private Date update_time;

    /**
     * 登录次数
     */
    private Integer total_login;

    /**
     * VIP级别(会员等级t_grade)
     */
    private Short vip_level;

    /**
     * 积分
     */
    private Integer total_credit;

    /**
     * 状态id(1:注册,2:激活,3:封号,4:待审核,9:删除)
     */
    private Short status_id;

    /**
     * 未读消息数
     */
    private Integer total_unread_msg;

    /**
     * 证件号码
     */
    private String idcard_no;

    /**
     * @t_catalog. 证件类型
     */
    private Integer idcard_type_id;

    /**
     * @t_attachment. 证件正面照片
     */
    private Integer idcard_image_id1;

    /**
     * @t_attachment. 证件反面照片
     */
    private Integer idcard_image_id2;

    /**
     * 审核时间
     */
    private Date approve_time;

    /**
     * 审核意见
     */
    private String approve_mark;

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
    private Short sign_from;

    /**
     * @t_device. 注册设备
     */
    private Integer device_id;

    /**
     * @t_device. 最后登录设备
     */
    private Integer last_device_id;

    /**
     * 1:iPhone,2:iPad,3:Android
     */
    private Short last_from;

    /**
     * 总积分
     */
    private Integer total_score;

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
     * @return real_name - 真实姓名
     */
    public String getReal_name() {
        return real_name;
    }

    /**
     * 设置真实姓名
     *
     * @param real_name 真实姓名
     */
    public void setReal_name(String real_name) {
        this.real_name = real_name == null ? null : real_name.trim();
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNick_name() {
        return nick_name;
    }

    /**
     * 设置昵称
     *
     * @param nick_name 昵称
     */
    public void setNick_name(String nick_name) {
        this.nick_name = nick_name == null ? null : nick_name.trim();
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
     * @return hash_passwd - 登录密码
     */
    public String getHash_passwd() {
        return hash_passwd;
    }

    /**
     * 设置登录密码
     *
     * @param hash_passwd 登录密码
     */
    public void setHash_passwd(String hash_passwd) {
        this.hash_passwd = hash_passwd == null ? null : hash_passwd.trim();
    }

    /**
     * 获取微信id
     *
     * @return wx_id - 微信id
     */
    public String getWx_id() {
        return wx_id;
    }

    /**
     * 设置微信id
     *
     * @param wx_id 微信id
     */
    public void setWx_id(String wx_id) {
        this.wx_id = wx_id == null ? null : wx_id.trim();
    }

    /**
     * 获取微信Token
     *
     * @return wx_token - 微信Token
     */
    public String getWx_token() {
        return wx_token;
    }

    /**
     * 设置微信Token
     *
     * @param wx_token 微信Token
     */
    public void setWx_token(String wx_token) {
        this.wx_token = wx_token == null ? null : wx_token.trim();
    }

    /**
     * 获取QQID
     *
     * @return qq_id - QQID
     */
    public String getQq_id() {
        return qq_id;
    }

    /**
     * 设置QQID
     *
     * @param qq_id QQID
     */
    public void setQq_id(String qq_id) {
        this.qq_id = qq_id == null ? null : qq_id.trim();
    }

    /**
     * 获取QQ令牌
     *
     * @return qq_token - QQ令牌
     */
    public String getQq_token() {
        return qq_token;
    }

    /**
     * 设置QQ令牌
     *
     * @param qq_token QQ令牌
     */
    public void setQq_token(String qq_token) {
        this.qq_token = qq_token == null ? null : qq_token.trim();
    }

    /**
     * 获取weibo标识
     *
     * @return weibo_id - weibo标识
     */
    public String getWeibo_id() {
        return weibo_id;
    }

    /**
     * 设置weibo标识
     *
     * @param weibo_id weibo标识
     */
    public void setWeibo_id(String weibo_id) {
        this.weibo_id = weibo_id == null ? null : weibo_id.trim();
    }

    /**
     * 获取weibo令牌
     *
     * @return weibo_token - weibo令牌
     */
    public String getWeibo_token() {
        return weibo_token;
    }

    /**
     * 设置weibo令牌
     *
     * @param weibo_token weibo令牌
     */
    public void setWeibo_token(String weibo_token) {
        this.weibo_token = weibo_token == null ? null : weibo_token.trim();
    }

    /**
     * 获取@t_attachment. 头像id
     *
     * @return icon_id - @t_attachment. 头像id
     */
    public Integer getIcon_id() {
        return icon_id;
    }

    /**
     * 设置@t_attachment. 头像id
     *
     * @param icon_id @t_attachment. 头像id
     */
    public void setIcon_id(Integer icon_id) {
        this.icon_id = icon_id;
    }

    /**
     * 获取头像路径
     *
     * @return icon_path - 头像路径
     */
    public String getIcon_path() {
        return icon_path;
    }

    /**
     * 设置头像路径
     *
     * @param icon_path 头像路径
     */
    public void setIcon_path(String icon_path) {
        this.icon_path = icon_path == null ? null : icon_path.trim();
    }

    /**
     * 获取性别id(1:男,2:女)
     *
     * @return gender_id - 性别id(1:男,2:女)
     */
    public Short getGender_id() {
        return gender_id;
    }

    /**
     * 设置性别id(1:男,2:女)
     *
     * @param gender_id 性别id(1:男,2:女)
     */
    public void setGender_id(Short gender_id) {
        this.gender_id = gender_id;
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
     * @return province_id - @t_province. 省份id
     */
    public Integer getProvince_id() {
        return province_id;
    }

    /**
     * 设置@t_province. 省份id
     *
     * @param province_id @t_province. 省份id
     */
    public void setProvince_id(Integer province_id) {
        this.province_id = province_id;
    }

    /**
     * 获取@t_city. 城市id
     *
     * @return city_id - @t_city. 城市id
     */
    public Integer getCity_id() {
        return city_id;
    }

    /**
     * 设置@t_city. 城市id
     *
     * @param city_id @t_city. 城市id
     */
    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    /**
     * 获取@t_city. 区id
     *
     * @return district_id - @t_city. 区id
     */
    public Integer getDistrict_id() {
        return district_id;
    }

    /**
     * 设置@t_city. 区id
     *
     * @param district_id @t_city. 区id
     */
    public void setDistrict_id(Integer district_id) {
        this.district_id = district_id;
    }

    /**
     * 获取创建时间戳
     *
     * @return create_date - 创建时间戳
     */
    public Date getCreate_date() {
        return create_date;
    }

    /**
     * 设置创建时间戳
     *
     * @param create_date 创建时间戳
     */
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    /**
     * 获取最后更新时间戳
     *
     * @return update_time - 最后更新时间戳
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * 设置最后更新时间戳
     *
     * @param update_time 最后更新时间戳
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * 获取登录次数
     *
     * @return total_login - 登录次数
     */
    public Integer getTotal_login() {
        return total_login;
    }

    /**
     * 设置登录次数
     *
     * @param total_login 登录次数
     */
    public void setTotal_login(Integer total_login) {
        this.total_login = total_login;
    }

    /**
     * 获取VIP级别(会员等级t_grade)
     *
     * @return vip_level - VIP级别(会员等级t_grade)
     */
    public Short getVip_level() {
        return vip_level;
    }

    /**
     * 设置VIP级别(会员等级t_grade)
     *
     * @param vip_level VIP级别(会员等级t_grade)
     */
    public void setVip_level(Short vip_level) {
        this.vip_level = vip_level;
    }

    /**
     * 获取积分
     *
     * @return total_credit - 积分
     */
    public Integer getTotal_credit() {
        return total_credit;
    }

    /**
     * 设置积分
     *
     * @param total_credit 积分
     */
    public void setTotal_credit(Integer total_credit) {
        this.total_credit = total_credit;
    }

    /**
     * 获取状态id(1:注册,2:激活,3:封号,4:待审核,9:删除)
     *
     * @return status_id - 状态id(1:注册,2:激活,3:封号,4:待审核,9:删除)
     */
    public Short getStatus_id() {
        return status_id;
    }

    /**
     * 设置状态id(1:注册,2:激活,3:封号,4:待审核,9:删除)
     *
     * @param status_id 状态id(1:注册,2:激活,3:封号,4:待审核,9:删除)
     */
    public void setStatus_id(Short status_id) {
        this.status_id = status_id;
    }

    /**
     * 获取未读消息数
     *
     * @return total_unread_msg - 未读消息数
     */
    public Integer getTotal_unread_msg() {
        return total_unread_msg;
    }

    /**
     * 设置未读消息数
     *
     * @param total_unread_msg 未读消息数
     */
    public void setTotal_unread_msg(Integer total_unread_msg) {
        this.total_unread_msg = total_unread_msg;
    }

    /**
     * 获取证件号码
     *
     * @return idcard_no - 证件号码
     */
    public String getIdcard_no() {
        return idcard_no;
    }

    /**
     * 设置证件号码
     *
     * @param idcard_no 证件号码
     */
    public void setIdcard_no(String idcard_no) {
        this.idcard_no = idcard_no == null ? null : idcard_no.trim();
    }

    /**
     * 获取@t_catalog. 证件类型
     *
     * @return idcard_type_id - @t_catalog. 证件类型
     */
    public Integer getIdcard_type_id() {
        return idcard_type_id;
    }

    /**
     * 设置@t_catalog. 证件类型
     *
     * @param idcard_type_id @t_catalog. 证件类型
     */
    public void setIdcard_type_id(Integer idcard_type_id) {
        this.idcard_type_id = idcard_type_id;
    }

    /**
     * 获取@t_attachment. 证件正面照片
     *
     * @return idcard_image_id1 - @t_attachment. 证件正面照片
     */
    public Integer getIdcard_image_id1() {
        return idcard_image_id1;
    }

    /**
     * 设置@t_attachment. 证件正面照片
     *
     * @param idcard_image_id1 @t_attachment. 证件正面照片
     */
    public void setIdcard_image_id1(Integer idcard_image_id1) {
        this.idcard_image_id1 = idcard_image_id1;
    }

    /**
     * 获取@t_attachment. 证件反面照片
     *
     * @return idcard_image_id2 - @t_attachment. 证件反面照片
     */
    public Integer getIdcard_image_id2() {
        return idcard_image_id2;
    }

    /**
     * 设置@t_attachment. 证件反面照片
     *
     * @param idcard_image_id2 @t_attachment. 证件反面照片
     */
    public void setIdcard_image_id2(Integer idcard_image_id2) {
        this.idcard_image_id2 = idcard_image_id2;
    }

    /**
     * 获取审核时间
     *
     * @return approve_time - 审核时间
     */
    public Date getApprove_time() {
        return approve_time;
    }

    /**
     * 设置审核时间
     *
     * @param approve_time 审核时间
     */
    public void setApprove_time(Date approve_time) {
        this.approve_time = approve_time;
    }

    /**
     * 获取审核意见
     *
     * @return approve_mark - 审核意见
     */
    public String getApprove_mark() {
        return approve_mark;
    }

    /**
     * 设置审核意见
     *
     * @param approve_mark 审核意见
     */
    public void setApprove_mark(String approve_mark) {
        this.approve_mark = approve_mark == null ? null : approve_mark.trim();
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
     * @return sign_from - 1:iPhone,2:iPad,3:Android
     */
    public Short getSign_from() {
        return sign_from;
    }

    /**
     * 设置1:iPhone,2:iPad,3:Android
     *
     * @param sign_from 1:iPhone,2:iPad,3:Android
     */
    public void setSign_from(Short sign_from) {
        this.sign_from = sign_from;
    }

    /**
     * 获取@t_device. 注册设备
     *
     * @return device_id - @t_device. 注册设备
     */
    public Integer getDevice_id() {
        return device_id;
    }

    /**
     * 设置@t_device. 注册设备
     *
     * @param device_id @t_device. 注册设备
     */
    public void setDevice_id(Integer device_id) {
        this.device_id = device_id;
    }

    /**
     * 获取@t_device. 最后登录设备
     *
     * @return last_device_id - @t_device. 最后登录设备
     */
    public Integer getLast_device_id() {
        return last_device_id;
    }

    /**
     * 设置@t_device. 最后登录设备
     *
     * @param last_device_id @t_device. 最后登录设备
     */
    public void setLast_device_id(Integer last_device_id) {
        this.last_device_id = last_device_id;
    }

    /**
     * 获取1:iPhone,2:iPad,3:Android
     *
     * @return last_from - 1:iPhone,2:iPad,3:Android
     */
    public Short getLast_from() {
        return last_from;
    }

    /**
     * 设置1:iPhone,2:iPad,3:Android
     *
     * @param last_from 1:iPhone,2:iPad,3:Android
     */
    public void setLast_from(Short last_from) {
        this.last_from = last_from;
    }

    /**
     * 获取总积分
     *
     * @return total_score - 总积分
     */
    public Integer getTotal_score() {
        return total_score;
    }

    /**
     * 设置总积分
     *
     * @param total_score 总积分
     */
    public void setTotal_score(Integer total_score) {
        this.total_score = total_score;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserGen other = (UserGen) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReal_name() == null ? other.getReal_name() == null : this.getReal_name().equals(other.getReal_name()))
            && (this.getNick_name() == null ? other.getNick_name() == null : this.getNick_name().equals(other.getNick_name()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getHash_passwd() == null ? other.getHash_passwd() == null : this.getHash_passwd().equals(other.getHash_passwd()))
            && (this.getWx_id() == null ? other.getWx_id() == null : this.getWx_id().equals(other.getWx_id()))
            && (this.getWx_token() == null ? other.getWx_token() == null : this.getWx_token().equals(other.getWx_token()))
            && (this.getQq_id() == null ? other.getQq_id() == null : this.getQq_id().equals(other.getQq_id()))
            && (this.getQq_token() == null ? other.getQq_token() == null : this.getQq_token().equals(other.getQq_token()))
            && (this.getWeibo_id() == null ? other.getWeibo_id() == null : this.getWeibo_id().equals(other.getWeibo_id()))
            && (this.getWeibo_token() == null ? other.getWeibo_token() == null : this.getWeibo_token().equals(other.getWeibo_token()))
            && (this.getIcon_id() == null ? other.getIcon_id() == null : this.getIcon_id().equals(other.getIcon_id()))
            && (this.getIcon_path() == null ? other.getIcon_path() == null : this.getIcon_path().equals(other.getIcon_path()))
            && (this.getGender_id() == null ? other.getGender_id() == null : this.getGender_id().equals(other.getGender_id()))
            && (this.getBirthdate() == null ? other.getBirthdate() == null : this.getBirthdate().equals(other.getBirthdate()))
            && (this.getProvince_id() == null ? other.getProvince_id() == null : this.getProvince_id().equals(other.getProvince_id()))
            && (this.getCity_id() == null ? other.getCity_id() == null : this.getCity_id().equals(other.getCity_id()))
            && (this.getDistrict_id() == null ? other.getDistrict_id() == null : this.getDistrict_id().equals(other.getDistrict_id()))
            && (this.getCreate_date() == null ? other.getCreate_date() == null : this.getCreate_date().equals(other.getCreate_date()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getTotal_login() == null ? other.getTotal_login() == null : this.getTotal_login().equals(other.getTotal_login()))
            && (this.getVip_level() == null ? other.getVip_level() == null : this.getVip_level().equals(other.getVip_level()))
            && (this.getTotal_credit() == null ? other.getTotal_credit() == null : this.getTotal_credit().equals(other.getTotal_credit()))
            && (this.getStatus_id() == null ? other.getStatus_id() == null : this.getStatus_id().equals(other.getStatus_id()))
            && (this.getTotal_unread_msg() == null ? other.getTotal_unread_msg() == null : this.getTotal_unread_msg().equals(other.getTotal_unread_msg()))
            && (this.getIdcard_no() == null ? other.getIdcard_no() == null : this.getIdcard_no().equals(other.getIdcard_no()))
            && (this.getIdcard_type_id() == null ? other.getIdcard_type_id() == null : this.getIdcard_type_id().equals(other.getIdcard_type_id()))
            && (this.getIdcard_image_id1() == null ? other.getIdcard_image_id1() == null : this.getIdcard_image_id1().equals(other.getIdcard_image_id1()))
            && (this.getIdcard_image_id2() == null ? other.getIdcard_image_id2() == null : this.getIdcard_image_id2().equals(other.getIdcard_image_id2()))
            && (this.getApprove_time() == null ? other.getApprove_time() == null : this.getApprove_time().equals(other.getApprove_time()))
            && (this.getApprove_mark() == null ? other.getApprove_mark() == null : this.getApprove_mark().equals(other.getApprove_mark()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getSign_from() == null ? other.getSign_from() == null : this.getSign_from().equals(other.getSign_from()))
            && (this.getDevice_id() == null ? other.getDevice_id() == null : this.getDevice_id().equals(other.getDevice_id()))
            && (this.getLast_device_id() == null ? other.getLast_device_id() == null : this.getLast_device_id().equals(other.getLast_device_id()))
            && (this.getLast_from() == null ? other.getLast_from() == null : this.getLast_from().equals(other.getLast_from()))
            && (this.getTotal_score() == null ? other.getTotal_score() == null : this.getTotal_score().equals(other.getTotal_score()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReal_name() == null) ? 0 : getReal_name().hashCode());
        result = prime * result + ((getNick_name() == null) ? 0 : getNick_name().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getHash_passwd() == null) ? 0 : getHash_passwd().hashCode());
        result = prime * result + ((getWx_id() == null) ? 0 : getWx_id().hashCode());
        result = prime * result + ((getWx_token() == null) ? 0 : getWx_token().hashCode());
        result = prime * result + ((getQq_id() == null) ? 0 : getQq_id().hashCode());
        result = prime * result + ((getQq_token() == null) ? 0 : getQq_token().hashCode());
        result = prime * result + ((getWeibo_id() == null) ? 0 : getWeibo_id().hashCode());
        result = prime * result + ((getWeibo_token() == null) ? 0 : getWeibo_token().hashCode());
        result = prime * result + ((getIcon_id() == null) ? 0 : getIcon_id().hashCode());
        result = prime * result + ((getIcon_path() == null) ? 0 : getIcon_path().hashCode());
        result = prime * result + ((getGender_id() == null) ? 0 : getGender_id().hashCode());
        result = prime * result + ((getBirthdate() == null) ? 0 : getBirthdate().hashCode());
        result = prime * result + ((getProvince_id() == null) ? 0 : getProvince_id().hashCode());
        result = prime * result + ((getCity_id() == null) ? 0 : getCity_id().hashCode());
        result = prime * result + ((getDistrict_id() == null) ? 0 : getDistrict_id().hashCode());
        result = prime * result + ((getCreate_date() == null) ? 0 : getCreate_date().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getTotal_login() == null) ? 0 : getTotal_login().hashCode());
        result = prime * result + ((getVip_level() == null) ? 0 : getVip_level().hashCode());
        result = prime * result + ((getTotal_credit() == null) ? 0 : getTotal_credit().hashCode());
        result = prime * result + ((getStatus_id() == null) ? 0 : getStatus_id().hashCode());
        result = prime * result + ((getTotal_unread_msg() == null) ? 0 : getTotal_unread_msg().hashCode());
        result = prime * result + ((getIdcard_no() == null) ? 0 : getIdcard_no().hashCode());
        result = prime * result + ((getIdcard_type_id() == null) ? 0 : getIdcard_type_id().hashCode());
        result = prime * result + ((getIdcard_image_id1() == null) ? 0 : getIdcard_image_id1().hashCode());
        result = prime * result + ((getIdcard_image_id2() == null) ? 0 : getIdcard_image_id2().hashCode());
        result = prime * result + ((getApprove_time() == null) ? 0 : getApprove_time().hashCode());
        result = prime * result + ((getApprove_mark() == null) ? 0 : getApprove_mark().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getSign_from() == null) ? 0 : getSign_from().hashCode());
        result = prime * result + ((getDevice_id() == null) ? 0 : getDevice_id().hashCode());
        result = prime * result + ((getLast_device_id() == null) ? 0 : getLast_device_id().hashCode());
        result = prime * result + ((getLast_from() == null) ? 0 : getLast_from().hashCode());
        result = prime * result + ((getTotal_score() == null) ? 0 : getTotal_score().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", real_name=").append(real_name);
        sb.append(", nick_name=").append(nick_name);
        sb.append(", mobile=").append(mobile);
        sb.append(", hash_passwd=").append(hash_passwd);
        sb.append(", wx_id=").append(wx_id);
        sb.append(", wx_token=").append(wx_token);
        sb.append(", qq_id=").append(qq_id);
        sb.append(", qq_token=").append(qq_token);
        sb.append(", weibo_id=").append(weibo_id);
        sb.append(", weibo_token=").append(weibo_token);
        sb.append(", icon_id=").append(icon_id);
        sb.append(", icon_path=").append(icon_path);
        sb.append(", gender_id=").append(gender_id);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", province_id=").append(province_id);
        sb.append(", city_id=").append(city_id);
        sb.append(", district_id=").append(district_id);
        sb.append(", create_date=").append(create_date);
        sb.append(", update_time=").append(update_time);
        sb.append(", total_login=").append(total_login);
        sb.append(", vip_level=").append(vip_level);
        sb.append(", total_credit=").append(total_credit);
        sb.append(", status_id=").append(status_id);
        sb.append(", total_unread_msg=").append(total_unread_msg);
        sb.append(", idcard_no=").append(idcard_no);
        sb.append(", idcard_type_id=").append(idcard_type_id);
        sb.append(", idcard_image_id1=").append(idcard_image_id1);
        sb.append(", idcard_image_id2=").append(idcard_image_id2);
        sb.append(", approve_time=").append(approve_time);
        sb.append(", approve_mark=").append(approve_mark);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", address=").append(address);
        sb.append(", sign_from=").append(sign_from);
        sb.append(", device_id=").append(device_id);
        sb.append(", last_device_id=").append(last_device_id);
        sb.append(", last_from=").append(last_from);
        sb.append(", total_score=").append(total_score);
        sb.append("]");
        return sb.toString();
    }
}