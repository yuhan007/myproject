package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 开户行信息表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class OpenBankInfo extends Model<OpenBankInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 开户行编码
     */
    private String bankSiteCode;
    /**
     * 开户行名称
     */
    private String bankSiteName;
    /**
     * 状态
     */
    private Double status;
    /**
     * 备注
     */
    private String remark;
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
     * 是否同步

     */
    private Double issync;
    /**
     * 同步时间
     */
    private Date syncTime;


    public String getBankSiteCode() {
        return bankSiteCode;
    }

    public void setBankSiteCode(String bankSiteCode) {
        this.bankSiteCode = bankSiteCode;
    }

    public String getBankSiteName() {
        return bankSiteName;
    }

    public void setBankSiteName(String bankSiteName) {
        this.bankSiteName = bankSiteName;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return this.bankSiteCode;
    }

    @Override
    public String toString() {
        return "OpenBankInfo{" +
        ", bankSiteCode=" + bankSiteCode +
        ", bankSiteName=" + bankSiteName +
        ", status=" + status +
        ", remark=" + remark +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", updateUserId=" + updateUserId +
        ", updateTime=" + updateTime +
        ", issync=" + issync +
        ", syncTime=" + syncTime +
        "}";
    }
}
