package com.example.pojo;

import java.util.List;

public class yhy_info {
    private String title;
    private String detail;
    private String img;
    private List<yhy_info> infos;

    public List<yhy_info> getInfos() {
        return infos;
    }

    public void setInfos(List<yhy_info> infos) {
        this.infos = infos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
