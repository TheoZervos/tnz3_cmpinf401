import java.util.ArrayList;

/**
 * This class is used to manage Menus and MenuItems
 * @author Theo Zervos
 * @since 11-14-2022
 */

public class MenuManager {

	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;


	/**
	 * This is the constructor method of MenuManager that uses a file in correct
	 * format to add build the ArrayLists for Entrees, Sides, Salads, and Desserts
	 * 
	 * @param dishesFile This is a String of the chosen file directory
	 */
	public MenuManager(String dishesFile) {

		//initializing ArrayLists
		entrees = new ArrayList<Entree>();
		sides = new ArrayList<Side>();
		salads = new ArrayList<Salad>();
		desserts = new ArrayList<Dessert>();

		//initializing array list from dishesFile
		ArrayList<MenuItem> items = FileManager.readItems(dishesFile);

		//adding items to correct ArrayList
		for(int i = 0; i < items.size(); i++) {

			if(items.get(i) instanceof Entree) {
				entrees.add((Entree) items.get(i));
			}

			if(items.get(i) instanceof Side) {
				sides.add((Side) items.get(i));
			}

			if(items.get(i) instanceof Salad) {
				salads.add((Salad) items.get(i));
			}

			if(items.get(i) instanceof Dessert) {
				desserts.add((Dessert) items.get(i));
			}
		}
	}

	/**
	 * This method creates a random menu object using random entrees, sides,
	 * salads, and desserts in the MenuManager object
	 * 
	 * @param name This is a String that will be the name of the Menu object created
	 * @return Menu This returns a completed random menu object
	 */
	public Menu randomMenu(String name) {

		int rand1 = (int) (Math.random() * entrees.size());
		int rand2 = (int) (Math.random() * sides.size());
		int rand3 = (int) (Math.random() * salads.size());
		int rand4 = (int) (Math.random() * desserts.size());

		//using random numbers to select from arrays and creating menu object with null name
		Menu rMenu = new Menu(name, entrees.get(rand1), sides.get(rand2), salads.get(rand3), desserts.get(rand4));

		//completed random menu
		return rMenu;
	}

	/**
	 * This method returns the lowest possible calorie menu using the entrees, sides, salads,
	 * and desserts in the MenuManager object
	 * 
	 * @param name This is a String that will become the name of the Menu object created
	 * @return Menu This returns a Menu object of the lowest possible calories
	 */
	public Menu minCalories(String name) {

		//initializing
		Entree lowEntree = entrees.get(0);
		Side lowSide = sides.get(0);
		Salad lowSalad = salads.get(0);
		Dessert lowDessert = desserts.get(0);

		//finding lowest calorie entree
		for(int i = 1; i < entrees.size(); i++) {
			if(entrees.get(i).getCalories() < lowEntree.getCalories()) {
				lowEntree = entrees.get(i);
			}
		}

		//finding lowest calorie side
		for(int i = 1; i < sides.size(); i++) {
			if(sides.get(i).getCalories() < lowSide.getCalories()) {
				lowSide = sides.get(i);
			}
		}

		//finding lowest calorie salad
		for(int i = 1; i < salads.size(); i++) {
			if(salads.get(i).getCalories() < lowSalad.getCalories()) {
				lowSalad = salads.get(i);
			}
		}

		//finding lowest calorie dessert
		for(int i = 1; i < desserts.size(); i++) {
			if(desserts.get(i).getCalories() < lowDessert.getCalories()) {
				lowDessert = desserts.get(i);
			}
		}

		Menu lowMenu = new Menu(name, lowEntree, lowSide, lowSalad, lowDessert);

		return lowMenu;
	}

	/**
	 * This method returns the highest possible calorie menu using the entrees, sides, salads,
	 * and desserts in the MenuManager object
	 * 
	 * @param name This is a String that will become the name of the Menu object created
	 * @return Menu This returns a Menu object of the highest possible calories
	 */
	public Menu maxCalories(String name) {

		//initializing
		Entree maxEntree = entrees.get(0);
		Side maxSide = sides.get(0);
		Salad maxSalad = salads.get(0);
		Dessert maxDessert = desserts.get(0);

		//finding lowest calorie entree
		for(int i = 1; i < entrees.size(); i++) {
			if(entrees.get(i).getCalories() > maxEntree.getCalories()) {
				maxEntree = entrees.get(i);
			}
		}

		//finding lowest calorie side
		for(int i = 1; i < sides.size(); i++) {
			if(sides.get(i).getCalories() > maxSide.getCalories()) {
				maxSide = sides.get(i);
			}
		}

		//finding lowest calorie salad
		for(int i = 1; i < salads.size(); i++) {
			if(salads.get(i).getCalories() > maxSalad.getCalories()) {
				maxSalad = salads.get(i);
			}
		}

		//finding lowest calorie dessert
		for(int i = 1; i < desserts.size(); i++) {
			if(desserts.get(i).getCalories() > maxDessert.getCalories()) {
				maxDessert = desserts.get(i);
			}
		}

		Menu maxMenu = new Menu(name, maxEntree, maxSide, maxSalad, maxDessert);

		return maxMenu;
	}


	//getters
	/**
	 * This returns the entrees in the MenuManager
	 * 
	 * @return ArrayList This returns an ArrayList of Entrees
	 */
	public ArrayList<Entree> getEntrees(){
		return entrees;
	}
	
	/**
	 * This returns the sides in the MenuManager
	 * 
	 * @return ArrayList This returns an ArrayList of Sides
	 */
	public ArrayList<Side> getSides(){
		return sides;
	}

	/**
	 * This returns the salads in the MenuManager
	 * 
	 * @return ArrayList This returns an ArrayList of Salads
	 */
	public ArrayList<Salad> getSalads(){
		return salads;
	}

	/**
	 * This returns the desserts in the MenuManager
	 * 
	 * @return ArrayList This returns an ArrayList of Desserts
	 */
	public ArrayList<Dessert> getDesserts(){
		return desserts;
	}
	
	


	//setters
	/**
	 * Replaces the current entrees with new entrees
	 * 
	 * @param newEntrees This is the new ArrayList of entrees for the MenuManager
	 */
	public void setEntrees(ArrayList<Entree> newEntrees){
		this.entrees = newEntrees;
	}

	/**
	 * Replaces the current sides with new sides
	 * 
	 * @param newEntrees This is the new ArrayList of sides for the MenuManager
	 */
	public void getSides(ArrayList<Side> newSides){
		this.sides = newSides;
	}

	/**
	 * Replaces the current salads with new salads
	 * 
	 * @param newEntrees This is the new ArrayList of salads for the MenuManager
	 */
	public void getSalads(ArrayList<Salad> newSalads){
		this.salads = newSalads;
	}

	/**
	 * Replaces the current desserts with new desserts
	 * 
	 * @param newEntrees This is the new ArrayList of desserts for the MenuManager
	 */
	public void getDesserts(ArrayList<Dessert> newDesserts){
		this.desserts = newDesserts;
	}
}
