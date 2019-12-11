package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();

	public void assignPatientsToDoctors() {
		for(Patient p : patients) {
			for(Doctor d : doctors) {
				if(d.getPatients().size() < 3) {
					try {
						d.assignPatient(p);
					} catch (DoctorFullException e) {
					}
				}
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
