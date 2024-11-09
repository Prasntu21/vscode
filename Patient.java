package entities;

public class Patient extends user {

    public Patient(String patientID, String patientPass, boolean firstLogin) {
        super(patientID, patientPass, firstLogin)
    }

    
    public String getPatientID() {
        return this.patientID;
    }

    public boolean validatePassword(String patientPass) {
        return this.patientPass.equals(patientPass);
    }

    public boolean isFirstLogin() {
        return this.firstLogin;
    }

    
    public void changePassword(String newPatientPass) {
        this.firstLogin = false;
        this.patientPass = newPatientPass;
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

