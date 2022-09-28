//imports
import java.util.Random;
import javax.swing.JOptionPane;

public class Dice {
	
	//Dice Constructor
	public static void rollDice(int r, Random randNum) {
		
		//initializing counters
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		int eleven = 0;
		int twelve = 0;
		
		//initializing dice
		int die1 = 0;
		int die2 = 0;
		
		//rolling r times
		for(int i = 0; i < r; i++) {
			die1 = randNum.nextInt(0,6) + 1;
			die2 = randNum.nextInt(0,6) + 1;
			
			int roll = die1 + die2;
			
			//adding to roll counters
			switch(roll) {
				
				case(2):
					two++;
					break;
					
				case(3):
					three++;
					break;
					
				case(4):
					four++;
					break;
					
				case(5):
					five++;
					break;
					
				case(6):
					six++;
					break;
					
				case(7):
					seven++;
					break;
					
				case(8):
					eight++;
					break;
					
				case(9):
					nine++;
					break;
					
				case(10):
					ten++;
					break;
					
				case(11):
					eleven++;
					break;
					
				case(12):
					twelve++;
					break;
			}
				
		}
		
		//displaying output
		JOptionPane.showMessageDialog(null,
										"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
										"\n2                                        " + two + "/" + r +
										"\n3                                        " + three + "/" + r +
										"\n4                                        " + four + "/" + r +
										"\n5                                        " + five + "/" + r +
										"\n6                                        " + six + "/" + r +
										"\n7                                        " + seven + "/" + r +
										"\n8                                        " + eight + "/" + r +
										"\n9                                        " + nine + "/" + r +
										"\n10                                      " + ten + "/" + r +
										"\n11                                      " + eleven + "/" + r +
										"\n12                                      " + twelve + "/" + r +
										"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}
}
