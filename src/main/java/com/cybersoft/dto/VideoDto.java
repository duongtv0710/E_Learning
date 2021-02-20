package com.cybersoft.dto;

public class VideoDto {

	private int id;
	private String title;
	private int timeCount;
	private String url;
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
