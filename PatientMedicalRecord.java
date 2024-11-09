package entities;

import java.util.Date;

public class PatientMedicalRecord {
    private Patient patient; // Reference to the Patient entity for patient details
    private String medicalHistory;
    private String currentMedications;
    private String allergies;
    private String bloodType; // Added blood type
    private String pastDiagnosesAndTreatments; // Added past diagnoses and treatments
    private Date lastVisitDate;

    public PatientMedicalRecord(Patient patient, String medicalHistory, String currentMedications,
                                String allergies, String bloodType, String pastDiagnosesAndTreatments,
                                Date lastVisitDate) {
        this.patient = patient;
        this.medicalHistory = medicalHistory;
        this.currentMedications = currentMedications;
        this.allergies = allergies;
        this.bloodType = bloodType;
        this.pastDiagnosesAndTreatments = pastDiagnosesAndTreatments;
        this.lastVisitDate = lastVisitDate;
    }

    // Getters
    public Patient getPatient() {
        return this.patient;
    }

    public String getMedicalHistory() {
        return this.medicalHistory;
    }

    public String getCurrentMedications() {
        return this.currentMedications;
    }

    public String getAllergies() {
        return this.allergies;
    }

    public String getBloodType() {
        return this.bloodType;
    }

    public String getPastDiagnosesAndTreatments() {
        return this.pastDiagnosesAndTreatments;
    }

    public Date getLastVisitDate() {
        return this.lastVisitDate;
    }

    // Setters
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void setCurrentMedications(String currentMedications) {
        this.currentMedications = currentMedications;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setPastDiagnosesAndTreatments(String pastDiagnosesAndTreatments) {
        this.pastDiagnosesAndTreatments = pastDiagnosesAndTreatments;
    }

    public void setLastVisitDate(Date lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    @Override
    public String toString() {
        return "PatientMedicalRecord {" +
                "patient=" + patient +
                ", medicalHistory='" + medicalHistory + '\'' +
                ", currentMedications='" + currentMedications + '\'' +
                ", allergies='" + allergies + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", pastDiagnosesAndTreatments='" + pastDiagnosesAndTreatments + '\'' +
                ", lastVisitDate=" + lastVisitDate +
                '}';
    }
}
