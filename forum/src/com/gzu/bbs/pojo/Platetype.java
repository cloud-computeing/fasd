package com.gzu.bbs.pojo;

public class Platetype {
    private Integer platetypeid;

    private String platetypename;

    private Integer moderatorid;

    public Integer getPlatetypeid() {
        return platetypeid;
    }

    public void setPlatetypeid(Integer platetypeid) {
        this.platetypeid = platetypeid;
    }

    public String getPlatetypename() {
        return platetypename;
    }

    public void setPlatetypename(String platetypename) {
        this.platetypename = platetypename == null ? null : platetypename.trim();
    }

    public Integer getModeratorid() {
        return moderatorid;
    }

    public void setModeratorid(Integer moderatorid) {
        this.moderatorid = moderatorid;
    }
}