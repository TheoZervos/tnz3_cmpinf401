/**
 * This is a child class of MenuItem
 * 
 * @author Theo Zervos
 * @since 10-03-2022
 */
public class Dessert extends MenuItem{

	/**
	 * This method creates an Dessert object
	 * 
	 * @param n This is the name of the Dessert object
	 * @param d This is the description of the Dessert object
	 * @param cal This is the calories of the Dessert object
	 * @param p This us the price of the Dessert object
	 */
	public Dessert(String n, String d, int cal, double p) {
		super(n, d, cal, p);
	}

}
