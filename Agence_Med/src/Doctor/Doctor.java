package Doctor;

import java.util.List;

import Appointment.Appointment;

public class Doctor {
	String name;
	String specialization;
	int doctorId ;
	List<Appointment> appointments;
	Doctor(String name, String specialization, int doctorId){
		
	}
	void addAppointment(Appointment appointment) {
		
	}
	List<Appointment> getAppointments(){
		return appointments;
	}
}
