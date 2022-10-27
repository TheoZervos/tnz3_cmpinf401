/**
 * Class Dessert
 * @author Theo Zervos
 * Created: 10/03/2022
 */

public class Dessert {

	//initializing variables
	private String name;
	private String description;
	private int calories;

	//constructor
	public Dessert(String name, String desc, int cal) {
		this.name = name;
		this.description = desc;
		this.calories = cal;
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
}
