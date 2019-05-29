package Task1AndTask3;

import java.math.BigInteger;

/* Calculate Catalan number for the input number
 * 	Used the recursion math formula:
 *  	Cn = 2n!/(n!*(n+1)!)
 */
class Catalan{
	private static int catalan;
	
	public static int catalan(int n) {
		if(n > 0) {
			BigInteger inputNumber = BigInteger.valueOf(n);				  //convert int type in BigIntager
			
			BigInteger factorial = Factorial.factorial(inputNumber);	  								//call factorial method for n
			BigInteger factorial2n = Factorial.factorial(inputNumber.multiply(BigInteger.valueOf(2)));  //call factorial method for 2n
			BigInteger factorialNplusOne = Factorial.factorial(inputNumber.add(BigInteger.valueOf(1))); //call factorial method for n+1
			BigInteger catalanOfN = factorial2n.divide(factorial.multiply(factorialNplusOne));			//  2n/(n*(n+1)
			
			catalan = catalanOfN.intValue();	//convert BigInteger in int					
				System.out.println(catalan);
			}
			
		return catalan;
		}
}
