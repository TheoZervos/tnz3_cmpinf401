package tnz3_Assignment1;

import javax.swing.JOptionPane;

public class Circles {
	
	public static void main(String[] args){
		
		//Asking for radius
		String radius = JOptionPane.showInputDialog("WELCOME TO THE CIRCLE CALCULATOR\nENTER A RADIUS");
		
		double r = Double.parseDouble(radius);
		
		//Calculating Perimeter
		double per = 2*Math.PI*r;
		per *= 100;
		per = Math.round(per);
		per /= 100;
		
		//Calculating Area
		double area = Math.PI*Math.pow(r, 2);
		area *= 100;
		area = Math.round(area);
		area /= 100;
		
		
		//Outputting answer
		String answer = "A circle with a radius " + r + " has a perimeter " + per + " and area " + area;
		
		JOptionPane.showMessageDialog(null, answer);
	}
}
