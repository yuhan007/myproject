package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 客户信息表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class CustomerInfo extends Model<CustomerInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 客户编号
     */
    private String customerId;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 客户简称
     */
    private String customerSimpleName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 创建人编号
     */
    private String createUserId;
    /**
     * 更新人编号
     */
    private String updateUserId;
    /**
     * 金蝶客户编号
     */
    private String jindieCustomerId;
    /**
     * 是否同步
     */
    private Double issync;
    /**
     * 同步时间
     */
    private Date syncTime;


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSimpleName() {
        return customerSimpleName;
    }

    public void setCustomerSimpleName(String customerSimpleName) {
        this.customerSimpleName = customerSimpleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getJindieCustomerId() {
        return jindieCustomerId;
    }

    public void setJindieCustomerId(String jindieCustomerId) {
        this.jindieCustomerId = jindieCustomerId;
    }

    public Double getIssync() {
        return issync;
    }

    public void setIssync(Double issync) {
        this.issync = issync;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.customerId;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
        ", customerId=" + customerId +
        ", customerName=" + customerName +
        ", customerSimpleName=" + customerSimpleName +
        ", remark=" + remark +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", createUserId=" + createUserId +
        ", updateUserId=" + updateUserId +
        ", jindieCustomerId=" + jindieCustomerId +
        ", issync=" + issync +
        ", syncTime=" + syncTime +
        "}";
    }
}
