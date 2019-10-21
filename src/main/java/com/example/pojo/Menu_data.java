package com.example.pojo;

import java.util.Map;

public class Menu_data {
    private String stopflg;
    private String kgynm;
    private String url;
    private String iconurl;
    private String from;
    private String to;
    private String iwebsiteid;
    private String colorback;
    private String uploadurl;
    private String accessdate;

    public String getColorback() {
        return colorback;
    }

    public void setColorback(String colorback) {
        this.colorback = colorback;
    }

    public String getAccessdate() {
        return accessdate;
    }

    public void setAccessdate(String accessdate) {
        this.accessdate = accessdate;
    }

    public String getUploadurl() {
        return uploadurl;
    }

    public void setUploadurl(String uploadurl) {
        this.uploadurl = uploadurl;
    }

    private Map menu;
    private String noticeCount;

    public String getNoticeCount() {
        return noticeCount;
    }

    public void setNoticeCount(String noticeCount) {
        this.noticeCount = noticeCount;
    }

    public Map getMenu() {
        return menu;
    }

    public void setMenu(Map menu) {
        this.menu = menu;
    }


    public String getIwebsiteid() {
        return iwebsiteid;
    }

    public void setIwebsiteid(String iwebsiteid) {
        this.iwebsiteid = iwebsiteid;
    }

    public String getStopflg() {
        return stopflg;
    }

    public void setStopflg(String stopflg) {
        this.stopflg = stopflg;
    }

    public String getKgynm() {
        return kgynm;
    }

    public void setKgynm(String kgynm) {
        this.kgynm = kgynm;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

}
