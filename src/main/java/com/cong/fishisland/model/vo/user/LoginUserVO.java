package com.cong.fishisland.model.vo.user;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * 已登录用户视图（脱敏）
 * # @author <a href="https://github.com/lhccong">程序员聪</a>
 **/
@Data
public class LoginUserVO implements Serializable {

    /**
     * 用户 id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 用户简介
     */
    private String userProfile;

    /**
     * 用户角色：user/admin/ban
     */
    private String userRole;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 积分
     */
    @TableField(value = "points")
    private Integer points;

    /**
     * 已使用积分
     */
    @TableField(value = "usedPoints")
    private Integer usedPoints;

    /**
     * 用户等级
     */
    @TableField(value = "level")
    private Integer level;

    /**
     * 最后签到时间
     */
    @TableField(value = "lastSignInDate")
    private Date lastSignInDate;

    private static final long serialVersionUID = 1L;
}