/**
 * Class Side
 * @author Theo Zervos
 * Created: 10/03/2022
 */

public class Side {
	
	//initializing variables
	String name;
	String description;
	int calories;
	
	//constructor
	public Side(String name, String desc, int cal) {
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
