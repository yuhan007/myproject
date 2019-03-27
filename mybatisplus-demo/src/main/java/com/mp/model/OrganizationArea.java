package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 组织区域关联表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class OrganizationArea extends Model<OrganizationArea> {

    private static final long serialVersionUID = 1L;

    /**
     * 区域code
     */
    private String areaCode;
    /**
     * 组织code
     */
    private String organizationCode;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人id
     */
    private String createUserId;
    /**
     * 所占百分比
     */
    private String percentage;


    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "OrganizationArea{" +
        ", areaCode=" + areaCode +
        ", organizationCode=" + organizationCode +
        ", createTime=" + createTime +
        ", createUserId=" + createUserId +
        ", percentage=" + percentage +
        "}";
    }
}
