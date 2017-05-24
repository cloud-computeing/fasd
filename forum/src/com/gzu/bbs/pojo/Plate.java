package com.gzu.bbs.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;
@Validated
public class Plate {
	@Min(value=1,message="{Plate.plateid.length.error}")
    private Integer plateid;

	@Size(min=1,max=16,message="{Plate.platename.length.error}")
    private String platename;

	@Min(value = 1,message="{Plate.moderatorid.null.error}")
    private Integer moderatorid;

	@Min(value =1,message="{Plate.platetypeid.null.error}")
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