package com.nationwide.chapter12.watson;

import java.util.ArrayList;

public class ClassAppointmentCalendar {

	private ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

	public void add(Appointment a) {
		// A sorted list would be better
		appointmentList.add(a);
	}

}
