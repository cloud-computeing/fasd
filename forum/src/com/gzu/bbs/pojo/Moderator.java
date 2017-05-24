package com.gzu.bbs.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

@Validated
public class Moderator {
	@Min(value=1,message="{Moderator.moderatorid.length.error}")
    private Integer moderatorid;
	
	@Size(min=1,max=16,message="{Moderator.moderatorname.length.error}")
    private String moderatorname;
	
	@Size(min=1,max=16,message="{Moderator.moderatorpassword.length.error}")
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