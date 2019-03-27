package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 结算金额分配比例表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class SettAmountDistriRatio extends Model<SettAmountDistriRatio> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String serialId;
    /**
     * 项目id
     */
    private String projectId;
    /**
     * 区域编码
     */
    private String areaCode;
    /**
     * 分配比例 (0.25  表示25%)
     */
    private Double distributionRatio;
    /**
     * 接收区域编码
     */
    private String receiveAreaCode;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private String createUserId;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 更新人
     */
    private String updateUserId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 项目名
     */
    private String projectName;
    /**
     * 区域名
     */
    private String areaName;
    /**
     * 接受区域名
     */
    private String receiveAreaName;


    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Double getDistributionRatio() {
        return distributionRatio;
    }

    public void setDistributionRatio(Double distributionRatio) {
        this.distributionRatio = distributionRatio;
    }

    public String getReceiveAreaCode() {
        return receiveAreaCode;
    }

    public void setReceiveAreaCode(String receiveAreaCode) {
        this.receiveAreaCode = receiveAreaCode;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getReceiveAreaName() {
        return receiveAreaName;
    }

    public void setReceiveAreaName(String receiveAreaName) {
        this.receiveAreaName = receiveAreaName;
    }

    @Override
    protected Serializable pkVal() {
        return this.serialId;
    }

    @Override
    public String toString() {
        return "SettAmountDistriRatio{" +
        ", serialId=" + serialId +
        ", projectId=" + projectId +
        ", areaCode=" + areaCode +
        ", distributionRatio=" + distributionRatio +
        ", receiveAreaCode=" + receiveAreaCode +
        ", createTime=" + createTime +
        ", createUserId=" + createUserId +
        ", updateTime=" + updateTime +
        ", updateUserId=" + updateUserId +
        ", remark=" + remark +
        ", projectName=" + projectName +
        ", areaName=" + areaName +
        ", receiveAreaName=" + receiveAreaName +
        "}";
    }
}
