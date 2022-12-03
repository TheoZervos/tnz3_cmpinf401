/**
 * This class is creates Menu objects which can contain
 * an Entree object, a Side object, a Salad object, and 
 * a Dessert object
 * 
 * @author Theo Zervos
 * @since 10-13-2022
 */

//Menu Class
public class Menu {

	//initializing variables
	private String name;
	private Entree entree;
	private Side side;
	private Salad salad;
	private Dessert dessert;

	/**
	 * This constructor creates a Menu object with only a name, all other
	 * variables are set to null
	 * 
	 * @param name This is a String for the name of the Menu
	 */
	public Menu(String name) {			//Menu with only a name
		this.name = name;
		this.entree = null;
		this.side = null;
		this.salad = null;
		this.dessert = null;
	}
	
	/**
	 * This constructor creates a menu object with just a name and Entree object,
	 * all other variables are set to null
	 * 
	 * @param name This is a String for the name of the Menu
	 * @param entree This is an Entree object for the entree of the Menu
	 */
	public Menu(String name, Entree entree) {			//Menu with name and main entree
		this.name = name;
		this.entree = entree;
		this.side = null;
		this.salad = null;
		this.dessert = null;
	}
	
	/**
	 * This constructor creates a menu object with a name, Entree object, Side object, Salad object,
	 * and dessert Object, no variables are null
	 * 
	 * @param name This is a String for the name of the Menu
	 * @param entree This is an Entree object for the entree of the Menu
	 * @param side This is a Side object for the side of the Menu
	 * @param salad This is a Salad object for the salad of the Menu
	 * @param dessert This is a Dessert object for the dessert of the Menu
	 */
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {		//Menu with all food options
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.dessert = dessert;
		this.salad = salad;
	}
	
	/**
	 * This method is used to add up the total calories from the entree, side, salad,
	 * and dessert of the Menu
	 * 
	 * @return int This returns the total calories from the entree, side, salad, and dessert
	 */
	//sums total calories from all included menu parts (all non-null options)
	public int totalCalories() {

		int total = 0;

		////adding calories to total if menu item exists

		if(entree != null) {    //entree calories
			total += entree.getCalories();
		}
		if(side != null) {      //side calories
			total += side.getCalories();
		}
		if(salad != null){      //salad calories
			total += salad.getCalories();
		}
		if(dessert != null) {   //dessert calories
			total += dessert.getCalories();
		}

		return total;
	}
	
	/**
	 * This method returns the total price of the menu from the entree, side, salad,
	 * and dessert
	 * 
	 * @return int This returns the total price value by adding up the price of the entree, side, salad, and dessert
	 */
 	//sums total price from all included menu parts (all non-null options)
	public int totalPrice() {

		int total = 0;

		////adding calories to total if menu item exists

		if(entree != null) {    //entree calories
			total += entree.getPrice();
		}
		if(side != null) {      //side calories
			total += side.getPrice();
		}
		if(salad != null){      //salad calories
			total += salad.getPrice();
		}
		if(dessert != null) {   //dessert calories
			total += dessert.getPrice();
		}

		return total;
	}
	
	/**
	 * This method build a comprehensive menu description
	 *
	 * @return String This returns the menu description by using the description of the entree, side, salad, and dessert
	 */
	//builds the description of the menu (all non-null options)
	public String description() {

		String desc = "";

		////Creating description in order : Entree, Side, Salad, Desert (if said variable is not null)
		//entree
		if(entree == null) {
			desc += "Entree: N/A\n";
		} else {
			desc += "Entree: " + entree.getName() + ". " + entree.getDescription() + "\n";
		}

		//side
		if(side == null) {
			desc += "Side: N/A\n";
		} else {
			desc += "Side: " + side.getName() + ". " + side.getDescription() + "\n";
		}

		//salad
		if(salad == null) {
			desc += "Salad: N/A\n";
		} else {
			desc += "Salad: " + salad.getName() + ". " + salad.getDescription() + "\n";
		}

		//dessert
		if(dessert == null) {
			desc += "Dessert: N/A";
		} else {
			desc += "Dessert: " + dessert.getName() + ". " + dessert.getDescription();
		}

		return desc;
	}


	
	////Getters
	/**
	 * This method returns the name of Menu
	 * 
	 * @return String This returns the name of the Menu
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This method returns the entree of Menu
	 * 
	 * @return Entree This returns the entree of the Menu
	 */
	public Entree getEntree() {

		if(entree == null) {
			return null;
		}

		return entree;
	}
	
	/**
	 * This method returns the side of Menu
	 * 
	 * @return Side This returns the side of the Menu
	 */
	public Side getSide() {

		if(side == null) {
			return null;
		}

		return side;
	}
	
	/**
	 * This method returns the salad of Menu
	 * 
	 * @return Salad This returns the salad of the Menu
	 */
	public Salad getSalad() {

		if(salad == null) {
			return null;
		}

		return salad;
	}

	/**
	 * This returns the dessert of Menu
	 * 
	 * @return Dessert This returns the dessert of the Menu
	 */
	public Dessert getDessert() {

		if(dessert == null) {
			return null;
		}

		return dessert;
	}



	////Setters
	/**
	 * This changes the name of the Menu
	 * 
	 * @param newName This is a String that will replace the current Menu name
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	
	/**
	 * This changes the entree of the Menu
	 * 
	 * @param newEntree This is a Entree object that will replace the current Menu entree
	 */
	public void setEntree(Entree newEntree) {
		this.entree = newEntree;
	}

	/**
	 * This changes the side of the Menu
	 * 
	 * @param newSide This is a Side object that will replace the current Menu side
	 */
	public void setSide(Side newSide) {
		this.side = newSide;
	}

	/**
	 * This changes the salad of the Menu
	 * 
	 * @param newSalad This is a Salad object that will replace the current Menu salad
	 */
	public void setSalad(Salad newSalad) {
		this.salad = newSalad;
	}

	/**
	 * This changes the dessert of the Menu
	 * 
	 * @param newDessert This is a Dessert object that will replace the current Menu dessert
	 */
	public void setDessert(Dessert newDessert) {
		this.dessert = newDessert;
	}

	//Overridden toString
	public String toString() {
		return name;
	}
}
