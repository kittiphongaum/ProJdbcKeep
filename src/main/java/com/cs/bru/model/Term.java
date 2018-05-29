package com.cs.bru.model;

public class Term {
	private int TermID;
	private int TermName;
	private int YearTerm;
	private String StartTeach;
	private String StopTeach;
	public int getTermID() {
		return TermID;
	}
	public void setTermID(int termID) {
		TermID = termID;
	}
	public int getTermName() {
		return TermName;
	}
	public void setTermName(int termName) {
		TermName = termName;
	}
	public int getYearTerm() {
		return YearTerm;
	}
	public void setYearTerm(int yearTerm) {
		YearTerm = yearTerm;
	}
	public String getStartTeach() {
		return StartTeach;
	}
	public void setStartTeach(String startTeach) {
		StartTeach = startTeach;
	}
	public String getStopTeach() {
		return StopTeach;
	}
	public void setStopTeach(String stopTeach) {
		StopTeach = stopTeach;
	}
}
