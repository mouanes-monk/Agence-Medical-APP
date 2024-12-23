package ClinicManagementApp;

import patient.Patient;

public class ClinicManagementApp {
	public static void main(String[] args) {
		
		   Patient patient = new Patient("Jojo", "123456789", "Somewhere", "20", "0");
	   
	        patient.showInfo();
	        System.out.println("Patient ID: " + patient.patid);
		
	}
	
}
