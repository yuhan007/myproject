package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 账单调账记录表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class BillCheckRecord extends Model<BillCheckRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * 调账编号
     */
    private String serialId;
    /**
     * 结算单编号
     */
    private String balanceId;
    /**
     * 调账前结算总额
     */
    private Double oldTotalAmount;
    /**
     * 调账后结算总额
     */
    private Double newTotalAmount;
    /**
     * 调账时间
     */
    private Date checkTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 调账用户ID，系统预设的值为0
     */
    private String checkUserId;
    /**
     * 调账后报告份数
     */
    private Double newCopies;
    /**
     * 调账前报告份数
     */
    private Double oldCopies;
    /**
     * 账单调账类型
     */
    private Double billCheckType;
    /**
     * 调账前结算金额
     */
    private Double oldSettlementAmount;
    /**
     * 调账后结算金额
     */
    private Double newSettlementAmount;
    /**
     * 调账前税额
     */
    private Double oldTaxAmount;
    /**
     * 调账后税额
     */
    private Double newTaxAmount;
    /**
     * 调账前结算份数
     */
    private Double oldSettlementCopies;
    /**
     * 调账后结算份数
     */
    private Double newSettlementCopies;


    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
    }

    public Double getOldTotalAmount() {
        return oldTotalAmount;
    }

    public void setOldTotalAmount(Double oldTotalAmount) {
        this.oldTotalAmount = oldTotalAmount;
    }

    public Double getNewTotalAmount() {
        return newTotalAmount;
    }

    public void setNewTotalAmount(Double newTotalAmount) {
        this.newTotalAmount = newTotalAmount;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(String checkUserId) {
        this.checkUserId = checkUserId;
    }

    public Double getNewCopies() {
        return newCopies;
    }

    public void setNewCopies(Double newCopies) {
        this.newCopies = newCopies;
    }

    public Double getOldCopies() {
        return oldCopies;
    }

    public void setOldCopies(Double oldCopies) {
        this.oldCopies = oldCopies;
    }

    public Double getBillCheckType() {
        return billCheckType;
    }

    public void setBillCheckType(Double billCheckType) {
        this.billCheckType = billCheckType;
    }

    public Double getOldSettlementAmount() {
        return oldSettlementAmount;
    }

    public void setOldSettlementAmount(Double oldSettlementAmount) {
        this.oldSettlementAmount = oldSettlementAmount;
    }

    public Double getNewSettlementAmount() {
        return newSettlementAmount;
    }

    public void setNewSettlementAmount(Double newSettlementAmount) {
        this.newSettlementAmount = newSettlementAmount;
    }

    public Double getOldTaxAmount() {
        return oldTaxAmount;
    }

    public void setOldTaxAmount(Double oldTaxAmount) {
        this.oldTaxAmount = oldTaxAmount;
    }

    public Double getNewTaxAmount() {
        return newTaxAmount;
    }

    public void setNewTaxAmount(Double newTaxAmount) {
        this.newTaxAmount = newTaxAmount;
    }

    public Double getOldSettlementCopies() {
        return oldSettlementCopies;
    }

    public void setOldSettlementCopies(Double oldSettlementCopies) {
        this.oldSettlementCopies = oldSettlementCopies;
    }

    public Double getNewSettlementCopies() {
        return newSettlementCopies;
    }

    public void setNewSettlementCopies(Double newSettlementCopies) {
        this.newSettlementCopies = newSettlementCopies;
    }

    @Override
    protected Serializable pkVal() {
        return this.serialId;
    }

    @Override
    public String toString() {
        return "BillCheckRecord{" +
        ", serialId=" + serialId +
        ", balanceId=" + balanceId +
        ", oldTotalAmount=" + oldTotalAmount +
        ", newTotalAmount=" + newTotalAmount +
        ", checkTime=" + checkTime +
        ", remark=" + remark +
        ", checkUserId=" + checkUserId +
        ", newCopies=" + newCopies +
        ", oldCopies=" + oldCopies +
        ", billCheckType=" + billCheckType +
        ", oldSettlementAmount=" + oldSettlementAmount +
        ", newSettlementAmount=" + newSettlementAmount +
        ", oldTaxAmount=" + oldTaxAmount +
        ", newTaxAmount=" + newTaxAmount +
        ", oldSettlementCopies=" + oldSettlementCopies +
        ", newSettlementCopies=" + newSettlementCopies +
        "}";
    }
}
