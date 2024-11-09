package entities;

public class Staff extends User{

    public Staff(String staffID, String staffPass, boolean firstLogin) {
        super(staffID, staffPass, firstLogin)
    }

    public String getStaffID() {
        return this.getID();
    }

    @Override
    public String toString() {
        return "Staff {" +
                "staffID='" + staffID + '\'' +
                ", firstLogin=" + firstLogin +
                '}';
    }
}
