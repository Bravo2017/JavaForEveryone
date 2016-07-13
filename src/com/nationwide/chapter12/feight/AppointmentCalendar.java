package com.nationwide.chapter12.feight;

import java.util.ArrayList;

/**
 * Write a program to design an appointment calendar. An appointment includes
 * the date, starting time, ending time, and a description; for example,Dentist
 * 2012/10/1 17:30 18:30CS1 class 2012/10/2 08:30 10:00 Supply a user interface
 * to add appointments, remove canceled appointments, and print out a list of
 * appointments for a particular day. Follow the design process that was
 * described in this chapter. Your solution should include a class
 * AppointmentCalendar that is not coupled with the Scanner or PrintStream
 * classes.
 * 
 * @author Suzanne Feight
 * 
 */

public class AppointmentCalendar {

	private final ArrayList<Appointment> appointmentArray;

	public AppointmentCalendar() {

		appointmentArray = new ArrayList<Appointment>();
	}

	public Appointment getAppointment(Appointment appointment) {

		return appointmentArray.get(appointmentArray.indexOf(appointment));
	}

	public void addAppointment(Appointment newAppointment) {

		appointmentArray.add(newAppointment);
	}

	public void removeAppointment(Appointment appointment) {

		appointmentArray.remove(appointmentArray.indexOf(appointment));
	}

	public void getAppointmentListByDate(String aDate) {

		for (Appointment appointment : appointmentArray) {
			if (appointment.getAppointmentDate().equals(aDate)) {
				System.out.println("Date: " + appointment.getAppointmentDate()
						+ "  Start: " + appointment.getStartTime() + "  End: "
						+ appointment.getEndingTime() + "  Description: "
						+ appointment.getDescription());
			}
		}
	}
}
