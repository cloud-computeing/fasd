package com.gzu.bbs.pojo;

public class Plate {
    private Integer plateid;

    private String platename;

    private Integer moderatorid;

    private Integer platetypeid;

    public Integer getPlateid() {
        return plateid;
    }

    public void setPlateid(Integer plateid) {
        this.plateid = plateid;
    }

    public String getPlatename() {
        return platename;
    }

    public void setPlatename(String platename) {
        this.platename = platename == null ? null : platename.trim();
    }

    public Integer getModeratorid() {
        return moderatorid;
    }

    public void setModeratorid(Integer moderatorid) {
        this.moderatorid = moderatorid;
    }

    public Integer getPlatetypeid() {
        return platetypeid;
    }

    public void setPlatetypeid(Integer platetypeid) {
        this.platetypeid = platetypeid;
    }
}