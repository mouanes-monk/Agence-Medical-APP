package patient;

import java.util.Random;

import MedicalRecord_Class.MRC;

public class Patient {
	/**
	 * Represents a patient in the clinic management system.
	 * Stores personal details and links to a medical record.
	 */
	String name;
	String numb;
	String gender;
	String adress;
	String yb;
	public String patid;
	MRC medicalrecord;
	
	Random rd=new Random(); 
	
	 public Patient(String name,String numb,String adress,String yb,String gender){
		 if (!gender.equals("0") && !gender.equals("1")) {
	            throw new IllegalArgumentException("Gender must be '0' (male) or '1' (female).");
	        }
		 this.name=name;
		 this.numb=numb;
		 this.adress=adress;
		 this.gender=gender;
		 this.yb=yb;
		 this.patid=IDgen();
		
	 }
	 
	    public String IDgen() {
	        /**
	         * Generates a readable ID in the following format:
	         * [gender][yearofbirth][random number padded to 4 digits]
	         * Example: 020000123
	         */
	        int randomNum = rd.nextInt(10000); // Random number between 0 and 9999
	        String randomNumPadded = String.format("%04d", randomNum); // Pad to 4 digits
	        return gender + yb + randomNumPadded;
	    }

	    public void showInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Phone Number: " + numb);
	        System.out.println("Address: " + adress);
	        System.out.println("Year of Birth: " + yb);
	    }
	
}
