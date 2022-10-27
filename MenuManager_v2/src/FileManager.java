/**
 * Class FileManager
 * @author Theo Zervos
 * Created: 10/24/2022
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class FileManager {

	/**
	 * Method readEntrees
	 * @param fileName a String
	 * @return the completed entrees ArrayList
	 */

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


	/**
	 * Method readSides
	 * @param fileName a String
	 * @return the completed sides ArrayList
	 */
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


	/**
	 * Method readSalads
	 * @param fileName a String
	 * @return the completed salads ArrayList
	 */
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


	/**
	 * Method readDesserts
	 * @param fileName a String
	 * @return the completed desserts ArrayList
	 */
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
}
