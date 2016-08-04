package com.github.demo.model.account.gen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.msgpack.annotation.MessagePackMessage;

@Table(name = "t_activity")
@MessagePackMessage
public abstract class ActivityGen implements Serializable {
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
    private String chs_code;

    /**
     * @t_bar. 举行书吧id
     */
    private Integer bar_id;

    /**
     * @t_province. 省份Id
     */
    private Integer province_id;

    /**
     * @t_city. 城市id
     */
    private Integer city_id;

    /**
     * @t_district. 区/镇id
     */
    private Integer district_id;

    /**
     * 具体街道地址
     */
    private String address;

    /**
     * 开始时间
     */
    private Date start_time;

    /**
     * 结束时间
     */
    private Date end_time;

    /**
     * @t_user. 发布人id
     */
    private Integer create_user_id;

    /**
     * 发布时间
     */
    private Date create_time;

    /**
     * 最后更新时间
     */
    private Date update_time;

    /**
     * 状态(1:准备中,2:审核, 3:发布,4:进行中,5:结束,9:删除)
     */
    private Short status_id;

    /**
     * 海报id
     */
    private Integer cover_image_id;

    /**
     * @t_catalog. 类别id
     */
    private Integer category_id;

    /**
     * 报名结束时间
     */
    private Date sign_end_time;

    /**
     * 联系电话
     */
    private String contact_phone;

    /**
     * 联系人名称
     */
    private String contact_name;

    /**
     * 是否推荐
     */
    private Boolean if_recommend;

    /**
     * 是否置顶
     */
    private Boolean if_top;

    /**
     * 是否新活动
     */
    private Boolean if_new;

    /**
     * 参加人数
     */
    private Integer total_sign;

    /**
     * 想参加人数
     */
    private Integer total_want;

    /**
     * 浏览数
     */
    private Integer total_view;

    /**
     * 分享数
     */
    private Integer total_share;

    /**
     * 到场人数
     */
    private Integer total_attended;

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
    private Short create_from;

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
     * @return chs_code - 拼音代码
     */
    public String getChs_code() {
        return chs_code;
    }

    /**
     * 设置拼音代码
     *
     * @param chs_code 拼音代码
     */
    public void setChs_code(String chs_code) {
        this.chs_code = chs_code == null ? null : chs_code.trim();
    }

    /**
     * 获取@t_bar. 举行书吧id
     *
     * @return bar_id - @t_bar. 举行书吧id
     */
    public Integer getBar_id() {
        return bar_id;
    }

    /**
     * 设置@t_bar. 举行书吧id
     *
     * @param bar_id @t_bar. 举行书吧id
     */
    public void setBar_id(Integer bar_id) {
        this.bar_id = bar_id;
    }

    /**
     * 获取@t_province. 省份Id
     *
     * @return province_id - @t_province. 省份Id
     */
    public Integer getProvince_id() {
        return province_id;
    }

    /**
     * 设置@t_province. 省份Id
     *
     * @param province_id @t_province. 省份Id
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
     * 获取@t_district. 区/镇id
     *
     * @return district_id - @t_district. 区/镇id
     */
    public Integer getDistrict_id() {
        return district_id;
    }

