package com.cs.bru.model;

import java.sql.Date;

public class SpecialTeaching {
	private int SpeciaID;
	private Date DateTime;
	private Date StartTime;
	private int Volpreriod;
	private String DateChange;
	public int getSpeciaID() {
		return SpeciaID;
	}
	public void setSpeciaID(int speciaID) {
		SpeciaID = speciaID;
	}
	public Date getDateTime() {
		return DateTime;
	}
	public void setDateTime(Date dateTime) {
		DateTime = dateTime;
	}
	public Date getStartTime() {
		return StartTime;
	}
	public void setStartTime(Date startTime) {
		StartTime = startTime;
	}
	public int getVolpreriod() {
		return Volpreriod;
	}
	public void setVolpreriod(int volpreriod) {
		Volpreriod = volpreriod;
	}
	public String getDateChange() {
		return DateChange;
	}
	public void setDateChange(String dateChange) {
		DateChange = dateChange;
	}
	
	
	
}
