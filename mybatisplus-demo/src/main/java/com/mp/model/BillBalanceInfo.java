package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 对账单息表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class BillBalanceInfo extends Model<BillBalanceInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String balanceId;
    /**
     * 用户编号（项目编号）
     */
    private String userId;
    /**
     * 年份
     */
    private Double year;
    /**
     * 月份
     */
    private Double month;
    /**
     * 标准产品编号
     */
    private String productId;
    /**
     * 报告份数（已去重），调账会更新
     */
    private Double copies;
    /**
     * 结算总额（元，下同），调账会更新此金额
     */
    private Double totalAmount;
    /**
     * 对账状态，1：已确认，0：待确认
     */
    private Double checkStatus;
    /**
     * 最近调账时间
     */
    private Date latestCheckTime;
    /**
     * 生成类型：0：系统根据计费记录自动生成，1：手动录入
     */
    private Double createType;
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
     * 创建人ID，系统预设的值为0
     */
    private String createUserId;
    /**
     * 更新人ID，系统预设的值为0
     */
    private String updateUserId;
    /**
     * 对账确认人ID
     */
    private String checkConfirmUserId;
    /**
     * 对账确认时间
     */
    private Date checkConfirmTime;
    /**
     * 未去重报告份数
     */
    private Double notQcCopies;
    /**
     * 结算确认函生成状态，0：未生成，1：已生成
     */
    private Double confirmationCreateStatus;
    /**
     * 初始结算金额
     */
    private Double initialAmount;
    /**
     * 结算确认函生成时间
     */
    private Date confirmationCreateTime;
    /**
     * 初始报告份数（已去重）
     */
    private Double initialCopies;
    /**
     * 区域编码，省编码
     */
    private String areaCode;
    /**
     * 分润基数，分润产品才用到
     */
    private Double profitBase;
    /**
     * 账单类型：1：月度账单，2：季度账单
     */
    private Double billType;
    /**
     * 季度
     */
    private Double quarter;
    /**
     * 复核状态，2：复核通过，-1：复核不通过，1：待复核，0：待对账
     */
    private Double recheckStatus;
    /**
     * 最近复核时间
     */
    private Date latestRecheckTime;
    /**
     * 对账复核人编号
     */
    private String recheckUserId;
    /**
     * 对账复核备注
     */
    private String recheckRemark;
    /**
     * 主营业收入
     */
    private Double businessIncome;
    /**
     * 税额
     */
    private Double taxAmount;
    /**
     * 税率
     */
    private Double taxRate;
    /**
     * 结算金额
     */
    private Double settlementAmount;
    /**
     * 结算份数
     */
    private Double settlementCopies;
    /**
     * 出账类型  1表示这个账单是总行出账分配过来的,   0表示不是总行出账分配过来的
     */
    private Double outAccountType;
    /**
     * 补发的去重数量+不是补发的去重数量
     */
    private Double allCopies;


    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
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

    public Double getMonth() {
        return month;
    }

    public void setMonth(Double month) {
        this.month = month;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getCopies() {
        return copies;
    }

    public void setCopies(Double copies) {
        this.copies = copies;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Double checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Date getLatestCheckTime() {
        return latestCheckTime;
    }

    public void setLatestCheckTime(Date latestCheckTime) {
        this.latestCheckTime = latestCheckTime;
    }

    public Double getCreateType() {
        return createType;
    }

    public void setCreateType(Double createType) {
        this.createType = createType;
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

    public String getCheckConfirmUserId() {
        return checkConfirmUserId;
    }

    public void setCheckConfirmUserId(String checkConfirmUserId) {
        this.checkConfirmUserId = checkConfirmUserId;
    }

    public Date getCheckConfirmTime() {
        return checkConfirmTime;
    }

    public void setCheckConfirmTime(Date checkConfirmTime) {
        this.checkConfirmTime = checkConfirmTime;
    }

    public Double getNotQcCopies() {
        return notQcCopies;
    }

    public void setNotQcCopies(Double notQcCopies) {
        this.notQcCopies = notQcCopies;
    }

    public Double getConfirmationCreateStatus() {
        return confirmationCreateStatus;
    }

    public void setConfirmationCreateStatus(Double confirmationCreateStatus) {
        this.confirmationCreateStatus = confirmationCreateStatus;
    }

    public Double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(Double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public Date getConfirmationCreateTime() {
        return confirmationCreateTime;
    }

    public void setConfirmationCreateTime(Date confirmationCreateTime) {
        this.confirmationCreateTime = confirmationCreateTime;
    }

    public Double getInitialCopies() {
        return initialCopies;
    }

    public void setInitialCopies(Double initialCopies) {
        this.initialCopies = initialCopies;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Double getProfitBase() {
        return profitBase;
    }

    public void setProfitBase(Double profitBase) {
        this.profitBase = profitBase;
    }

    public Double getBillType() {
        return billType;
    }

    public void setBillType(Double billType) {
        this.billType = billType;
    }

    public Double getQuarter() {
        return quarter;
    }

    public void setQuarter(Double quarter) {
        this.quarter = quarter;
    }

    public Double getRecheckStatus() {
        return recheckStatus;
    }

    public void setRecheckStatus(Double recheckStatus) {
        this.recheckStatus = recheckStatus;
    }

    public Date getLatestRecheckTime() {
        return latestRecheckTime;
    }

    public void setLatestRecheckTime(Date latestRecheckTime) {
        this.latestRecheckTime = latestRecheckTime;
    }

    public String getRecheckUserId() {
        return recheckUserId;
    }

    public void setRecheckUserId(String recheckUserId) {
        this.recheckUserId = recheckUserId;
    }

    public String getRecheckRemark() {
        return recheckRemark;
    }

    public void setRecheckRemark(String recheckRemark) {
        this.recheckRemark = recheckRemark;
    }

    public Double getBusinessIncome() {
        return businessIncome;
    }

    public void setBusinessIncome(Double businessIncome) {
        this.businessIncome = businessIncome;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(Double settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public Double getSettlementCopies() {
        return settlementCopies;
    }

    public void setSettlementCopies(Double settlementCopies) {
        this.settlementCopies = settlementCopies;
    }

    public Double getOutAccountType() {
        return outAccountType;
    }

    public void setOutAccountType(Double outAccountType) {
        this.outAccountType = outAccountType;
    }

    public Double getAllCopies() {
        return allCopies;
    }

    public void setAllCopies(Double allCopies) {
        this.allCopies = allCopies;
    }

    @Override
    protected Serializable pkVal() {
        return this.balanceId;
    }

    @Override
    public String toString() {
        return "BillBalanceInfo{" +
        ", balanceId=" + balanceId +
        ", userId=" + userId +
        ", year=" + year +
        ", month=" + month +
        ", productId=" + productId +
        ", copies=" + copies +
        ", totalAmount=" + totalAmount +
        ", checkStatus=" + checkStatus +
        ", latestCheckTime=" + latestCheckTime +
        ", createType=" + createType +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", remark=" + remark +
        ", createUserId=" + createUserId +
        ", updateUserId=" + updateUserId +
        ", checkConfirmUserId=" + checkConfirmUserId +
        ", checkConfirmTime=" + checkConfirmTime +
        ", notQcCopies=" + notQcCopies +
        ", confirmationCreateStatus=" + confirmationCreateStatus +
        ", initialAmount=" + initialAmount +
        ", confirmationCreateTime=" + confirmationCreateTime +
        ", initialCopies=" + initialCopies +
        ", areaCode=" + areaCode +
        ", profitBase=" + profitBase +
        ", billType=" + billType +
        ", quarter=" + quarter +
        ", recheckStatus=" + recheckStatus +
        ", latestRecheckTime=" + latestRecheckTime +
        ", recheckUserId=" + recheckUserId +
        ", recheckRemark=" + recheckRemark +
        ", businessIncome=" + businessIncome +
        ", taxAmount=" + taxAmount +
        ", taxRate=" + taxRate +
        ", settlementAmount=" + settlementAmount +
        ", settlementCopies=" + settlementCopies +
        ", outAccountType=" + outAccountType +
        ", allCopies=" + allCopies +
        "}";
    }
}
