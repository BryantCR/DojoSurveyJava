package com.dojosurvey;

public class DojoInfo {
	private String firstName;
	private String dojoLocation;
	private String fLanguage;
	private String comment;
	
	public DojoInfo(String firstName, String dojoLocation, String fLanguage, String comment) {
		this.firstName = firstName;
		this.dojoLocation = dojoLocation;
		this.fLanguage = fLanguage;
		this.comment = comment;
	}
	
	// Getters

	public String getFirstName() {
		return firstName;
	}
	public String getDojoLocation() {
		return dojoLocation;
	}
	public String getfLanguage() {
		return fLanguage;
	}	
	public String getComment() {
		return comment;
	}	
	
	// Setters
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setDojoLocation(String dojoLocation) {
		this.dojoLocation = dojoLocation;
	}

	public void setfLanguage(String fLanguage) {
		this.fLanguage = fLanguage;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
