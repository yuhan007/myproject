package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 项目信息表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class ProjectInfo extends Model<ProjectInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号 对应运管是平台编号
     */
    private String projectId;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 项目简介
     */
    private String projectSummary;
    /**
     * 所属客户编号
     */
    private String customerId;
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
     * 创建人id
     */
    private String createUserId;
    /**
     * 更新人id
     */
    private String updateUserId;
    /**
     * 项目状态暂时没用到
     */
    private String status;
    /**
     * 是否同步
     */
    private Double issync;
    /**
     * 项目状态 使用中
     */
    private Double projectStatus;
    /**
     * 项目编号   对应运管是项目编号
     */
    private String newProjectId;
    /**
     * 同步时间
     */
    private Date syncTime;


    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectSummary() {
        return projectSummary;
    }

    public void setProjectSummary(String projectSummary) {
        this.projectSummary = projectSummary;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getIssync() {
        return issync;
    }

    public void setIssync(Double issync) {
        this.issync = issync;
    }

    public Double getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Double projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getNewProjectId() {
        return newProjectId;
    }

    public void setNewProjectId(String newProjectId) {
        this.newProjectId = newProjectId;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.projectId;
    }

    @Override
    public String toString() {
        return "ProjectInfo{" +
        ", projectId=" + projectId +
        ", projectName=" + projectName +
        ", projectSummary=" + projectSummary +
        ", customerId=" + customerId +
        ", remark=" + remark +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", createUserId=" + createUserId +
        ", updateUserId=" + updateUserId +
        ", status=" + status +
        ", issync=" + issync +
        ", projectStatus=" + projectStatus +
        ", newProjectId=" + newProjectId +
        ", syncTime=" + syncTime +
        "}";
    }
}
