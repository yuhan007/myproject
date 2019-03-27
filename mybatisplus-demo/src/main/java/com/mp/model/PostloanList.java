package com.mp.model;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wj
 * @since 2019-03-27
 */
public class PostloanList extends Model<PostloanList> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String dhId;
    private String bank;
    private String product;
    private String yf;
    private String nsrmc;
    private String nsrsbh;
    private String area;
    private Date lrsj;
    private String sbssqq;
    private String sbssqz;
    private String nslxmc;
    private String nsrztmc;
    private String cqbz;
    private String jcbz;
    private String fsbz;
    private String remark01;
    private String remark02;
    private String remark03;
    private String remark04;
    private String remark05;
    private String remark06;
    private String orderNo;
    private String appendix;
    private String userId;
    private String productId;
    private String team;
    private String djxh;
    private String orderNsrsbh;
    private Date createTime;
    private String createBy;
    private Date updateTime;
    private String updateBy;
    private Integer flag;
    private String version;
    private Integer enable;
    private String remark;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDhId() {
        return dhId;
    }

    public void setDhId(String dhId) {
        this.dhId = dhId;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getYf() {
        return yf;
    }

    public void setYf(String yf) {
        this.yf = yf;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Date getLrsj() {
        return lrsj;
    }

    public void setLrsj(Date lrsj) {
        this.lrsj = lrsj;
    }

    public String getSbssqq() {
        return sbssqq;
    }

    public void setSbssqq(String sbssqq) {
        this.sbssqq = sbssqq;
    }

    public String getSbssqz() {
        return sbssqz;
    }

    public void setSbssqz(String sbssqz) {
        this.sbssqz = sbssqz;
    }

    public String getNslxmc() {
        return nslxmc;
    }

    public void setNslxmc(String nslxmc) {
        this.nslxmc = nslxmc;
    }

    public String getNsrztmc() {
        return nsrztmc;
    }

    public void setNsrztmc(String nsrztmc) {
        this.nsrztmc = nsrztmc;
    }

    public String getCqbz() {
        return cqbz;
    }

    public void setCqbz(String cqbz) {
        this.cqbz = cqbz;
    }

    public String getJcbz() {
        return jcbz;
    }

    public void setJcbz(String jcbz) {
        this.jcbz = jcbz;
    }

    public String getFsbz() {
        return fsbz;
    }

    public void setFsbz(String fsbz) {
        this.fsbz = fsbz;
    }

    public String getRemark01() {
        return remark01;
    }

    public void setRemark01(String remark01) {
        this.remark01 = remark01;
    }

    public String getRemark02() {
        return remark02;
    }

    public void setRemark02(String remark02) {
        this.remark02 = remark02;
    }

    public String getRemark03() {
        return remark03;
    }

    public void setRemark03(String remark03) {
        this.remark03 = remark03;
    }

    public String getRemark04() {
        return remark04;
    }

    public void setRemark04(String remark04) {
        this.remark04 = remark04;
    }

    public String getRemark05() {
        return remark05;
    }

    public void setRemark05(String remark05) {
        this.remark05 = remark05;
    }

    public String getRemark06() {
        return remark06;
    }

    public void setRemark06(String remark06) {
        this.remark06 = remark06;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAppendix() {
        return appendix;
    }

    public void setAppendix(String appendix) {
        this.appendix = appendix;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getDjxh() {
        return djxh;
    }

    public void setDjxh(String djxh) {
        this.djxh = djxh;
    }

    public String getOrderNsrsbh() {
        return orderNsrsbh;
    }

    public void setOrderNsrsbh(String orderNsrsbh) {
        this.orderNsrsbh = orderNsrsbh;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "PostloanList{" +
        ", id=" + id +
        ", dhId=" + dhId +
        ", bank=" + bank +
        ", product=" + product +
        ", yf=" + yf +
        ", nsrmc=" + nsrmc +
        ", nsrsbh=" + nsrsbh +
        ", area=" + area +
        ", lrsj=" + lrsj +
        ", sbssqq=" + sbssqq +
        ", sbssqz=" + sbssqz +
        ", nslxmc=" + nslxmc +
        ", nsrztmc=" + nsrztmc +
        ", cqbz=" + cqbz +
        ", jcbz=" + jcbz +
        ", fsbz=" + fsbz +
        ", remark01=" + remark01 +
        ", remark02=" + remark02 +
        ", remark03=" + remark03 +
        ", remark04=" + remark04 +
        ", remark05=" + remark05 +
        ", remark06=" + remark06 +
        ", orderNo=" + orderNo +
        ", appendix=" + appendix +
        ", userId=" + userId +
        ", productId=" + productId +
        ", team=" + team +
        ", djxh=" + djxh +
        ", orderNsrsbh=" + orderNsrsbh +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        ", updateTime=" + updateTime +
        ", updateBy=" + updateBy +
        ", flag=" + flag +
        ", version=" + version +
        ", enable=" + enable +
        ", remark=" + remark +
        "}";
    }
}
