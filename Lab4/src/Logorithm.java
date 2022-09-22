import javax.swing.JOptionPane;

public class Logorithm {

	public static void main(String[] args) {
		
		//initializing variables
		String log = "";
		String base = "";
		boolean valid = false;
		int answer = 0;
		
		////Asking for user input
		//Log
		while(!valid) {
			log = JOptionPane.showInputDialog("~~~WELCOME TO THE LOGORITHM CALCULATOR~~~\nEnter a value greater than 0 for the value x");
			
			if((Integer.parseInt(log)) > 0) {  //checking validity of user input number
				valid = true;
			} else {
				JOptionPane.showMessageDialog(null, "ERROR: INPUT IS INVALID PLEASE ENTER A VALUE GREATER THAN 0");
			}
		}
		
		System.out.println(log);
		int x = Integer.parseInt(log);
		
		valid = false;
		
		//Base
		while(!valid) {
			base = JOptionPane.showInputDialog("Enter a value greater than 1 for the log base");
			
			if((Integer.parseInt(base) > 1)) {   //Checking validity of user input
				valid = true;
			} else {
				JOptionPane.showMessageDialog(null, "ERROR: INPUT IS INVALID PLEASE ENTER A VALUE GREATER THAN 1");
			}
		}
		
		int b = Integer.parseInt(base);
		
		//Finding the value of the logarithm
		while(x >= b) {
			x /= b;
			answer++;
		}
		
		//Displaying answer output
		JOptionPane.showMessageDialog(null, "In the equation: \nfloor[log_(" + base + ") " + log + "] = y\ny = " + answer);  //Giving exact answer

	}

}

