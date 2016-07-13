package com.nationwide.chapter12.feight;

/**
 * 
 * @author Suzanne Feight
 * 
 */

public class AppointmentCalendarTester {

	public static void main(String[] args) {
		AppointmentCalendar appointmentCalendar = new AppointmentCalendar();

		Appointment app1 = new Appointment("07/30/2016", "08:00", "20:00",
				"Brian's Birthday");

		Appointment app2 = new Appointment("07/15/2016", "10:00", "11:00",
				"Dentist");

		Appointment app3 = new Appointment("07/28/2016", "15:00", "16:00",
				"Doctor");

		Appointment app4 = new Appointment("07/30/2016", "17:00", "18:00",
				"Realtor");

		appointmentCalendar.addAppointment(app1);
		appointmentCalendar.addAppointment(app2);
		appointmentCalendar.addAppointment(app3);
		appointmentCalendar.addAppointment(app4);

		appointmentCalendar.getAppointmentListByDate("07/30/2016");

		appointmentCalendar.removeAppointment(app4);

		System.out.println();
		System.out.println("List after removing app4:");
		appointmentCalendar.getAppointmentListByDate("07/30/2016");

		appointmentCalendar.getAppointment(app1).setDescription(
				"Brian's 50th Birthday");

		System.out.println();
		System.out.println("List after changing the description of app1:");
		appointmentCalendar.getAppointmentListByDate("07/30/2016");

	}
}
