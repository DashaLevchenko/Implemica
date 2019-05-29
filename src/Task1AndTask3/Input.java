package Task1AndTask3;


import java.util.Dictionary;
import java.util.Scanner;

public class Input {
	private static int input;  //input number
/* Method for reading data from console
 */
	public static int inputNumber() {
		System.out.print("Enter number N = ");
		Scanner inputNumber = new Scanner(System.in);	//Create object of Scanner for read value
		
		// if number is integer
		try {
			input = inputNumber.nextInt();  //save integer in variable
			//if number is negative
			if(input < 0) {
				System.out.println("Enter non-negative integer, please:");
				return inputNumber();
			}
		} 
		// if number isn't integer
		catch (Exception e) {
			System.out.println("Enter non-negative integer, please:");
			return inputNumber();
		}
		
		return input;
	}

}
