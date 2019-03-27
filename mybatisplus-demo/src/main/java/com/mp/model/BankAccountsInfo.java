package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 收款账号信息表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class BankAccountsInfo extends Model<BankAccountsInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String serialId;
    /**
     * 帐号
     */
    private String accountId;
    /**
     * 账户名称
     */
    private String accountName;
    /**
     * 开户行
     */
    private String bankName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 状态：1：启用，0：停用
     */
    private Double status;
    /**
     * 创建人ID，系统预设的值为0
     */
    private String createUserId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新人ID，系统预设的值为0
     */
    private String updateUserId;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 开户行
     */
    private String bankSiteCode;
    /**
     * 科目
     */
    private String subjectCode;
    private Double issync;
    /**
     * 同步时间
     */
    private Date syncTime;


    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBankSiteCode() {
        return bankSiteCode;
    }

    public void setBankSiteCode(String bankSiteCode) {
        this.bankSiteCode = bankSiteCode;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
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
        return this.serialId;
    }

    @Override
    public String toString() {
        return "BankAccountsInfo{" +
        ", serialId=" + serialId +
        ", accountId=" + accountId +
        ", accountName=" + accountName +
        ", bankName=" + bankName +
        ", remark=" + remark +
        ", status=" + status +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", updateUserId=" + updateUserId +
        ", updateTime=" + updateTime +
        ", bankSiteCode=" + bankSiteCode +
        ", subjectCode=" + subjectCode +
        ", issync=" + issync +
        ", syncTime=" + syncTime +
        "}";
    }
}