    /**
     * 设置@t_district. 区/镇id
     *
     * @param district_id @t_district. 区/镇id
     */
    public void setDistrict_id(Integer district_id) {
        this.district_id = district_id;
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
     * @return start_time - 开始时间
     */
    public Date getStart_time() {
        return start_time;
    }

    /**
     * 设置开始时间
     *
     * @param start_time 开始时间
     */
    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEnd_time() {
        return end_time;
    }

    /**
     * 设置结束时间
     *
     * @param end_time 结束时间
     */
    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    /**
     * 获取@t_user. 发布人id
     *
     * @return create_user_id - @t_user. 发布人id
     */
    public Integer getCreate_user_id() {
        return create_user_id;
    }

    /**
     * 设置@t_user. 发布人id
     *
     * @param create_user_id @t_user. 发布人id
     */
    public void setCreate_user_id(Integer create_user_id) {
        this.create_user_id = create_user_id;
    }

    /**
     * 获取发布时间
     *
     * @return create_time - 发布时间
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * 设置发布时间
     *
     * @param create_time 发布时间
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * 获取最后更新时间
     *
     * @return update_time - 最后更新时间
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * 设置最后更新时间
     *
     * @param update_time 最后更新时间
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * 获取状态(1:准备中,2:审核, 3:发布,4:进行中,5:结束,9:删除)
     *
     * @return status_id - 状态(1:准备中,2:审核, 3:发布,4:进行中,5:结束,9:删除)
     */
    public Short getStatus_id() {
        return status_id;
    }

    /**
     * 设置状态(1:准备中,2:审核, 3:发布,4:进行中,5:结束,9:删除)
     *
     * @param status_id 状态(1:准备中,2:审核, 3:发布,4:进行中,5:结束,9:删除)
     */
    public void setStatus_id(Short status_id) {
        this.status_id = status_id;
    }

    /**
     * 获取海报id
     *
     * @return cover_image_id - 海报id
     */
    public Integer getCover_image_id() {
        return cover_image_id;
    }

    /**
     * 设置海报id
     *
     * @param cover_image_id 海报id
     */
    public void setCover_image_id(Integer cover_image_id) {
        this.cover_image_id = cover_image_id;
    }

    /**
     * 获取@t_catalog. 类别id
     *
     * @return category_id - @t_catalog. 类别id
     */
    public Integer getCategory_id() {
        return category_id;
    }

    /**
     * 设置@t_catalog. 类别id
     *
     * @param category_id @t_catalog. 类别id
     */
    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    /**
     * 获取报名结束时间
     *
     * @return sign_end_time - 报名结束时间
     */
    public Date getSign_end_time() {
        return sign_end_time;
    }

    /**
     * 设置报名结束时间
     *
     * @param sign_end_time 报名结束时间
     */
    public void setSign_end_time(Date sign_end_time) {
        this.sign_end_time = sign_end_time;
    }

    /**
     * 获取联系电话
     *
     * @return contact_phone - 联系电话
     */
    public String getContact_phone() {
        return contact_phone;
    }

    /**
     * 设置联系电话
     *
     * @param contact_phone 联系电话
     */
    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone == null ? null : contact_phone.trim();
    }

    /**
     * 获取联系人名称
     *
     * @return contact_name - 联系人名称
     */
    public String getContact_name() {
        return contact_name;
    }

    /**
     * 设置联系人名称
     *
     * @param contact_name 联系人名称
     */
    public void setContact_name(String contact_name) {
        this.contact_name = contact_name == null ? null : contact_name.trim();
    }

    /**
     * 获取是否推荐
     *
     * @return if_recommend - 是否推荐
     */
    public Boolean getIf_recommend() {
        return if_recommend;
    }

    /**
     * 设置是否推荐
     *
     * @param if_recommend 是否推荐
     */
    public void setIf_recommend(Boolean if_recommend) {
        this.if_recommend = if_recommend;
    }

    /**
     * 获取是否置顶
     *
     * @return if_top - 是否置顶
     */
    public Boolean getIf_top() {
        return if_top;
    }

    /**
     * 设置是否置顶
     *
     * @param if_top 是否置顶
     */
    public void setIf_top(Boolean if_top) {
        this.if_top = if_top;
    }

    /**
     * 获取是否新活动
     *
     * @return if_new - 是否新活动
     */
    public Boolean getIf_new() {
        return if_new;
    }

    /**
     * 设置是否新活动
     *
     * @param if_new 是否新活动
     */
    public void setIf_new(Boolean if_new) {
        this.if_new = if_new;
    }

    /**
     * 获取参加人数
     *
     * @return total_sign - 参加人数
     */
    public Integer getTotal_sign() {
        return total_sign;
    }

