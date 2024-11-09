package entities;

public abstract class Doctor {
    private String doctorID;
    private String doctorPass;
    private boolean firstLogin;
    private String specialty;
    private List<String> patientIDs; // List of the IDs for patients

    public Doctor(String doctorID, String doctorPass, boolean firstLogin, String specialty, List<String> patientIDs) {
        this.doctorID = doctorID;
        this.doctorPass = doctorPass;
        this.firstLogin = firstLogin;
        this.specialty = specialty;
        this.patientIDs = patientIDs;
    }

    // Getters
    public String getDoctorID() {
        return doctorID;
    }

    public boolean validatePassword(String doctorPass) {
        return this.doctorPass.equals(doctorPass);
    }

    public boolean isFirstLogin() {
        return firstLogin;
    }

    public String getSpecialty() {
        return specialty;
    }

    public List<String> getPatientIDs() {
        return patientIDs;
    }

    // Setters
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setPatientIDs(List<String> patientIDs) {
        this.patientIDs = patientIDs;
    }

    public void changePassword(String newDoctorPass) {
        this.firstLogin = false;
        this.doctorPass = newDoctorPass;
    }

    public void resetPassword() {
        this.firstLogin = true;
        this.doctorPass = "defaultPassword";
    }

    @Override
    public String toString() {
        return "Doctor {" +
                "doctorID='" + doctorID + '\'' +
                ", firstLogin=" + firstLogin +
                ", specialty='" + specialty + '\'' +
                ", patientIDs=" + patientIDs +
                '}';
    }
}
