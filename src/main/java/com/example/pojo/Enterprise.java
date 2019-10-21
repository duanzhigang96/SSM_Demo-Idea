package com.example.pojo;

public class Enterprise {
    private String enterpriseId;

    private String enterpriseName;

    private String unread_notice_number;

    private String icon_url;

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getUnread_notice_number() {
        return unread_notice_number;
    }

    public void setUnread_notice_number(String unread_notice_number) {
        this.unread_notice_number = unread_notice_number;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }
}