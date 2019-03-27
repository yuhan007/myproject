package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 预对账差异表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class PreviewBillBalanceDifferent extends Model<PreviewBillBalanceDifferent> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String pbbdId;
    /**
     * 用户编号（项目编号）
     */
    private String userId;
    /**
     * 年份
     */
    private Double year;
    /**
     * 季度
     */
    private Double quarter;
    /**
     * 标准产品编号
     */
    private String standardProductId;
    /**
     * 同步状态 0:未同步,1:同步
     */
    private Double synchronizationStatus;
    /**
     * 同步人
     */
    private String synchronizationUserId;
    /**
     * 对账金额
     */
    private Double amount;
    /**
     * 预对账金额
     */
    private Double previewAmount;
    /**
     * 预对账差异
     */
    private Double previewDifferent;
    /**
     * 营业收入差异
     */
    private Double businessIncomeDifferent;
    /**
     * 税额差异
     */
    private Double taxAmountDifferent;
    /**
     * 预对账差异比率
     */
    private Double previewDifferentRate;
    /**
     * 是否异常 0:异常,1:不异常
     */
    private Double isException;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 区域编码
     */
    private String areaCode;
    /**
     * 同步时间
     */
    private Date synchronizationTime;
    /**
     * 财务审核时间
     */
    private Date financeCheckTime;
    /**
     * 财务审核时间-1审核前不通过，0未审核，1已审核，-2审核不通过
     */
    private Double financeCheckStatus;
    /**
     * 季度账单编号
     */
    private String quarterBillId;
    /**
     * 结算金额
     */
    private Double settlementAmount;
    /**
     * 预结算金额
     */
    private Double previewSettlementAmount;
    /**
     * 结算金额差异
     */
    private Double settlementAmountDifferent;
    /**
     * 结算金额差异比率
     */
    private Double settlementAmountDiffRate;


    public String getPbbdId() {
        return pbbdId;
    }

    public void setPbbdId(String pbbdId) {
        this.pbbdId = pbbdId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getYear() {
        return year;
    }

    public void setYear(Double year) {
        this.year = year;
    }

    public Double getQuarter() {
        return quarter;
    }

    public void setQuarter(Double quarter) {
        this.quarter = quarter;
    }

    public String getStandardProductId() {
        return standardProductId;
    }

    public void setStandardProductId(String standardProductId) {
        this.standardProductId = standardProductId;
    }

    public Double getSynchronizationStatus() {
        return synchronizationStatus;
    }

    public void setSynchronizationStatus(Double synchronizationStatus) {
        this.synchronizationStatus = synchronizationStatus;
    }

    public String getSynchronizationUserId() {
        return synchronizationUserId;
    }

    public void setSynchronizationUserId(String synchronizationUserId) {
        this.synchronizationUserId = synchronizationUserId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getPreviewAmount() {
        return previewAmount;
    }

    public void setPreviewAmount(Double previewAmount) {
        this.previewAmount = previewAmount;
    }

    public Double getPreviewDifferent() {
        return previewDifferent;
    }

    public void setPreviewDifferent(Double previewDifferent) {
        this.previewDifferent = previewDifferent;
    }

    public Double getBusinessIncomeDifferent() {
        return businessIncomeDifferent;
    }

    public void setBusinessIncomeDifferent(Double businessIncomeDifferent) {
        this.businessIncomeDifferent = businessIncomeDifferent;
    }

    public Double getTaxAmountDifferent() {
        return taxAmountDifferent;
    }

    public void setTaxAmountDifferent(Double taxAmountDifferent) {
        this.taxAmountDifferent = taxAmountDifferent;
    }

    public Double getPreviewDifferentRate() {
        return previewDifferentRate;
    }

    public void setPreviewDifferentRate(Double previewDifferentRate) {
        this.previewDifferentRate = previewDifferentRate;
    }

    public Double getIsException() {
        return isException;
    }

    public void setIsException(Double isException) {
        this.isException = isException;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Date getSynchronizationTime() {
        return synchronizationTime;
    }

    public void setSynchronizationTime(Date synchronizationTime) {
        this.synchronizationTime = synchronizationTime;
    }

    public Date getFinanceCheckTime() {
        return financeCheckTime;
    }

    public void setFinanceCheckTime(Date financeCheckTime) {
        this.financeCheckTime = financeCheckTime;
    }

    public Double getFinanceCheckStatus() {
        return financeCheckStatus;
    }

    public void setFinanceCheckStatus(Double financeCheckStatus) {
        this.financeCheckStatus = financeCheckStatus;
    }

    public String getQuarterBillId() {
        return quarterBillId;
    }

    public void setQuarterBillId(String quarterBillId) {
        this.quarterBillId = quarterBillId;
    }

    public Double getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(Double settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public Double getPreviewSettlementAmount() {
        return previewSettlementAmount;
    }

    public void setPreviewSettlementAmount(Double previewSettlementAmount) {
        this.previewSettlementAmount = previewSettlementAmount;
    }

    public Double getSettlementAmountDifferent() {
        return settlementAmountDifferent;
    }

    public void setSettlementAmountDifferent(Double settlementAmountDifferent) {
        this.settlementAmountDifferent = settlementAmountDifferent;
    }

    public Double getSettlementAmountDiffRate() {
        return settlementAmountDiffRate;
    }

    public void setSettlementAmountDiffRate(Double settlementAmountDiffRate) {
        this.settlementAmountDiffRate = settlementAmountDiffRate;
    }

    @Override
    protected Serializable pkVal() {
        return this.pbbdId;
    }

    @Override
    public String toString() {
        return "PreviewBillBalanceDifferent{" +
        ", pbbdId=" + pbbdId +
        ", userId=" + userId +
        ", year=" + year +
        ", quarter=" + quarter +
        ", standardProductId=" + standardProductId +
        ", synchronizationStatus=" + synchronizationStatus +
        ", synchronizationUserId=" + synchronizationUserId +
        ", amount=" + amount +
        ", previewAmount=" + previewAmount +
        ", previewDifferent=" + previewDifferent +
        ", businessIncomeDifferent=" + businessIncomeDifferent +
        ", taxAmountDifferent=" + taxAmountDifferent +
        ", previewDifferentRate=" + previewDifferentRate +
        ", isException=" + isException +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", remark=" + remark +
        ", areaCode=" + areaCode +
        ", synchronizationTime=" + synchronizationTime +
        ", financeCheckTime=" + financeCheckTime +
        ", financeCheckStatus=" + financeCheckStatus +
        ", quarterBillId=" + quarterBillId +
        ", settlementAmount=" + settlementAmount +
        ", previewSettlementAmount=" + previewSettlementAmount +
        ", settlementAmountDifferent=" + settlementAmountDifferent +
        ", settlementAmountDiffRate=" + settlementAmountDiffRate +
        "}";
    }
}
