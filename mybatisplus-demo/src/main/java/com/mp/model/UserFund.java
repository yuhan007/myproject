package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户资金表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class UserFund extends Model<UserFund> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号（银行编号）
     */
    private String userId;
    /**
     * 账户余额（单位：元）
     */
    private Double userAmount;
    /**
     * 1：现结（默认）；2：按月结算；3：按季度结算；11：包月会员免支付；12：包年会员免支付
     */
    private Double payType;
    /**
     * 包年/包月会员才有（对应会员等级有效截至日期），有效期过后结算方式自动变为现结方式
     */
    private Date memberPeriod;
    /**
     * 可透支的额度
     */
    private Double creditLimit;
    /**
     * 目前可消费的额度
     */
    private Double availableLimit;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 最近一次计算账单时间
     */
    private Date billCalculateLasttime;
    /**
     * 最近一次计算账单结果：1：成功，0：失败
     */
    private Double billCalculateLastatus;
    /**
     * 备注
     */
    private String remark;
    /**
     * 版本号，用于并发控制
     */
    private Double version;
    /**
     * 用户名称（银行名称）
     */
    private String userName;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getUserAmount() {
        return userAmount;
    }

    public void setUserAmount(Double userAmount) {
        this.userAmount = userAmount;
    }

    public Double getPayType() {
        return payType;
    }

    public void setPayType(Double payType) {
        this.payType = payType;
    }

    public Date getMemberPeriod() {
        return memberPeriod;
    }

    public void setMemberPeriod(Date memberPeriod) {
        this.memberPeriod = memberPeriod;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Double getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(Double availableLimit) {
        this.availableLimit = availableLimit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getBillCalculateLasttime() {
        return billCalculateLasttime;
    }

    public void setBillCalculateLasttime(Date billCalculateLasttime) {
        this.billCalculateLasttime = billCalculateLasttime;
    }

    public Double getBillCalculateLastatus() {
        return billCalculateLastatus;
    }

    public void setBillCalculateLastatus(Double billCalculateLastatus) {
        this.billCalculateLastatus = billCalculateLastatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "UserFund{" +
        ", userId=" + userId +
        ", userAmount=" + userAmount +
        ", payType=" + payType +
        ", memberPeriod=" + memberPeriod +
        ", creditLimit=" + creditLimit +
        ", availableLimit=" + availableLimit +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", billCalculateLasttime=" + billCalculateLasttime +
        ", billCalculateLastatus=" + billCalculateLastatus +
        ", remark=" + remark +
        ", version=" + version +
        ", userName=" + userName +
        "}";
    }
}
