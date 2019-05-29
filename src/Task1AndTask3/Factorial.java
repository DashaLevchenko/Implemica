package Task1AndTask3;

import java.math.BigInteger;

/* Calculate factorial of the input number
 * 	Used the recursion math formula:
 *  	n! = n*(n-1)!
 *  	n0 = 1  
 */

public class Factorial {
	private static BigInteger factorialOfNumber; //factorial of the input number

	public static BigInteger factorial(BigInteger n) {	
		if(n == BigInteger.valueOf(0)) return factorialOfNumber.valueOf(1);
		factorialOfNumber = n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
		
		return factorialOfNumber;
	}
	
}
