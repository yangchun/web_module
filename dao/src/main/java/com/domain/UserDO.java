package com.domain;

import com.sfebiz.common.dao.domain.BaseDO;

import java.util.Date;

/**
 * @author yangh [yangh@ifunq.com]
 * @description: 用户DO
 * @date 2017/9/12 14:17
 */

public class UserDO extends BaseDO {

    private static final long serialVersionUID = -5702383015372517501L;

    private Long id;
    private String account;
    private String nickName;
    private String password;
    private String description;
    private String cellphone;
    private String photoUrl;
    private String email;
    private String latestLoginIpAddress;
    private Integer loginTimes;
    private Long parentId;
    private String state;
    private Integer isParent;
    private Date latestLoginTime;
    private Date latestModifiedPwdTime;
    private Integer isDelete;
    private Date gmtCreate;
    private Date gmtModified;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getLatestLoginIpAddress() {
        return latestLoginIpAddress;
    }

    public void setLatestLoginIpAddress(String latestLoginIpAddress) {
        this.latestLoginIpAddress = latestLoginIpAddress;
    }

    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    public Date getLatestLoginTime() {
        return latestLoginTime;
    }

    public void setLatestLoginTime(Date latestLoginTime) {
        this.latestLoginTime = latestLoginTime;
    }

    public Date getLatestModifiedPwdTime() {
        return latestModifiedPwdTime;
    }

    public void setLatestModifiedPwdTime(Date latestModifiedPwdTime) {
        this.latestModifiedPwdTime = latestModifiedPwdTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }


    @Override
    public Date getGmtCreate() {
        return gmtCreate;
    }

    @Override
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Override
    public Date getGmtModified() {
        return gmtModified;
    }

    @Override
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }


    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", description='" + description + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", email='" + email + '\'' +
                ", latestLoginIpAddress='" + latestLoginIpAddress + '\'' +
                ", loginTimes=" + loginTimes +
                ", parentId=" + parentId +
                ", state='" + state + '\'' +
                ", isParent=" + isParent +
                ", latestLoginTime=" + latestLoginTime +
                ", latestModifiedPwdTime=" + latestModifiedPwdTime +
                ", isDelete=" + isDelete +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}

