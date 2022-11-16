import java.util.ArrayList;

/**
 * Class MenuManager
 * @author Theo Zervos
 * Created: 11/14/2022
 */

public class MenuManager {

	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;


	/**
	 * Constructor Method MenuManager
	 * @param dishesFile String of file directory name
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
	 * Method randomMenu
	 * @param name a String
	 * @return a completed random menu object
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
	 * Method minCalories
	 * @param name a String
	 * @return a Menu object of the least caloric menu
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
	 * Method maxCalories
	 * @param name a String
	 * @return a Menu object of the most caloric menu
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
	public ArrayList<Entree> getEntrees(){
		return entrees;
	}

	public ArrayList<Side> getSides(){
		return sides;
	}

	public ArrayList<Salad> getSalads(){
		return salads;
	}

	public ArrayList<Dessert> getDesserts(){
		return desserts;
	}


	//setters
	public void setEntrees(ArrayList<Entree> newEntrees){
		this.entrees = newEntrees;
	}

	public void getSides(ArrayList<Side> newSides){
		this.sides = newSides;
	}

	public void getSalads(ArrayList<Salad> newSalads){
		this.salads = newSalads;
	}

	public void getDesserts(ArrayList<Dessert> newDesserts){
		this.desserts = newDesserts;
	}
}
