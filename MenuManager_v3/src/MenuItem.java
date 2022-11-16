
public class MenuItem {

	//instance variables
	private String name;
	private String description;
	private int calories;
	private double price;

	//constructors
	public MenuItem(String n, String d, int cal, double p) {
		this.name = n;
		this.description = d;
		this.calories = cal;
		this.price = p;
	}

	//getters
	public String getName() {
		return name;
	}

	public int getCalories() {
		return calories;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}


	//setters
	public void setName(String newName) {
		this.name = newName;
	}

	public void setDescription(String newDesc) {
		this.name = newDesc;
	}

	public void setCalories(int newCal) {
		this.calories = newCal;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	//Overidden toString
	public String toString() {
		return name;
	}
}
