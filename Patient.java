package entities;

public class Patient extends user {

    public Patient(String patientID, String patientPass, boolean firstLogin) {
        super(patientID, patientPass, firstLogin)
    }

    
    public String getPatientID() {
        return this.getID;
    }


    public void resetPassword() {
        this.firstLogin = true;
        this.patientPass = "defaultPassword";
    }

    @Override
    public String toString() {
        return "Patient {" +
                "patientID='" + patientID + '\'' +
                ", firstLogin=" + firstLogin +
                '}';
    }
}

