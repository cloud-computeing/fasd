package com.gzu.bbs.pojo;

public class Moderator {
    private Integer moderatorid;

    private String moderatorname;

    private String moderatorpassword;

    private String moderatorsex;

    private String moderatorheadid;

    public Integer getModeratorid() {
        return moderatorid;
    }

    public void setModeratorid(Integer moderatorid) {
        this.moderatorid = moderatorid;
    }

    public String getModeratorname() {
        return moderatorname;
    }

    public void setModeratorname(String moderatorname) {
        this.moderatorname = moderatorname == null ? null : moderatorname.trim();
    }

    public String getModeratorpassword() {
        return moderatorpassword;
    }

    public void setModeratorpassword(String moderatorpassword) {
        this.moderatorpassword = moderatorpassword == null ? null : moderatorpassword.trim();
    }

    public String getModeratorsex() {
        return moderatorsex;
    }

    public void setModeratorsex(String moderatorsex) {
        this.moderatorsex = moderatorsex == null ? null : moderatorsex.trim();
    }

    public String getModeratorheadid() {
        return moderatorheadid;
    }

    public void setModeratorheadid(String moderatorheadid) {
        this.moderatorheadid = moderatorheadid == null ? null : moderatorheadid.trim();
    }
}