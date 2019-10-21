package com.example.pojo;

import java.util.List;
import java.util.Map;

public class ReturnInfo {
    String status;
    Menu_data data;

    Map data2;

    User user;
    List<Enterprise> enterpriseList;
    List<menu> menuList;
    List<Interview> interviewList;
    List<Notice> noticeList;
    VersionInfo versionInfo;
    String message;

    Info info;

    List<yhy_info> yhy_infos;

    public List<yhy_info> getYhy_infos() {
        return yhy_infos;
    }

    public void setYhy_infos(List<yhy_info> yhy_infos) {
        this.yhy_infos = yhy_infos;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map getData2() {
        return data2;
    }

    public void setData2(Map data2) {
        this.data2 = data2;
    }

    public Menu_data getData() {
        return data;
    }

    public void setData(Menu_data data) {
        this.data = data;
    }

    public VersionInfo getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(VersionInfo versionInfo) {
        this.versionInfo = versionInfo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(List<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public List<menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<menu> menuList) {
        this.menuList = menuList;
    }

    public List<Interview> getInterviewList() {
        return interviewList;
    }

    public void setInterviewList(List<Interview> interviewList) {
        this.interviewList = interviewList;
    }

    public List<Notice> getNoticeList() {
        return noticeList;
    }

    public void setNoticeList(List<Notice> noticeList) {
        this.noticeList = noticeList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
