
public class Staff extends Person {
	//instance variables
	private String school;
	private double pay;
	
	//constructors
	public Staff(String n, String a, double p) {
		super.setAddress(a);
		super.setName(n);
		this.pay = p;
	}
	
	//getters
	public String getSchool() {
		return school;
	}
	
	public double getPay() {
		return pay;
	}
	
	
	//setters
	public void setSchool(String s) {
		this.school = s;
	}
	
	public void setPay(double p) {
		this.pay = p;
	}
	
	//toString override
	public String toString() {
		String output = "Staff\nName: " + super.getName() + "\nWorks at " + school + "\nSalary: " + pay + "\nLives at " + super.getAddress();
		return output;
	}
}
