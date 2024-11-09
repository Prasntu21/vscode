package entities;

public class PrescribedMedicine {
    private String medicineID;
    private String patientID;
    private String medicineName;
    private String dosage;
    private String administrationRoute;
    private Date prescriptionDate;
    private Date endDate;
    private String prescriptionStatus; // New attribute to track prescription status

    public PrescribedMedicine(String medicineID, String patientID, String medicineName, 
                              String dosage, String administrationRoute, 
                              Date prescriptionDate, Date endDate, String prescriptionStatus) {
        this.medicineID = medicineID;
        this.patientID = patientID;
        this.medicineName = medicineName;
        this.dosage = dosage;
        this.administrationRoute = administrationRoute;
        this.prescriptionDate = prescriptionDate;
        this.endDate = endDate;
        this.prescriptionStatus = prescriptionStatus;
    }

    // Getters
    public String getMedicineID() {
        return medicineID;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getDosage() {
        return dosage;
    }

    public String getAdministrationRoute() {
        return administrationRoute;
    }

    public Date getPrescriptionDate() {
        return prescriptionDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getPrescriptionStatus() {
        return prescriptionStatus;
    }

    // Setters
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void setAdministrationRoute(String administrationRoute) {
        this.administrationRoute = administrationRoute;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setPrescriptionStatus(String prescriptionStatus) {
        this.prescriptionStatus = prescriptionStatus;
    }

    @Override
    public String toString() {
        return "PrescribedMedicine {" +
                "medicineID='" + medicineID + '\'' +
                ", patientID='" + patientID + '\'' +
                ", medicineName='" + medicineName + '\'' +
                ", dosage='" + dosage + '\'' +
                ", administrationRoute='" + administrationRoute + '\'' +
                ", prescriptionDate=" + prescriptionDate +
                ", endDate=" + endDate +
                ", prescriptionStatus='" + prescriptionStatus + '\'' +
                '}';
    }
}
