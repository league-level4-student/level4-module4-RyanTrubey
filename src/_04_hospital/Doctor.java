package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	private boolean performsSurgery;
	private boolean makesHouseCalls;
	private ArrayList<Patient> patients = new ArrayList<Patient>();

	public Doctor() {
		performsSurgery = false;
		makesHouseCalls = false;
	}

	public void assignPatient(Patient p) throws DoctorFullException{
		if (patients.size() < 3) {
			patients.add(p);
		} else {
			throw new DoctorFullException();
		}
	}
	
	public void doMedicine() {
		for(Patient p : patients) {
			p.setFeelsCaredFor(true);
		}
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public boolean performsSurgery() {
		return performsSurgery;
	}

	public boolean makesHouseCalls() {
		return makesHouseCalls;
	}

	public void setPerformsSurgery(boolean b) {
		performsSurgery = b;
	}

	public void setMakesHouseCalls(boolean b) {
		makesHouseCalls = b;
	}

}
