
public abstract class Person {
	//instance variables
	private String name;
	private String address = "String";
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	//setters
	public void setName(String n) {
		this.name = n;
	}
	
	public void setAddress(String a) {
		this.address = a;
	}
}
