/**
 * The MenuItem class is the parent class of the 
 * Entree, Dessert, Side, and Salad classes
 * 
 * @author Theo Zervos
 * @since 12-3-2022
 */
public class MenuItem {

	//instance variables
	private String name;
	private String description;
	private int calories;
	private double price;

	/**
	 * The MenuItem constructor method creates a new MenuItem given
	 * the following parameters
	 * 
	 * @param n This is the name of the MenuItem
	 * @param d This is the description of the MenuItem
	 * @param cal This is the calories of the MenuItem
	 * @param p This is the price of the MenuItem
	 */
	public MenuItem(String n, String d, int cal, double p) {
		this.name = n;
		this.description = d;
		this.calories = cal;
		this.price = p;
	}

	//getters
	/**
	 * Gets and returns the name of the MenuItem
	 * @return String This returns the name of the MenuItem
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets and return the calories of MenuItem
	 * @return int This returns the calories of the MenuItem
	 */
	public int getCalories() {
		return calories;
	}
	
	/**
	 * Gets and returns the description of the MenuItem
	 * @return String This returns the description of the MenuItem
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Gets and returns the price of the MenuItem
	 * @return double This returns the price of the MenuItem
	 */
	public double getPrice() {
		return price;
	}


	//setters
	/**
	 * This changes the name of the MenuItem
	 * @param newName This is the name to replace the current MenuItem name
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	
	/**
	 * This changes the description of the MenuItem
	 * @param newDesc This is the description to replace the current MenuItem description
	 */
	public void setDescription(String newDesc) {
		this.name = newDesc;
	}

	/**
	 * This changes the calories of the MenuItem
	 * @param newCal This is the calories to replace the current MenuItem calories
	 */
	public void setCalories(int newCal) {
		this.calories = newCal;
	}
	
	/**
	 * This changes the price of the MenuItem
	 * @param newPrice This is the price to replace the current MenuItem price
	 */
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	//Overidden toString
	public String toString() {
		return name;
	}
}
