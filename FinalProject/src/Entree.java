/**
 * This class is the child class of MenuItem
 * @author Theo Zervos
 * @since 10-03-2022
 */

public class Entree extends MenuItem{

	/**
	 * This method creates an Entree object
	 * 
	 * @param n This is the name of the Entree object
	 * @param d This is the description of the Entree object
	 * @param cal This is the calories of the Entree object
	 * @param p This us the price of the Entree object
	 */
	public Entree(String n, String d, int cal, double p) {
		super(n, d, cal, p);
	}
}
