package Task1AndTask3;

/*The number of regular bracket sequences with parentheses of the same type 
 * coincides with Catalan numbers
 */

class CorrectSequence{
	private static int output;  //output number

	public static int correctSequence() {
		output = Catalan.catalan(Input.inputNumber()); //reading data from console and calculate Catalan's number
		return output;
	}
}

public class Task1 {
	public static void main(String[] args) {
		CorrectSequence.correctSequence();
	}
}
