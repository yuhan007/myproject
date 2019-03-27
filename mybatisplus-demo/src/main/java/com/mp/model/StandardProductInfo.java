package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 标准计费产品信息表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class StandardProductInfo extends Model<StandardProductInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 产品编号
     */
    private String productId;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 服务小类编号
     */
    private String smallTypeId;
    /**
     * 服务大类编号
     */
    private String bigTypeId;
    /**
     * 单价
     */
    private Double perPrice;
    /**
     * 状态：1：启用，0：停用
     */
    private Double status;
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


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSmallTypeId() {
        return smallTypeId;
    }

    public void setSmallTypeId(String smallTypeId) {
        this.smallTypeId = smallTypeId;
    }

    public String getBigTypeId() {
        return bigTypeId;
    }

    public void setBigTypeId(String bigTypeId) {
        this.bigTypeId = bigTypeId;
    }

    public Double getPerPrice() {
        return perPrice;
    }

    public void setPerPrice(Double perPrice) {
        this.perPrice = perPrice;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Serializable pkVal() {
        return this.productId;
    }

    @Override
    public String toString() {
        return "StandardProductInfo{" +
        ", productId=" + productId +
        ", productName=" + productName +
        ", smallTypeId=" + smallTypeId +
        ", bigTypeId=" + bigTypeId +
        ", perPrice=" + perPrice +
        ", status=" + status +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", updateUserId=" + updateUserId +
        ", updateTime=" + updateTime +
        ", remark=" + remark +
        "}";
    }
}
