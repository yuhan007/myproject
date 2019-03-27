package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 科目信息表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class SubjectInfo extends Model<SubjectInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 科目编码
     */
    private String subjectCode;
    /**
     * 科目名称
     */
    private String subjectName;
    /**
     * 科目类别
     */
    private String subjectType;
    /**
     * 使用组织
     */
    private String usedOrganiza;
    /**
     * 余额方向
     */
    private String balanceDirection;
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
     * 更改人id
     */
    private String updateUserId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否同步
     */
    private Double issync;
    /**
     * 同步时间
     */
    private Date syncTime;


    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public String getUsedOrganiza() {
        return usedOrganiza;
    }

    public void setUsedOrganiza(String usedOrganiza) {
        this.usedOrganiza = usedOrganiza;
    }

    public String getBalanceDirection() {
        return balanceDirection;
    }

    public void setBalanceDirection(String balanceDirection) {
        this.balanceDirection = balanceDirection;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return this.subjectCode;
    }

    @Override
    public String toString() {
        return "SubjectInfo{" +
        ", subjectCode=" + subjectCode +
        ", subjectName=" + subjectName +
        ", subjectType=" + subjectType +
        ", usedOrganiza=" + usedOrganiza +
        ", balanceDirection=" + balanceDirection +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", createUserId=" + createUserId +
        ", updateUserId=" + updateUserId +
        ", remark=" + remark +
        ", issync=" + issync +
        ", syncTime=" + syncTime +
        "}";
    }
}
