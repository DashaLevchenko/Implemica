package Task1AndTask3;

import java.math.BigInteger;
import java.util.ArrayList;

class SumOfFactorial {
	private static int answer;  //the sum of the digits in the number 
	
/* Write each digit of the number in the list
 * Use while loop for separate the digit from the end and write to the list
 */
	private static ArrayList<Integer> arrayOfAllNumbers(BigInteger factorial) {
		BigInteger leftPartNumber = factorial;	//number without last digit
		BigInteger rightPartNumber;				//temporary variable for digit
		ArrayList <Integer> listOfNumbers = new ArrayList<Integer>(); //List's object with Integer

		/* compare number, if residual number more then 0 return 1 and loop is working
		*	if residual number less then 0 or equals 0 return -1 and loop is end
		*/
		while(leftPartNumber.compareTo(BigInteger.valueOf(0)) == 1 ) { 
			rightPartNumber = factorial.mod(BigInteger.valueOf(10));	//separates the last number by dividing with the remainder
			leftPartNumber = factorial.divide(BigInteger.valueOf(10));	//return number without last digit
			factorial = leftPartNumber;
			listOfNumbers.add(rightPartNumber.intValue());				//write to the list
		}
		
		return listOfNumbers;	//return list with all digits of factorial number
	}

/* Iterating over the list and summarizing each number
 * 	Use for loop for Iterating over the list
 */
	public static int answer(int n) {
		BigInteger inputNumber = BigInteger.valueOf(n);				  //convert int type in BigIntager
		BigInteger factorial = Factorial.factorial(inputNumber);	  //call factorial method
		ArrayList<Integer> allNumbers = arrayOfAllNumbers(factorial); //write down digits of number to the list			
	
		for(int i = 0; i < allNumbers.size(); i++) {
			answer += allNumbers.get(i);	//get a number from list and plus previous
		}
		System.out.println(answer);		//output to console 
	
		return answer;
	}	
}

public class Task3 {
	public static void main(String[] args) {
//		int n = 100;
		SumOfFactorial.answer(Input.inputNumber());
	}
}
