package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 结算单与收款账户关联表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class BalanceBankAccountsInfo extends Model<BalanceBankAccountsInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String serialId;
    /**
     * 结算确认函编号
     */
    private String balanceId;
    /**
     * 银行账户编号
     */
    private String bankAccountId;
    /**
     * 收款总额
     */
    private Double totalAmount;
    /**
     * 已入账金额
     */
    private Double recordedAmount;
    /**
     * 待入账金额
     */
    private Double notRecordedAmount;
    /**
     * 最近入账时间
     */
    private Date latestRecordTime;
    /**
     * 同步金额
     */
    private Double syncMoney;
    /**
     * 财务审核金额
     */
    private Double financeCheckMoney;


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

    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getRecordedAmount() {
        return recordedAmount;
    }

    public void setRecordedAmount(Double recordedAmount) {
        this.recordedAmount = recordedAmount;
    }

    public Double getNotRecordedAmount() {
        return notRecordedAmount;
    }

    public void setNotRecordedAmount(Double notRecordedAmount) {
        this.notRecordedAmount = notRecordedAmount;
    }

    public Date getLatestRecordTime() {
        return latestRecordTime;
    }

    public void setLatestRecordTime(Date latestRecordTime) {
        this.latestRecordTime = latestRecordTime;
    }

    public Double getSyncMoney() {
        return syncMoney;
    }

    public void setSyncMoney(Double syncMoney) {
        this.syncMoney = syncMoney;
    }

    public Double getFinanceCheckMoney() {
        return financeCheckMoney;
    }

    public void setFinanceCheckMoney(Double financeCheckMoney) {
        this.financeCheckMoney = financeCheckMoney;
    }

    @Override
    protected Serializable pkVal() {
        return this.serialId;
    }

    @Override
    public String toString() {
        return "BalanceBankAccountsInfo{" +
        ", serialId=" + serialId +
        ", balanceId=" + balanceId +
        ", bankAccountId=" + bankAccountId +
        ", totalAmount=" + totalAmount +
        ", recordedAmount=" + recordedAmount +
        ", notRecordedAmount=" + notRecordedAmount +
        ", latestRecordTime=" + latestRecordTime +
        ", syncMoney=" + syncMoney +
        ", financeCheckMoney=" + financeCheckMoney +
        "}";
    }
}
