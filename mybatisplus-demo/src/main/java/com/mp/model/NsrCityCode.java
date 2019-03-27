package com.mp.model;

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
public class NsrCityCode extends Model<NsrCityCode> {

    private static final long serialVersionUID = 1L;

    private String nsrsbh;
    private String nsrmc;
    private String cityCode;


    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "NsrCityCode{" +
        ", nsrsbh=" + nsrsbh +
        ", nsrmc=" + nsrmc +
        ", cityCode=" + cityCode +
        "}";
    }
}
