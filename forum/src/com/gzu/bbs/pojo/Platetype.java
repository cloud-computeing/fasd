package com.gzu.bbs.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;


@Validated
public class Platetype {
	@Min(value=1)
    private Integer platetypeid;
	
	@NotNull
    private String platetypename;

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


}