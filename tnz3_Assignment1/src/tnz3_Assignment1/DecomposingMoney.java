package tnz3_Assignment1;

import javax.swing.JOptionPane;

public class DecomposingMoney {
	
	public static void main(String[] args){
		
		//Asking user for dollar amount
		String balance = JOptionPane.showInputDialog("WELCOME TO THE DECOMPSING MONEY CALCULATOR\nENTER AN INTEGER DOLLAR AMOUNT FROM 1-9999");
		int bal = Integer.parseInt(balance);
		
		//finding amount of each dollar amount
		int buck = bal%10;
		bal /= 10;
		
		int saw = bal%10;
		bal /= 10;
		
		int ben = bal%10;
		bal /= 10;
		
		int grand = bal%10;
		bal /= 10;
		
		//Outputting answer
		String answer = grand + " grands\n" + ben + " Benjamins\n" + saw + " sawbucks\n" + buck + " bucks";
		
		JOptionPane.showMessageDialog(null, answer);
	}
}
