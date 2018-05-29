package com.cs.bru.model;

import java.sql.Date;

public class Preriod {
	private int PreriodID;
	private Date StartTime;
	private Date FinishTime; 
	private  String CommentPreriod;
	public int getPreriodID() {
		return PreriodID;
	}
	public void setPreriodID(int preriodID) {
		PreriodID = preriodID;
	}
	public Date getStartTime() {
		return StartTime;
	}
	public void setStartTime(Date startTime) {
		StartTime = startTime;
	}
	public Date getFinishTime() {
		return FinishTime;
	}
	public void setFinishTime(Date finishTime) {
		FinishTime = finishTime;
	}
	public String getCommentPreriod() {
		return CommentPreriod;
	}
	public void setCommentPreriod(String commentPreriod) {
		CommentPreriod = commentPreriod;
	}
	
	
}
