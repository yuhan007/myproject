package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 产品费用配置表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class ProductPriceConf extends Model<ProductPriceConf> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String serialId;
    /**
     * 标准产品编号
     */
    private String productId;
    /**
     * 最小份数
     */
    private Double minValue;
    /**
     * 最大份数
     */
    private Double maxValue;
    /**
     * 每份单价（现结单价即：最大最小份数均为0）
     */
    private Double perPrice;
    /**
     * 折扣，和每份单价不能同时存在，一个有值，另一个则为null，格式：9折：0.9
     */
    private Double discount;
    /**
     * 备注信息
     */
    private String remark;
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
     * 分润比例，分润产品才用到
     */
    private Double profitRatio;
    /**
     * 用户编号（银行编号）
     */
    private String userId;
    /**
     * 准入统计标识，1：统计，0：不统计
     */
    private Double accessStatisticsAsign;
    /**
     * 状态：0：停用，1：启用
     */
    private Double status;


    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Double getPerPrice() {
        return perPrice;
    }

    public void setPerPrice(Double perPrice) {
        this.perPrice = perPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
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

    public Double getProfitRatio() {
        return profitRatio;
    }

    public void setProfitRatio(Double profitRatio) {
        this.profitRatio = profitRatio;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getAccessStatisticsAsign() {
        return accessStatisticsAsign;
    }

    public void setAccessStatisticsAsign(Double accessStatisticsAsign) {
        this.accessStatisticsAsign = accessStatisticsAsign;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.serialId;
    }

    @Override
    public String toString() {
        return "ProductPriceConf{" +
        ", serialId=" + serialId +
        ", productId=" + productId +
        ", minValue=" + minValue +
        ", maxValue=" + maxValue +
        ", perPrice=" + perPrice +
        ", discount=" + discount +
        ", remark=" + remark +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", updateUserId=" + updateUserId +
        ", updateTime=" + updateTime +
        ", profitRatio=" + profitRatio +
        ", userId=" + userId +
        ", accessStatisticsAsign=" + accessStatisticsAsign +
        ", status=" + status +
        "}";
    }
}
