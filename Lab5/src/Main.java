//imports
import java.util.Random;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		//Creating objects
		Random randNumber = new Random();
		
		
		//Rolling dice
		while(true) {
			String rolls = JOptionPane.showInputDialog("ENTER THE AMOUNT OF TIMES TO ROLL THE DICE");
			int rollInt = Integer.parseInt(rolls);
			Dice.rollDice(rollInt, randNumber);
			
			//asking if roll again
			String again = JOptionPane.showInputDialog("ROLL AGAIN?\ny/n");
			
			if(again.equals("y")) {      //if "y" roll again
				continue;
			} else {                     //if anything but "y" end program
				JOptionPane.showMessageDialog(null, "BYE");
				break;
			}
		}
			
		
	}
}
