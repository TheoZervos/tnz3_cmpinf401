import javax.swing.JOptionPane;
import java.util.Random;

public class Lab7 {
	public static void main(String[] args) {
		
		//Initializing array
		String size = JOptionPane.showInputDialog(null, "Enter the size you want your Array to be");
		double[] arr = new double[Integer.parseInt(size)];
		
		//Creating random object
		Random rng = new Random();
		
		//assigning random values to each index in arr
		for(int i = 0; i < arr.length; i++) {
			double num = rng.nextInt(100000) * rng.nextDouble();
			num = (int)(num * 1000);
			num /= 1000;
			
			arr[i] = num;
		}
		
		
		//Displaying output
		String output = "Max Value: " + max(arr) + "\n"
				+ "Min Value: " + min(arr) + "\n"
				+ "Total Sum: " + sum(arr) + "\n"
				+ "Average: " + ave(arr);
		
		System.out.println("DEBUG");
		for(double num: arr) {
			System.out.print(num + ", ");
		}
		
		JOptionPane.showMessageDialog(null, output);
	}
	
	
	////METHODS
	
	//Finds and returns the maximum value in an array
	public static double max(double[] data) {
		
		double max = data[0];
		
		for(int i = 1; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		
		return max;
	}
	
	
	//Finds and returns the minimum value in an array
	public static double min(double[] data) {

		double min = data[0];

		for(int i = 1; i < data.length; i++) {
			if(data[i] < min) {
				min = data[i];
			}
		}

		return min;
	}
	
	
	//Adds all array items and returns the value
	public static double sum(double[] data) {
		
		double total = 0;
		
		for(double number: data) {
			total += number;
		}
		
		total = (int) (total * 1000);
		total /= 1000;
		
		return total;
	}
	
	
	//Averages all array items and returns the value
	public static double ave(double[] data) {
		
		double total = 0;
		
		for(double number: data) {
			total += number;
		}
		
		double avg = total / data.length;
		avg = (int)(avg * 1000);
		avg /= 1000;
		
		return avg;
	}
}
