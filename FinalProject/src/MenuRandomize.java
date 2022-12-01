/**
 * Class: MenuRandomize
 * @author Theo Zervos
 * Created: 10/24/2022
 */

import java.util.ArrayList;

public class MenuRandomize {

	//instance variables
	private ArrayList<Entree> entrees = new ArrayList<>();
	private ArrayList<Side> sides = new ArrayList<>();
	private ArrayList<Salad> salads = new ArrayList<>();
	private ArrayList<Dessert> desserts = new ArrayList<>();


	/**
	 * Constructor Method MenuRandomize
	 * @param entreeFile String of file name
	 * @param sideFile String of file name
	 * @param saladFile String of file name
	 * @param dessertFile String of file name
	 */
	
	/**OLD RANDOMIZE FUNCTION
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {

		this.entrees = FileManager.readEntrees(entreeFile);
		this.sides = FileManager.readSides(sideFile);
		this.salads = FileManager.readSalads(saladFile);
		this.desserts = FileManager.readDesserts(dessertFile);
	}
	*/
	/**
	 * Method randomMenu
	 * @return a complete randomized menu with null name
	 */
	public Menu randomMenu() {

		//Creating random numbers for picking random menu items: 1 - entree; 2 - side; 3 - salad; 4 - dessert;
		int rand1 = (int) (Math.random() * entrees.size());
		int rand2 = (int) (Math.random() * sides.size());
		int rand3 = (int) (Math.random() * salads.size());
		int rand4 = (int) (Math.random() * desserts.size());

		//using random numbers to select from arrays and creating menu object with null name
		Menu rMenu = new Menu(null, entrees.get(rand1), sides.get(rand2), salads.get(rand3), desserts.get(rand4));

		//completed random menu
		return rMenu;
	}


	////Getter Methods
	public ArrayList<Entree> getEntrees(){
		return entrees;
	}

	public ArrayList<Entree> getSides(){
		return entrees;
	}

	public ArrayList<Entree> getSalads(){
		return entrees;
	}

	public ArrayList<Entree> getDesserts(){
		return entrees;
	}
}
