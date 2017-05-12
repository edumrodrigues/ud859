package com.google.devrel.training.conference.form;

import java.util.Date;
import java.util.List;

public class SessionForm {
	private String name;
	private List<String> highlights;
	private String speaker;
	private Integer duration;
	private String typeOfSession;
	private Date date;
	private Integer startTime;

    public SessionForm(String name, List<String> highlights, String speaker, Integer duration, String typeOfSession,
			Date date, Integer startTime) {
		super();
		this.name = name;
		this.highlights = highlights;
		this.speaker = speaker;
		this.duration = duration;
		this.typeOfSession = typeOfSession;
		this.date = date;
		this.startTime = startTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getHighlights() {
		return highlights;
	}

	public void setHighlights(List<String> highlights) {
		this.highlights = highlights;
	}

	public String getSpeaker() {
		return speaker;
	}

	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getTypeOfSession() {
		return typeOfSession;
	}

	public void setTypeOfSession(String typeOfSession) {
		this.typeOfSession = typeOfSession;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getStartTime() {
		return startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
}
