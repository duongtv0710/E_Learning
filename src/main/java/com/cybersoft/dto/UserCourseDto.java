package com.cybersoft.dto;

public class UserCourseDto  {
	
	private int userId;
	private int courseId;
	private int roleId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public UserCourseDto() {
		
	}

	public UserCourseDto(int userId, int courseId, int roleId) {
		
		this.userId = userId;
		this.courseId = courseId;
		this.roleId = roleId;
	}
	
	
}
