package ramesh;
class WebApplication {
	String role;
	 int experience;
	 public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	void dev() {
		 
		System.out.println("Desktop Application");
	}
}

class AndroidApp extends WebApplication {
	void hi() {
		System.out.println("Google Playstore");
	}
	void newjoin() {
		System.out.println("Yes, ganesh is newly joined");
	}
}

class EnterpriseApplication extends AndroidApp {
	public static void main(String args[]) {
		System.out.println("Hello");
	}
}

 class Child {
	public static void main(String args[]) {
       EnterpriseApplication emp = new EnterpriseApplication();
       
		emp.dev();
		emp.setRole("Adobe Acrobat");
	    emp.setExperience(5);
		System.out.println(emp.getRole());
		System.out.println(emp.getExperience());
		emp.hi();
		emp.newjoin();
		
		
		
	}

}

