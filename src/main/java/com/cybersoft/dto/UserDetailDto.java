package com.cybersoft.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailDto extends User implements UserDetails{
	private String fullname;
	private String avatar;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDetailDto(String username, String password, String fullname, String avatar, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		this.fullname = fullname;
		this.avatar = avatar;
		// TODO Auto-generated constructor stub
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	

}
