/**
 * Class Menu
 * @author Theo Zervos
 * Created: 10/03/2022
 */

//Menu Class
public class Menu {

	//initializing variables
	private String name;
	private Entree entree;
	private Side side;
	private Salad salad;
	private Dessert dessert;

	//constructors
	public Menu(String name) {			//Menu with only a name
		this.name = name;
		this.entree = null;
		this.side = null;
		this.salad = null;
		this.dessert = null;
	}

	public Menu(String name, Entree entree) {			//Menu with name and main entree
		this.name = name;
		this.entree = entree;
		this.side = null;
		this.salad = null;
		this.dessert = null;
	}

	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {		//Menu with all food options
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.dessert = dessert;
		this.salad = salad;
	}

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
	public String getName() {
		return name;
	}

	public Entree getEntree() {

		if(entree == null) {
			return null;
		}

		return entree;
	}

	public Side getSide() {

		if(side == null) {
			return null;
		}

		return side;
	}

	public Salad getSalad() {

		if(salad == null) {
			return null;
		}

		return salad;
	}

	public Dessert getDessert() {

		if(dessert == null) {
			return null;
		}

		return dessert;
	}



	////Setters
	public void setName(String newName) {
		this.name = newName;
	}

	public void setEntree(Entree newEntree) {
		this.entree = newEntree;
	}

	public void setSide(Side newSide) {
		this.side = newSide;
	}

	public void setSalad(Salad newSalad) {
		this.salad = newSalad;
	}

	public void setDessert(Dessert newDessert) {
		this.dessert = newDessert;
	}

	//Overridden toString
	public String toString() {
		return name;
	}
}
