package com.cs.bru.model;



public class Position {
	private int PositionID;
	private String PositionName;
	private int NumTeach; 
	private  int NumBerk;
	public int getPositionID() {
		return PositionID;
	}
	public void setPositionID(int positionID) {
		PositionID = positionID;
	}
	public String getPositionName() {
		return PositionName;
	}
	public void setPositionName(String positionName) {
		PositionName = positionName;
	}
	public int getNumTeach() {
		return NumTeach;
	}
	public void setNumTeach(int numTeach) {
		NumTeach = numTeach;
	}
	public int getNumBerk() {
		return NumBerk;
	}
	public void setNumBerk(int numBerk) {
		NumBerk = numBerk;
	}
	
	
}
