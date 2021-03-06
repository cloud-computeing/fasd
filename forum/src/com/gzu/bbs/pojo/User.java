package com.gzu.bbs.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.validation.annotation.Validated;

@Validated
public class User {
	@Size(min=1,max=16,message="{User.userid.length.error}")
    private String userid;
	
	@Size(min=1,max=16,message="{User.userpassword.length.error}")
    private String userpassword;
	
	@Size(min=1,max=16,message="{User.username.length.error}")
    private String username;

	@Email(message="{User.usermail.length.error}")
    private String usermail;

    private String usersex;

    private String userheadid;

    private String signature;

    @Max(value = 2)
    private int flag;

    public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail == null ? null : usermail.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getUserheadid() {
        return userheadid;
    }

    public void setUserheadid(String userheadid) {
        this.userheadid = userheadid == null ? null : userheadid.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }
}