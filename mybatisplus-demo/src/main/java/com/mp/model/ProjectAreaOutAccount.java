package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 项目按区域出账
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class ProjectAreaOutAccount extends Model<ProjectAreaOutAccount> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号  唯一
     */
    private String serialId;
    /**
     * 项目编号
     */
    private String projectId;
    /**
     * 区域编码
     */
    private String areaCode;
    /**
     * 出账项目编号
     */
    private String outProjectId;
    /**
     * 备注
     */
    private String remark;
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
     * 出账项目名
     */
    private String outProjectName;
    /**
     * 区域名
     */
    private String areaName;
    /**
     * 项目名
     */
    private String projectName;


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

    public String getOutProjectId() {
        return outProjectId;
    }

    public void setOutProjectId(String outProjectId) {
        this.outProjectId = outProjectId;
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

    public String getOutProjectName() {
        return outProjectName;
    }

    public void setOutProjectName(String outProjectName) {
        this.outProjectName = outProjectName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    protected Serializable pkVal() {
        return this.serialId;
    }

    @Override
    public String toString() {
        return "ProjectAreaOutAccount{" +
        ", serialId=" + serialId +
        ", projectId=" + projectId +
        ", areaCode=" + areaCode +
        ", outProjectId=" + outProjectId +
        ", remark=" + remark +
        ", createUserId=" + createUserId +
        ", updateUserId=" + updateUserId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", outProjectName=" + outProjectName +
        ", areaName=" + areaName +
        ", projectName=" + projectName +
        "}";
    }
}
