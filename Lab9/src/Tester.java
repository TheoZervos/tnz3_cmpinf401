
public class Tester {

	public static void main(String[] args) {
		
		////TESTING CIRCLE HEIRARCHY
		System.out.println("\n**********TESTING CIRCLE HEIRARCHY**********\n");
		
		//creating objects
		Circle circle = new Circle(7.5, "Blue");
		Circle cylinder = new Cylinder(7.5, 3.9, "Purple");
		
		//printing information
		System.out.println(circle);
		System.out.println();
		System.out.println(cylinder);
		
		////TESTING PERSON HEIRARCHY
		System.out.println("\n**********TESTING PERSON HEIRARCHY**********\n");
		
		//creating objects
		Staff juan = new Staff("Juan", "611 Pop Blvd", 280);
		juan.setSchool("Georgia Elementary");
		Person tom = new Student("Tom", "314 Cherry St", "Computer Science", 3, 12909.45);
		
		//printing to String
		System.out.println(juan);
		System.out.println();
		System.out.println(tom);
	}

}
