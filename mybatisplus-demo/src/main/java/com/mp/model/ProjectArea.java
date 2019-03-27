package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 项目区域关联表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class ProjectArea extends Model<ProjectArea> {

    private static final long serialVersionUID = 1L;

    /**
     * 关联编号
     */
    private String projectAreaId;
    /**
     * 项目编号
     */
    private String projectId;
    /**
     * 区域编码
     */
    private String areaCode;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人编号
     */
    private String createUserId;
    /**
     * 状态
     */
    private Double status;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 更新人
     */
    private String updateUserId;


    public String getProjectAreaId() {
        return projectAreaId;
    }

    public void setProjectAreaId(String projectAreaId) {
        this.projectAreaId = projectAreaId;
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

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
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

    @Override
    protected Serializable pkVal() {
        return this.projectAreaId;
    }

    @Override
    public String toString() {
        return "ProjectArea{" +
        ", projectAreaId=" + projectAreaId +
        ", projectId=" + projectId +
        ", areaCode=" + areaCode +
        ", createTime=" + createTime +
        ", createUserId=" + createUserId +
        ", status=" + status +
        ", updateTime=" + updateTime +
        ", updateUserId=" + updateUserId +
        "}";
    }
}
