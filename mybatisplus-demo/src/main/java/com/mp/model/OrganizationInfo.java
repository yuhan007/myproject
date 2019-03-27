package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 组织信息表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class OrganizationInfo extends Model<OrganizationInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 组织编号
     */
    private String organizationCode;
    /**
     * 组织名称
     */
    private String organizationName;
    /**
     * 组织形态
     */
    private String organizationMorphology;
    /**
     * 组织类型
     */
    private String organizationType;
    /**
     * 上级组织编号
     */
    private String parentCode;
    /**
     * 默认税率
     */
    private Double taxRate;
    /**
     * 组织状态  0未启用   1启用
     */
    private String organizationStatus;
    /**
     * 创建人id
     */
    private String createUserId;
    /**
     * 更新人id
     */
    private String updateUserId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 是否同步
     */
    private Double issync;
    /**
     * 账簿
     */
    private String accountBook;
    /**
     * 同步时间
     */
    private Date syncTime;


    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationMorphology() {
        return organizationMorphology;
    }

    public void setOrganizationMorphology(String organizationMorphology) {
        this.organizationMorphology = organizationMorphology;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public String getOrganizationStatus() {
        return organizationStatus;
    }

    public void setOrganizationStatus(String organizationStatus) {
        this.organizationStatus = organizationStatus;
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

    public Double getIssync() {
        return issync;
    }

    public void setIssync(Double issync) {
        this.issync = issync;
    }

    public String getAccountBook() {
        return accountBook;
    }

    public void setAccountBook(String accountBook) {
        this.accountBook = accountBook;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.organizationCode;
    }

    @Override
    public String toString() {
        return "OrganizationInfo{" +
        ", organizationCode=" + organizationCode +
        ", organizationName=" + organizationName +
        ", organizationMorphology=" + organizationMorphology +
        ", organizationType=" + organizationType +
        ", parentCode=" + parentCode +
        ", taxRate=" + taxRate +
        ", organizationStatus=" + organizationStatus +
        ", createUserId=" + createUserId +
        ", updateUserId=" + updateUserId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", issync=" + issync +
        ", accountBook=" + accountBook +
        ", syncTime=" + syncTime +
        "}";
    }
}