    /**
     * 设置参加人数
     *
     * @param total_sign 参加人数
     */
    public void setTotal_sign(Integer total_sign) {
        this.total_sign = total_sign;
    }

    /**
     * 获取想参加人数
     *
     * @return total_want - 想参加人数
     */
    public Integer getTotal_want() {
        return total_want;
    }

    /**
     * 设置想参加人数
     *
     * @param total_want 想参加人数
     */
    public void setTotal_want(Integer total_want) {
        this.total_want = total_want;
    }

    /**
     * 获取浏览数
     *
     * @return total_view - 浏览数
     */
    public Integer getTotal_view() {
        return total_view;
    }

    /**
     * 设置浏览数
     *
     * @param total_view 浏览数
     */
    public void setTotal_view(Integer total_view) {
        this.total_view = total_view;
    }

    /**
     * 获取分享数
     *
     * @return total_share - 分享数
     */
    public Integer getTotal_share() {
        return total_share;
    }

    /**
     * 设置分享数
     *
     * @param total_share 分享数
     */
    public void setTotal_share(Integer total_share) {
        this.total_share = total_share;
    }

    /**
     * 获取到场人数
     *
     * @return total_attended - 到场人数
     */
    public Integer getTotal_attended() {
        return total_attended;
    }

    /**
     * 设置到场人数
     *
     * @param total_attended 到场人数
     */
    public void setTotal_attended(Integer total_attended) {
        this.total_attended = total_attended;
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
     * @return create_from - 1:iPhone,2:iPad,3:Android
     */
    public Short getCreate_from() {
        return create_from;
    }

    /**
     * 设置1:iPhone,2:iPad,3:Android
     *
     * @param create_from 1:iPhone,2:iPad,3:Android
     */
    public void setCreate_from(Short create_from) {
        this.create_from = create_from;
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
        ActivityGen other = (ActivityGen) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getChs_code() == null ? other.getChs_code() == null : this.getChs_code().equals(other.getChs_code()))
            && (this.getBar_id() == null ? other.getBar_id() == null : this.getBar_id().equals(other.getBar_id()))
            && (this.getProvince_id() == null ? other.getProvince_id() == null : this.getProvince_id().equals(other.getProvince_id()))
            && (this.getCity_id() == null ? other.getCity_id() == null : this.getCity_id().equals(other.getCity_id()))
            && (this.getDistrict_id() == null ? other.getDistrict_id() == null : this.getDistrict_id().equals(other.getDistrict_id()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getStart_time() == null ? other.getStart_time() == null : this.getStart_time().equals(other.getStart_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getCreate_user_id() == null ? other.getCreate_user_id() == null : this.getCreate_user_id().equals(other.getCreate_user_id()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getStatus_id() == null ? other.getStatus_id() == null : this.getStatus_id().equals(other.getStatus_id()))
            && (this.getCover_image_id() == null ? other.getCover_image_id() == null : this.getCover_image_id().equals(other.getCover_image_id()))
            && (this.getCategory_id() == null ? other.getCategory_id() == null : this.getCategory_id().equals(other.getCategory_id()))
            && (this.getSign_end_time() == null ? other.getSign_end_time() == null : this.getSign_end_time().equals(other.getSign_end_time()))
            && (this.getContact_phone() == null ? other.getContact_phone() == null : this.getContact_phone().equals(other.getContact_phone()))
            && (this.getContact_name() == null ? other.getContact_name() == null : this.getContact_name().equals(other.getContact_name()))
            && (this.getIf_recommend() == null ? other.getIf_recommend() == null : this.getIf_recommend().equals(other.getIf_recommend()))
            && (this.getIf_top() == null ? other.getIf_top() == null : this.getIf_top().equals(other.getIf_top()))
            && (this.getIf_new() == null ? other.getIf_new() == null : this.getIf_new().equals(other.getIf_new()))
            && (this.getTotal_sign() == null ? other.getTotal_sign() == null : this.getTotal_sign().equals(other.getTotal_sign()))
            && (this.getTotal_want() == null ? other.getTotal_want() == null : this.getTotal_want().equals(other.getTotal_want()))
            && (this.getTotal_view() == null ? other.getTotal_view() == null : this.getTotal_view().equals(other.getTotal_view()))
            && (this.getTotal_share() == null ? other.getTotal_share() == null : this.getTotal_share().equals(other.getTotal_share()))
            && (this.getTotal_attended() == null ? other.getTotal_attended() == null : this.getTotal_attended().equals(other.getTotal_attended()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getCreate_from() == null ? other.getCreate_from() == null : this.getCreate_from().equals(other.getCreate_from()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getChs_code() == null) ? 0 : getChs_code().hashCode());
        result = prime * result + ((getBar_id() == null) ? 0 : getBar_id().hashCode());
        result = prime * result + ((getProvince_id() == null) ? 0 : getProvince_id().hashCode());
        result = prime * result + ((getCity_id() == null) ? 0 : getCity_id().hashCode());
        result = prime * result + ((getDistrict_id() == null) ? 0 : getDistrict_id().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getStart_time() == null) ? 0 : getStart_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getCreate_user_id() == null) ? 0 : getCreate_user_id().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getStatus_id() == null) ? 0 : getStatus_id().hashCode());
        result = prime * result + ((getCover_image_id() == null) ? 0 : getCover_image_id().hashCode());
        result = prime * result + ((getCategory_id() == null) ? 0 : getCategory_id().hashCode());
        result = prime * result + ((getSign_end_time() == null) ? 0 : getSign_end_time().hashCode());
        result = prime * result + ((getContact_phone() == null) ? 0 : getContact_phone().hashCode());
        result = prime * result + ((getContact_name() == null) ? 0 : getContact_name().hashCode());
        result = prime * result + ((getIf_recommend() == null) ? 0 : getIf_recommend().hashCode());
        result = prime * result + ((getIf_top() == null) ? 0 : getIf_top().hashCode());
        result = prime * result + ((getIf_new() == null) ? 0 : getIf_new().hashCode());
        result = prime * result + ((getTotal_sign() == null) ? 0 : getTotal_sign().hashCode());
        result = prime * result + ((getTotal_want() == null) ? 0 : getTotal_want().hashCode());
        result = prime * result + ((getTotal_view() == null) ? 0 : getTotal_view().hashCode());
        result = prime * result + ((getTotal_share() == null) ? 0 : getTotal_share().hashCode());
        result = prime * result + ((getTotal_attended() == null) ? 0 : getTotal_attended().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getCreate_from() == null) ? 0 : getCreate_from().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", chs_code=").append(chs_code);
        sb.append(", bar_id=").append(bar_id);
        sb.append(", province_id=").append(province_id);
        sb.append(", city_id=").append(city_id);
        sb.append(", district_id=").append(district_id);
        sb.append(", address=").append(address);
        sb.append(", start_time=").append(start_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", create_user_id=").append(create_user_id);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", status_id=").append(status_id);
        sb.append(", cover_image_id=").append(cover_image_id);
        sb.append(", category_id=").append(category_id);
        sb.append(", sign_end_time=").append(sign_end_time);
        sb.append(", contact_phone=").append(contact_phone);
        sb.append(", contact_name=").append(contact_name);
        sb.append(", if_recommend=").append(if_recommend);
        sb.append(", if_top=").append(if_top);
        sb.append(", if_new=").append(if_new);
        sb.append(", total_sign=").append(total_sign);
        sb.append(", total_want=").append(total_want);
        sb.append(", total_view=").append(total_view);
        sb.append(", total_share=").append(total_share);
        sb.append(", total_attended=").append(total_attended);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", create_from=").append(create_from);
        sb.append(", detail=").append(detail);
        sb.append("]");
        return sb.toString();
    }
}