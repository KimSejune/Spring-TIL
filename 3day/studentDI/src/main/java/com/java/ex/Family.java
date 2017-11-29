package com.java.ex;

public class Family {
	public String papaName; // constructor
	public String mamiName; // constructor
	public String sisName; // setter
	public String broName; // setter
	
	
	public Family(String papaName, String mamiName) {
		this.papaName = papaName;
		this.mamiName = mamiName;
	}


	public String getPapaName() {
		return papaName;
	}


	public void setPapaName(String papaName) {
		this.papaName = papaName;
	}


	public String getMamiName() {
		return mamiName;
	}


	public void setMamiName(String mamiName) {
		this.mamiName = mamiName;
	}


	public String getSisName() {
		return sisName;
	}


	public void setSisName(String sisName) {
		this.sisName = sisName;
	}


	public String getBroName() {
		return broName;
	}


	public void setBroName(String broName) {
		this.broName = broName;
	}
	
	
}
