package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 产品信息表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class ProductInfo extends Model<ProductInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 产品编号
     */
    private String productId;
    /**
     * 产品类型：赠送报告类型产品：0，营销服务：1，贷前报告：2，贷后报告：3，指标监控：4，分润贷前：5，分润贷后：6
     */
    private Double productType;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 产品说明
     */
    private String productDescription;
    /**
     * 所属银行（用户编号）
     */
    private String bankId;
    /**
     * 对应赠送产品编号
     */
    private String presentProductId;
    /**
     * 状态：0：停用，1：启用
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
     * 标准产品编号
     */
    private String standardProductId;


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getProductType() {
        return productType;
    }

    public void setProductType(Double productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getPresentProductId() {
        return presentProductId;
    }

    public void setPresentProductId(String presentProductId) {
        this.presentProductId = presentProductId;
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

    public String getStandardProductId() {
        return standardProductId;
    }

    public void setStandardProductId(String standardProductId) {
        this.standardProductId = standardProductId;
    }

    @Override
    protected Serializable pkVal() {
        return this.productId;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
        ", productId=" + productId +
        ", productType=" + productType +
        ", productName=" + productName +
        ", productDescription=" + productDescription +
        ", bankId=" + bankId +
        ", presentProductId=" + presentProductId +
        ", status=" + status +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", updateUserId=" + updateUserId +
        ", updateTime=" + updateTime +
        ", standardProductId=" + standardProductId +
        "}";
    }
}
