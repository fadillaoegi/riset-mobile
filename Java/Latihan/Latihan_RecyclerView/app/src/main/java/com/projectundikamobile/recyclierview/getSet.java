package com.projectundikamobile.recyclierview;

public class getSet {

    private String Dev ;
    private String lang;
    private String desc;

    public getSet(String dev, String lang, String desc) {
        this.Dev = dev;
        this.lang = lang;
        this.desc = desc;
    }

    public String getDev() {
        return Dev;
    }

    public void setDev(String dev) {
        Dev = dev;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
