package entities;

public class Patient {
    private String patientID;
    private String patientPass;
    private boolean firstLogin;

    public Patient(String patientID, String patientPass, boolean firstLogin) {
        this.patientID = patientID;
        this.patientPass = patientPass;
        this.firstLogin = firstLogin;
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

