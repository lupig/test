package com.gttc.test.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 系统访问记录对象 logininfor
 *
 * @author 卢品良
 * @date 2021-09-06
 */
public class Logininfor
{
    private static final long serialVersionUID = 1L;

    /** 访问ID */
    private Long infoId;

    /** 用户账号 */
    private String userName;

    /** 登录地点 */
    private String ip;

    /** 提示消息 */
    private String msg;

    /** 访问时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date loginTime;

    public void setInfoId(Long infoId)
    {
        this.infoId = infoId;
    }

    public Long getInfoId()
    {
        return infoId;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;
    }
    public void setIp(String ip)
    {
        this.ip = ip;
    }

    public String getIp()
    {
        return ip;
    }
    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public String getMsg()
    {
        return msg;
    }
    public void setLoginTime(Date loginTime)
    {
        this.loginTime = loginTime;
    }

    public Date getLoginTime()
    {
        return loginTime;
    }

    public Logininfor(String userName, String ip, String msg, Date loginTime) {
        this.userName = userName;
        this.ip = ip;
        this.msg = msg;
        this.loginTime = loginTime;
    }

    @Override
    public String toString() {
        return "Logininfor{" +
                "infoId=" + infoId +
                ", userName='" + userName + '\'' +
                ", ip='" + ip + '\'' +
                ", msg='" + msg + '\'' +
                ", loginTime=" + loginTime +
                '}';
    }
}
