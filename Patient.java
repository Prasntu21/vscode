package entities;

public class Patient extends user {

    public Patient(String patientID, String patientPass, boolean firstLogin) {
        super(patientID, patientPass, firstLogin)
    }

    
    public String getPatientID() {
        return this.getID;
    }


    @Override
    public String toString() {
        return "Patient {" +
                "patientID='" + patientID + '\'' +
                ", firstLogin=" + firstLogin +
                '}';
    }
}

