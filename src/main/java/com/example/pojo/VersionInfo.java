package com.example.pojo;

import java.util.List;

public class VersionInfo {

    private String current_version;
    private String force_version_up;
    private String maintenance;
    private String message;
    private String url;
    private List<customize_maintenance> customize_maintenance;

    public String getCurrent_version() {
        return current_version;
    }

    public void setCurrent_version(String current_version) {
        this.current_version = current_version;
    }

    public String getForce_version_up() {
        return force_version_up;
    }

    public void setForce_version_up(String force_version_up) {
        this.force_version_up = force_version_up;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<com.example.pojo.customize_maintenance> getCustomize_maintenance() {
        return customize_maintenance;
    }

    public void setCustomize_maintenance(List<com.example.pojo.customize_maintenance> customize_maintenance) {
        this.customize_maintenance = customize_maintenance;
    }
}
