package entities;

public abstract class User {
	private String ID;
	private String Pass;
	private boolean firstLogin;
	
	public User(String ID, String Pass, boolean firstLogin) {
		this.ID = ID;
		this.Pass = Pass;
		this.firstLogin = firstLogin;
	}
	
	public String getUserID() {
		return this.ID;
	}
	
	public boolean validatePassword(String Pass) {
		if(this.Pass.equals(Pass)) return true;
		return false;
	}
	
	public boolean isFirstLogin() {
		return this.firstLogin;
	}
	
	public void changePassword(String newUserPass) {
		this.firstLogin = false;
		this.Pass = newPass;
	}
	
	public void resetPassword() {
		this.firstLogin = true;
		this.Pass = "password";
	}
}
