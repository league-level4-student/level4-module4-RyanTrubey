package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();

	public void assignPatientsToDoctors(){
		int i = 0;
		for(int p = 0; p < patients.size(); p++) {
			try {
				doctors.get(i).assignPatient(patients.get(p));
			} catch (DoctorFullException e) {
				i++;
				p--;
			}
		}
	}
	
	public void addDoctor(Doctor docter) {
		doctors.add(docter);
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}
}
