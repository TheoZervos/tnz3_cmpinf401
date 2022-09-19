import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		
		//Asking for and storing user input
		
		String input = JOptionPane.showInputDialog("ENTER UNITS TO CONVERT");
		
		if(input.indexOf(" ") == -1) {
			JOptionPane.showMessageDialog(null, "ERROR: " + input + " IS AN INVALID INPUT");
		}
		
		int space = input.indexOf(" ");
		
		double value = Double.parseDouble(input.substring(0, space));
		String unit = input.substring(space + 1);
		
		//converting units
		
		String converted = convert(value, unit);
		
		
		//outputting conversion
		if(converted.equals("invalid")) {
			JOptionPane.showMessageDialog(null, "ERROR: " + input + " IS AN INVALID INPUT!");
		} else {
			JOptionPane.showMessageDialog(null, input + " = " + converted);
		}

	}
	
	public static String convert(double n, String u) {  //double n = the value String u = the units
		
		if(u.equalsIgnoreCase("cm")) {      ///cm to inches
			return n * 2.54 + " in";
		} 
		else if(u.equalsIgnoreCase("in")) { ///inches to cm
			return n * 0.394 + " cm";
		} 
		else if(u.equalsIgnoreCase("m")) {  ///meters to yds
			return n * 1.094 + " yd";
		}
		else if(u.equalsIgnoreCase("yd")) { ///yds to meters
			return n * 0.914 + " m";
		}
		else if(u.equalsIgnoreCase("oz")) { ///oz to grams
			return n * 28.35 + " gm";
		}
		else if(u.equalsIgnoreCase("gm")) { ///grams to oz
			return n * 0.035 + " oz";
		}
		else if(u.equalsIgnoreCase("lb")) { ///pounds to kilos
			return n * 0.454 + " kg";
		}
		else if(u.equalsIgnoreCase("kg")) { ///kilos to pounds
			return n * 2.205 + " oz";
		}
		else {                              ///invalid input
			return "invalid";
		}
	}

}
