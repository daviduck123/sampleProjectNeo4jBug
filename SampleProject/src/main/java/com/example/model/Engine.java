package com.example.model;

import java.util.Date;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Engine {
	@GraphId
	Long graphId;

	String id;

	@Relationship(type = "HAS_WELL", direction = "OUTGOING")
	private Machine machine;

	private String name;

	private Boolean active;

	private Boolean isTracking;

	private Boolean isCheckActivityDetail;

	private Boolean isCheckActivityMilestone;

	private Boolean isCheckDelimiter;

	private Boolean isCheckNpt;

	private Boolean isCheckNptStart;

	private Boolean isCheckTopNpt;

	private Boolean isCheckNptSummary;

	private Boolean lineEngineInactive;

	private Boolean nptSummary;

	private Boolean isTemporary;

	private Date lastModified;

	public Engine() {
		super();
	}

	public Engine(Machine machine, String name) {
		super();
		this.machine = machine;
		this.name = name;
		this.active = false;
		this.isTracking = false;
		this.isCheckActivityDetail = false;
		this.isCheckActivityMilestone = false;
		this.isCheckNpt = true;
		this.isCheckNptStart = true;
		this.isCheckTopNpt = false;
		this.isCheckNptSummary = false;
		this.lineEngineInactive = false;
		this.isCheckDelimiter = false;
	}

	public Long getGraphId() {
		return graphId;
	}

	public void setGraphId(Long graphId) {
		this.graphId = graphId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getIsTracking() {
		return isTracking;
	}

	public void setIsTracking(Boolean isTracking) {
		this.isTracking = isTracking;
	}

	public Boolean getIsCheckActivityDetail() {
		return isCheckActivityDetail;
	}

	public void setIsCheckActivityDetail(Boolean isCheckActivityDetail) {
		this.isCheckActivityDetail = isCheckActivityDetail;
	}

	public Boolean getIsCheckActivityMilestone() {
		return isCheckActivityMilestone;
	}

	public void setIsCheckActivityMilestone(Boolean isCheckActivityMilestone) {
		this.isCheckActivityMilestone = isCheckActivityMilestone;
	}

	public Boolean getIsCheckDelimiter() {
		return isCheckDelimiter;
	}

	public void setIsCheckDelimiter(Boolean isCheckDelimiter) {
		this.isCheckDelimiter = isCheckDelimiter;
	}

	public Boolean getIsCheckNpt() {
		return isCheckNpt;
	}

	public void setIsCheckNpt(Boolean isCheckNpt) {
		this.isCheckNpt = isCheckNpt;
	}

	public Boolean getIsCheckNptStart() {
		return isCheckNptStart;
	}

	public void setIsCheckNptStart(Boolean isCheckNptStart) {
		this.isCheckNptStart = isCheckNptStart;
	}

	public Boolean getIsCheckTopNpt() {
		return isCheckTopNpt;
	}

	public void setIsCheckTopNpt(Boolean isCheckTopNpt) {
		this.isCheckTopNpt = isCheckTopNpt;
	}

	public Boolean getIsCheckNptSummary() {
		return isCheckNptSummary;
	}

	public void setIsCheckNptSummary(Boolean isCheckNptSummary) {
		this.isCheckNptSummary = isCheckNptSummary;
	}

	public Boolean getLineEngineInactive() {
		return lineEngineInactive;
	}

	public void setLineEngineInactive(Boolean lineEngineInactive) {
		this.lineEngineInactive = lineEngineInactive;
	}

	public Boolean getNptSummary() {
		return nptSummary;
	}

	public void setNptSummary(Boolean nptSummary) {
		this.nptSummary = nptSummary;
	}

	public Boolean getIsTemporary() {
		return isTemporary;
	}

	public void setIsTemporary(Boolean isTemporary) {
		this.isTemporary = isTemporary;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return "Engine [graphId=" + graphId + ", id=" + id + ", machine=" + machine + ", name=" + name + ", active="
				+ active + ", isTracking=" + isTracking + ", isCheckActivityDetail=" + isCheckActivityDetail
				+ ", isCheckActivityMilestone=" + isCheckActivityMilestone + ", isCheckDelimiter=" + isCheckDelimiter
				+ ", isCheckNpt=" + isCheckNpt + ", isCheckNptStart=" + isCheckNptStart + ", isCheckTopNpt="
				+ isCheckTopNpt + ", isCheckNptSummary=" + isCheckNptSummary + ", lineEngineInactive=" + lineEngineInactive
				+ ", nptSummary=" + nptSummary + ", isTemporary=" + isTemporary + ", lastModified=" + lastModified
				+ "]";
	}
}
