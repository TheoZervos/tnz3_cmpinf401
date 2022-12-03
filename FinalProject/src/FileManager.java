/*** Class FileManager
 * @author Theo Zervos
 * Created: 10/24/2022
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
/**
 * This class is used to manage menu files that are in the correct format
 * for this program
 * 
 * @author Theo Zervos
 *
 */
public class FileManager {


	/**
	 * This method reads from a given file in correct format and creates an ArrayList of Menu objects
	 * 
	 * @param fileName This is a String of the file directory
	 * @return ArrayList This returns the completed ArrayList of Menu objects as read from the given file
	 */

	public static ArrayList<MenuItem> readItems(String fileName){

		ArrayList<MenuItem> dishes = new ArrayList<MenuItem>();

		try {
			//creating objects
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			//looping until no more lines
			while((line = br.readLine()) != null) {

				//splitting the line and adding to array and creating MenuItem object
				String[] split = line.split("@@");

				//creating object
				String type = split[1];
				switch(type) {
				case("entree"):
					Entree entree = new Entree(split[0], split[2], Integer.parseInt(split[3]), Double.parseDouble(split[4]));
				dishes.add(entree);
				break;
				case("side"):
					Side side = new Side(split[0], split[2], Integer.parseInt(split[3]), Double.parseDouble(split[4]));
				dishes.add(side);
				break;
				case("salad"):
					Salad salad = new Salad(split[0], split[2], Integer.parseInt(split[3]), Double.parseDouble(split[4]));
				dishes.add(salad);
				break;
				case("dessert"):
					Dessert dessert = new Dessert(split[0], split[2], Integer.parseInt(split[3]), Double.parseDouble(split[4]));
				dishes.add(dessert);
				break;
				}
			}

			br.close();
			fr.close();

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return dishes;

	}


	/**
	 * This method writes the menus to a chosen file
	 * 
	 * @param fileName This is a String of the file directory name
	 * @param items This is an ArrayList of menu items
	 */

	public static void writeMenus(String fileName, ArrayList<Menu> menus) {

		try {

			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);

			//looping through all menus in menus
			for(int i = 0; i < menus.size(); i++) {

				////writing aspects of the menu
				bw.write(menus.get(i).getName());
				bw.newLine();
				bw.newLine();

				//entree
				bw.write(menus.get(i).getEntree().getName());
				bw.newLine();
				bw.write(menus.get(i).getEntree().getDescription());
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getEntree().getCalories()));
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getEntree().getPrice()));
				bw.newLine();
				bw.newLine();

				//side
				bw.write(menus.get(i).getSide().getName());
				bw.newLine();
				bw.write(menus.get(i).getSide().getDescription());
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getSide().getCalories()));
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getSide().getPrice()));
				bw.newLine();
				bw.newLine();

				//salad
				bw.write(menus.get(i).getSalad().getName());
				bw.newLine();
				bw.write(menus.get(i).getSalad().getDescription());
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getSalad().getCalories()));
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getSalad().getPrice()));
				bw.newLine();
				bw.newLine();

				//dessert
				bw.write(menus.get(i).getDessert().getName());
				bw.newLine();
				bw.write(menus.get(i).getDessert().getDescription());
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getDessert().getCalories()));
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getDessert().getPrice()));
				bw.newLine();
				bw.newLine();

				//total calories
				bw.write("Total Calories: " + menus.get(i).totalCalories());
				bw.newLine();

				//total price
				bw.write("Total Price: " + menus.get(i).totalPrice());
				bw.newLine();
				bw.newLine();
			}

			bw.close();
			fw.close();

		} catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}



	/////////OLD READ METHODS

	/*
	public static ArrayList<Entree> readEntrees(String fileName) {

		ArrayList<Entree> entrees = new ArrayList<>();

		try {
			//creating objects
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			//looping until no more lines
			while((line = br.readLine()) != null) {

				//splitting the line and adding to array and creating entree object
				String[] split = line.split("@@");
				Entree e = new Entree(split[0], split[1], Integer.parseInt(split[2]));

				//adding e to list of entrees
				entrees.add(e);

			}

			br.close();
			fr.close();

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		//returning final entrees list
		return entrees;
	}



	public static ArrayList<Side> readSides(String fileName){

		ArrayList<Side> sides = new ArrayList<>();

		try {

			//creating objects
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			//loops until no more lines
			while((line = br.readLine()) != null) {

				//splitting line and adding to array then creating side object
				String[] split = line.split("@@");
				Side s = new Side(split[0], split[1], Integer.parseInt(split[2]));

				//adding s to list of sides
				sides.add(s);
			}


			br.close();
			fr.close();

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		//returns completed sides list
		return sides;
	}



	public static ArrayList<Salad> readSalads(String fileName){

		ArrayList<Salad> salads = new ArrayList<>();

		try {

			//creating objects
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			//loops until theres no more lines
			while((line = br.readLine()) != null) {

				//splitting line and adding to array then creating salad object
				String[] split = line.split("@@");
				Salad s = new Salad(split[0], split[1], Integer.parseInt(split[2]));

				//adding s to list of salads
				salads.add(s);
			}

			fr.close();
			br.close();

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		//returning complete salads list
		return salads;
	}


	
	public static ArrayList<Dessert> readDesserts(String fileName){

		ArrayList<Dessert> desserts = new ArrayList<>();

		try {

			//creating objects
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;

			//loops until no more lines
			while((line = br.readLine()) != null) {

				//splitting line and adding to array and creating dessert object
				String[] split = line.split("@@");
				Dessert d = new Dessert(split[0], split[1], Integer.parseInt(split[2]));

				//adding d to list of deserts
				desserts.add(d);
			}

			br.close();
			fr.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		//returning complete desserts list
		return desserts;
	}
	 */
}
