package tnz3_Assignment1;

import javax.swing.JOptionPane;

public class PythagoreanTheorem {

	public static void main(String[] args) {
		// Pyhtagorean theorem
		// Asking for inputs
		
		String sideA = JOptionPane.showInputDialog("WELCOME TO PYTHAGOREAN THEROM CALCULATOR\nENTER SIDE: a");
		String sideB = JOptionPane.showInputDialog("ENTER SIDE: B");
		
		//Changing input from String to double value
		double a = Double.parseDouble(sideA);
		double b = Double.parseDouble(sideB);
		
		//Calculating hypotonuse
		double hyp = Math.pow(a, 2) + Math.pow(b, 2);
		hyp = Math.sqrt(hyp);
		
		//Rounding hyp to the 3rd decimal place
		hyp *= 1000;
		hyp = Math.round(hyp);
		hyp /= 1000;
		
		//Outputting answer
		String answer = "THE HYPOTONUSE IS " + hyp;
		JOptionPane.showMessageDialog(null, answer);
	}

}
