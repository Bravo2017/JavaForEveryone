package com.nationwide.chapter12.feight;

/**
 * 
 * @author Suzanne Feight
 * 
 */

public class Appointment {

	private String appointmentDate;
	private String startTime;
	private String endingTime;
	private String description;

	public Appointment(String newDate, String sTime, String eTime, String desc) {

		appointmentDate = newDate;
		startTime = sTime;
		endingTime = eTime;
		description = desc;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String newDate) {
		appointmentDate = newDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String newTime) {
		startTime = newTime;
	}

	public String getEndingTime() {
		return endingTime;
	}

	public void setEndingTime(String newTime) {
		endingTime = newTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String newDesc) {
		description = newDesc;
	}

}
