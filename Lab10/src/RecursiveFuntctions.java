/**
 * Class RecursiveFunctions
 * @author Theo Zervos
 * 11/28/2022
 */
public class RecursiveFuntctions {
	
	public static void main(String[] args) {
		System.out.println("Testing sumOfDigits...");
		System.out.println(sumOfDigits(124));
		System.out.println();
		
		System.out.println("Testing printArrayElements...");
		int[] array = {10, 3, 3, 4, 4, 5};
		printArrayElements(array, 0);
		System.out.println();
		
		
		int[] newArr = {1, 2, 3};
		System.out.println("Testing printCombos...");
		printCombos(newArr,  "", 0, 2);
		
		
		test(1);
	}
	
	/**
	 * Method sum of Digits
	 * @param x an integer
	 * @return sum of all digits in a number
	 */
	public static int sumOfDigits(int x) {
		
		int sum = 0;
		
		//making x positive if x is negative
		if(x < 0) {
			x *= -1;
		}
		
		//while x > 0, recur
		if(x > 0) {
			sum += (x%10) + sumOfDigits(x/10);
		}
		
		
		return sum;
	}
	
	/**
	 * Method printArrayElements
	 * @param a an array of integers
	 * @param index an integer
	 */
	public static void printArrayElements(int a[], int index) {
		
		System.out.println(a[index]);
		index++;
		
		if(index < a.length) {
			printArrayElements(a, index);
		}
		
	}
	
	/**
	 * Method printCombos
	 * @param a an array of ints
	 * @param out a String
	 * @param k an int
	 */
	
	//a = {1, 2, 3}; startIndex = 0; k = 2;
	public static void printCombos(int[] a, String out, int startIndex,  int k) {

		
	}
	
	
	public static void test(int i) {
		if(i < 15) {
			test(i+1);
		}
		System.out.println(i);
	}
	
}
