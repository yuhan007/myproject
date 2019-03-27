package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 标准计费产品类型信息表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class StandardProductType extends Model<StandardProductType> {

    private static final long serialVersionUID = 1L;

    /**
     * 类型编号
     */
    private String typeId;
    /**
     * 类型名称
     */
    private String typeName;
    /**
     * 类型状态，1：启用，0：禁用
     */
    private Double status;
    /**
     * 父类型编号，第一级此值为0
     */
    private String parentTypeId;
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
     * 备注
     */
    private String remark;
    /**
     * 金蝶产品大类编号
     */
    private String jindieProductTypeId;
    /**
     * 是否同步
     */
    private Double issync;
    /**
     * 同步时间
     */
    private Date syncTime;


    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    public String getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getJindieProductTypeId() {
        return jindieProductTypeId;
    }

    public void setJindieProductTypeId(String jindieProductTypeId) {
        this.jindieProductTypeId = jindieProductTypeId;
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
        return this.typeId;
    }

    @Override
    public String toString() {
        return "StandardProductType{" +
        ", typeId=" + typeId +
        ", typeName=" + typeName +
        ", status=" + status +
        ", parentTypeId=" + parentTypeId +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", updateUserId=" + updateUserId +
        ", updateTime=" + updateTime +
        ", remark=" + remark +
        ", jindieProductTypeId=" + jindieProductTypeId +
        ", issync=" + issync +
        ", syncTime=" + syncTime +
        "}";
    }
}
