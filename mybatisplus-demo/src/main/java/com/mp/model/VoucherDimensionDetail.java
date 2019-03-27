package com.mp.model;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 凭证维度明细表
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class VoucherDimensionDetail extends Model<VoucherDimensionDetail> {

    private static final long serialVersionUID = 1L;

    /**
     * 维度明细id
     */
    private String dimensionDetailId;
    /**
     * 科目明细编号
     */
    private String subjectDetailId;
    /**
     * 维度类型
     */
    private String dimensionType;
    /**
     * 维度编码
     */
    private String dimensionCode;


    public String getDimensionDetailId() {
        return dimensionDetailId;
    }

    public void setDimensionDetailId(String dimensionDetailId) {
        this.dimensionDetailId = dimensionDetailId;
    }

    public String getSubjectDetailId() {
        return subjectDetailId;
    }

    public void setSubjectDetailId(String subjectDetailId) {
        this.subjectDetailId = subjectDetailId;
    }

    public String getDimensionType() {
        return dimensionType;
    }

    public void setDimensionType(String dimensionType) {
        this.dimensionType = dimensionType;
    }

    public String getDimensionCode() {
        return dimensionCode;
    }

    public void setDimensionCode(String dimensionCode) {
        this.dimensionCode = dimensionCode;
    }

    @Override
    protected Serializable pkVal() {
        return this.dimensionDetailId;
    }

    @Override
    public String toString() {
        return "VoucherDimensionDetail{" +
        ", dimensionDetailId=" + dimensionDetailId +
        ", subjectDetailId=" + subjectDetailId +
        ", dimensionType=" + dimensionType +
        ", dimensionCode=" + dimensionCode +
        "}";
    }
}
