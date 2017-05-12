package com.google.devrel.training.conference.domain;

import java.util.Date;
import java.util.List;

import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

@Entity
public class Session {

    @Id
    private Long id;

    @Index
    private String name;

    private List<String> highlights;

    @Parent
    @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
    private Key<Conference> conferenceKey;

    @Index
    private String speaker;
    
    private Integer duration;
    
    @Index
    private String type;
    
    @Index
    private Date date;
    
    private Integer startTime;
    
    
    private Session(){}
    
    public Session(String name, List<String> highlights, Key<Conference> conferenceKey,
			String speaker, Integer duration, String type, Date date, Integer startTime) {
		super();
		this.name = name;
		this.highlights = highlights;
		this.conferenceKey = conferenceKey;
		this.speaker = speaker;
		this.duration = duration;
		this.type = type;
		this.date = date;
		this.startTime = startTime;
	}

	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
    public Key<Conference> getConferenceKey() {
        return conferenceKey;
    }

    public String getWebsafeKey() {
        return Key.create(conferenceKey, Session.class, id).getString();
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public void setConferenceKey(Key<Conference> conferenceKey) {
		this.conferenceKey = conferenceKey;
	}
}
