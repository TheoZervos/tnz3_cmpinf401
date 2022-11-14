/**
 * Class Menu Test
 * @author theoz
 * Created: 10/04/2022
 *
 */
import java.util.ArrayList;

public class MenuTest {

	public static void main(String[] args) {
		
		
		ArrayList<MenuItem> tires = FileManager.readItems("data\\dishes.txt");
		
		System.out.println(tires.size());
		
		for(int i = 0; i < tires.size(); i++) {
			System.out.println(tires.get(i));
		}
		
		/*
		///Initializing all non menu objects

		Entree steak = new Entree("Steak", "A nice, tender sirloin steak seasoned in our chef's seasoning, cooked to your liking.", 560, 24.99);

		Entree scallops = new Entree("Scallops", "Fresh, savory scallops prepared by our world class chef, served straight to you.", 410, 15.99);

		Side fries = new Side("French Fries", "Fresh cut fries made with American grown Idaho potatoes, and lightly salted.", 570, 1.99);

		Side greenBeans = new Side("Green Beans", "Fresh picked green beans sourced from the local agriculture.", 120, 2.49);

		Salad ceasar = new Salad("Chicken Ceasar Salad", "Fresh lettuce, grated parmesean, grilled chicken, and daily baked crutons, topped with a "
				+ "home made ceasar dressing and grated parmesean.", 450, 7.99);

		Salad house = new Salad("House Salad", "Our house salad is made with fresh iceberg lettuce, carrots, tomatoes and olives, topped with your dressing choice.", 200, 5.69);

		Dessert cheesecake = new Dessert("Cheesecake", "Cheesecake prepared by our finest chef, topped with a chocolate drizzle.", 670, 6.99);

		Dessert fruit = new Dessert("Assorted Fruits", "An assortment of fresh watermellon, grapes, canteloupe, and melon balls served with a side of honey.", 120, 3.89);


		///Initializing menu objects
		Menu georgias = new Menu("Georgia's Kitchen", scallops);
		Menu local = new Menu("Local Love", steak, greenBeans, house, fruit);


		////Testing menu
		System.out.println("**Testing Menu**");

		//testing description, getName, and total calories
		System.out.println(georgias.getName());
		System.out.println(georgias.description());
		System.out.println("Total Calories: " + georgias.totalCalories() + "\n");

		System.out.println(local.getName());
		System.out.println(local.description());
		System.out.println("Total Calories: " + local.totalCalories() + "\n");

		//testing getters
		System.out.println("**Testing Menu getters**");
		System.out.println(local.getEntree().getName());
		System.out.println(local.getSide().getName());
		System.out.println(local.getSalad().getName());
		System.out.println(local.getDesert().getName());
		System.out.println();		

		//testing setters
		System.out.println("**Testing Menu Setters**");
		local.setEntree(scallops);
		local.setSide(fries);
		local.setSalad(ceasar);
		local.setDesert(cheesecake);

		System.out.println(local.getEntree().getName());
		System.out.println(local.getSide().getName());
		System.out.println(local.getSalad().getName());
		System.out.println(local.getDesert().getName());
		System.out.println();
		**/	
	}

}
