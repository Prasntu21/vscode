package entities;

public abstract class Staff {
    private String staffID;
    private String staffPass;
    private boolean firstLogin;

    public Staff(String staffID, String staffPass, boolean firstLogin) {
        this.staffID = staffID;
        this.staffPass = staffPass;
        this.firstLogin = firstLogin;
    }

    // Getters
    public String getStaffID() {
        return this.staffID;
    }

    public boolean validatePassword(String staffPass) {
        return this.staffPass.equals(staffPass);
    }

    public boolean isFirstLogin() {
        return this.firstLogin;
    }

    // Setters
    public void changePassword(String newStaffPass) {
        this.firstLogin = false;
        this.staffPass = newStaffPass;
    }

    public void resetPassword() {
        this.firstLogin = true;
        this.staffPass = "defaultPassword";
    }

    @Override
    public String toString() {
        return "Staff {" +
                "staffID='" + staffID + '\'' +
                ", firstLogin=" + firstLogin +
                '}';
    }
}