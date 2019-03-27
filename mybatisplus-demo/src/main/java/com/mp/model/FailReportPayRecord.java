package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 报告计费记录表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class FailReportPayRecord extends Model<FailReportPayRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * 交易编号
     */
    private String tradeId;
    /**
     * 结算用户编号（银行编号）
     */
    private String userId;
    /**
     * 交易账户编号
     */
    private String tradeUserId;
    /**
     * 产品编号
     */
    private String productId;
    /**
     * 纳税人识别号（同一个识别号同种产品同一个月内只计算一次费用）
     */
    private String nsrsbh;
    /**
     * 省份编码
     */
    private String province;
    /**
     * 城市编码
     */
    private String city;
    /**
     * 报告生成编号
     */
    private String reportId;
    /**
     * 计费时间
     */
    private Date payTime;
    /**
     * 消费金额（以份数消费时，金额为0），月结为0
     */
    private Double payAmount;
    /**
     * 消费份数，用户购买的份数尚有没用完是才有，直接减去一份，否则为0，月结用户只保存份数，不减用户剩余份数
     */
    private Double payCopies;
    /**
     * 1：现结（默认）；2：按月结算；3：按季度结算；11：包月会员免支付；12：包年会员免支付
     */
    private Double payType;
    /**
     * 备注
     */
    private String remark;
    /**
     * 报告年月：发送报告内容所属年月：201704
     */
    private String reportYearMonth;
    /**
     * 录入时间
     */
    private Date createTime;
    /**
     * 标准产品编号
     */
    private String standardProductId;
    /**
     * 是否补发
     */
    private String reissue;
    /**
     * 0未处理     1已处理
     */
    private Double dealWith;
    /**
     * 处理时间
     */
    private Date dealWithTime;


    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTradeUserId() {
        return tradeUserId;
    }

    public void setTradeUserId(String tradeUserId) {
        this.tradeUserId = tradeUserId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Double getPayCopies() {
        return payCopies;
    }

    public void setPayCopies(Double payCopies) {
        this.payCopies = payCopies;
    }

    public Double getPayType() {
        return payType;
    }

    public void setPayType(Double payType) {
        this.payType = payType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReportYearMonth() {
        return reportYearMonth;
    }

    public void setReportYearMonth(String reportYearMonth) {
        this.reportYearMonth = reportYearMonth;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStandardProductId() {
        return standardProductId;
    }

    public void setStandardProductId(String standardProductId) {
        this.standardProductId = standardProductId;
    }

    public String getReissue() {
        return reissue;
    }

    public void setReissue(String reissue) {
        this.reissue = reissue;
    }

    public Double getDealWith() {
        return dealWith;
    }

    public void setDealWith(Double dealWith) {
        this.dealWith = dealWith;
    }

    public Date getDealWithTime() {
        return dealWithTime;
    }

    public void setDealWithTime(Date dealWithTime) {
        this.dealWithTime = dealWithTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.tradeId;
    }

    @Override
    public String toString() {
        return "FailReportPayRecord{" +
        ", tradeId=" + tradeId +
        ", userId=" + userId +
        ", tradeUserId=" + tradeUserId +
        ", productId=" + productId +
        ", nsrsbh=" + nsrsbh +
        ", province=" + province +
        ", city=" + city +
        ", reportId=" + reportId +
        ", payTime=" + payTime +
        ", payAmount=" + payAmount +
        ", payCopies=" + payCopies +
        ", payType=" + payType +
        ", remark=" + remark +
        ", reportYearMonth=" + reportYearMonth +
        ", createTime=" + createTime +
        ", standardProductId=" + standardProductId +
        ", reissue=" + reissue +
        ", dealWith=" + dealWith +
        ", dealWithTime=" + dealWithTime +
        "}";
    }
}
