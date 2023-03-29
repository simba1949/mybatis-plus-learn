package top.simba1949.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 用户信息表
 * @TableName user
 */
@TableName(value ="user")
@Data
public class UserEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 业务编码
     */
    private String code;

    /**
     * 用户登录名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 地址
     */
    private String address;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 邮件
     */
    private String email;

    /**
     * 是否启用，0表示否，1表示是
     */
    private Byte blEnable;

    /**
     * 是否删除，0表示否，1表示是
     */
    private Byte blDelete;

    /**
     * 版本号
     */
    private Long version;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建人id
     */
    private Long creatorId;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改人id
     */
    private Long modifierId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}