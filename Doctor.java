package entities;

public class Doctor extends User {
    private String specialty;
    private List<String> patientIDs; // List of the IDs for patients

    public Doctor(String doctorID, String doctorPass, boolean firstLogin, String specialty, List<String> patientIDs) {
        super(doctorId, doctorPass, firstLogin)
        this.specialty = specialty;
        this.patientIDs = patientIDs;
    }

   
    public String this.getID() {
        return doctorID;
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
