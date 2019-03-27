package com.mp.model;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author wj
 * @since 2019-03-26
 */
@Data
@Accessors(chain = true)
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String userName;
    private Integer userAge;
    private String userEmail;
    private Date createTime;
    private Date updateTime;




    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        ", id=" + id +
        ", userName=" + userName +
        ", userAge=" + userAge +
        ", userEmail=" + userEmail +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
