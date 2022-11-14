
public class Student extends Person{
	//instance variable
	String program;
	int year;
	double fee;
	
	//constructors
	public Student(String n, String a, String p, int y, double f) {
		super.setName(n);
		super.setAddress(a);
		this.program = p;
		this.fee = f;
		this.year = y;
	}
	
	//getters
	public String getProgram() {
		return program;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getFee() {
		return fee;
	}
	
	
	//setters
	public void setProgram(String p) {
		this.program = p;
	}
	
	public void setYear(int y) {
		this.year = y;
	}
	
	public void setFee(double f) {
		this.fee = f;
	}
	
	
	//toString override
	public String toString() {
		String output = "Student\nName: " + super.getName() + "\nIn the " + program + " program\nFee: " + fee + "\nLives at " + super.getAddress();
		
		return output;
	}
}
