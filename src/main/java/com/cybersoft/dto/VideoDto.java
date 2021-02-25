package com.cybersoft.dto;

import javax.validation.constraints.NotEmpty;

public class VideoDto {

	@NotEmpty(message = "Id is not Null !")
	private int id;
	
	@NotEmpty(message = "Please Enter Title !")
	private String title;
	
	@NotEmpty(message = "Please Enter TimeCount !")
	private int timeCount;
	
	@NotEmpty(message = "Please Enter Url !")
	private String url;
	
	@NotEmpty(message = "Please Enter Course_Id !")
	private int courseId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTimeCount() {
		return timeCount;
	}

	public void setTimeCount(int timeCount) {
		this.timeCount = timeCount;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public VideoDto() {
		
	}

	public VideoDto(int id, String title, int timeCount, String url, int courseId) {
		
		this.id = id;
		this.title = title;
		this.timeCount = timeCount;
		this.url = url;
		this.courseId = courseId;
	}
	
	
}
