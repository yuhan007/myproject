package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 账簿信息表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class AccountBook extends Model<AccountBook> {

    private static final long serialVersionUID = 1L;

    /**
     * 账簿code  唯一
     */
    private String accountBookCode;
    /**
     * 账簿名字
     */
    private String accountBookName;
    /**
     * 使用组织
     */
    private String useOrgNumber;
    /**
     * 账簿类型 1主账簿   0副账簿
     */
    private Double accountBookType;
    /**
     * 核算组织
     */
    private String accountOrgNumber;
    /**
     * 是否同步    1同步  0没同步
     */
    private Double issync;
    /**
     * 备注
     */
    private String remark;
    /**
     * 状态  1启用 0没启用
     */
    private Double status;
    /**
     * 创建人
     */
    private String createUserId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新人
     */
    private String updateUserId;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 组织名
     */
    private String useOrgName;
    /**
     * 同步时间
     */
    private Date syncTime;


    public String getAccountBookCode() {
        return accountBookCode;
    }

    public void setAccountBookCode(String accountBookCode) {
        this.accountBookCode = accountBookCode;
    }

    public String getAccountBookName() {
        return accountBookName;
    }

    public void setAccountBookName(String accountBookName) {
        this.accountBookName = accountBookName;
    }

    public String getUseOrgNumber() {
        return useOrgNumber;
    }

    public void setUseOrgNumber(String useOrgNumber) {
        this.useOrgNumber = useOrgNumber;
    }

    public Double getAccountBookType() {
        return accountBookType;
    }

    public void setAccountBookType(Double accountBookType) {
        this.accountBookType = accountBookType;
    }

    public String getAccountOrgNumber() {
        return accountOrgNumber;
    }

    public void setAccountOrgNumber(String accountOrgNumber) {
        this.accountOrgNumber = accountOrgNumber;
    }

    public Double getIssync() {
        return issync;
    }

    public void setIssync(Double issync) {
        this.issync = issync;
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

    public String getUseOrgName() {
        return useOrgName;
    }

    public void setUseOrgName(String useOrgName) {
        this.useOrgName = useOrgName;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.accountBookCode;
    }

    @Override
    public String toString() {
        return "AccountBook{" +
        ", accountBookCode=" + accountBookCode +
        ", accountBookName=" + accountBookName +
        ", useOrgNumber=" + useOrgNumber +
        ", accountBookType=" + accountBookType +
        ", accountOrgNumber=" + accountOrgNumber +
        ", issync=" + issync +
        ", remark=" + remark +
        ", status=" + status +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", updateUserId=" + updateUserId +
        ", updateTime=" + updateTime +
        ", useOrgName=" + useOrgName +
        ", syncTime=" + syncTime +
        "}";
    }
}
