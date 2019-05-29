package task2;

import java.util.Scanner;

public class Input {
		
//	Enter number of test and number of cities 
	public static Tests inputTests() {
		Tests tests = new Tests();
		Scanner input = new Scanner(System.in);
		try {
			int s = input.nextInt();
			if(s <= 10) tests.setS(s);  //set number of test
			else {
				System.out.println("You used limit tests, you can only use 10");
				tests.setS(10);
			}
			int n = input.nextInt();
			if (n <= 10_000) tests.setN(n); //set number of city
			else {
				System.out.println("You used limit cities, you can only use 10 000");
				tests.setN(10_000);
			}
		} catch (Exception e) {
			System.out.println("Enter possitive integer"); // If entered non positive number
		}

		return tests;
	}
	
//	Set Citie's object. Enter name of city and number of city's neighbors
	public static Cities inputCities() {
		Scanner c = new Scanner(System.in);
		Cities city = new Cities();  //create City's object
		city.setName(c.next()); //Set Name of City
		
		try {
			city.setP(c.nextInt());  //Set number of neighbors
		} catch (Exception e) {
			System.out.println("Enter possitive integer"); // If entered non positive number
		}		
		
		return city; //return city's object
	}
	
//	Set of Way's object. Enter id of city and cost 
	public static Ways inputWays() {
		Ways ways = new Ways();
		Scanner s = new Scanner(System.in); 
		String inputS = s.nextLine(); //read line of input data
		try {
			String [] o = inputS.split(" "); //	divide numbers
			Integer [] n = new Integer[2]; // create array for numbers
			
			// write this numbers to array
			for(int i = 0; i < 2; i++) {
				n[i] = Integer.valueOf(o[i]);
			}
			
			ways.setNr(n[0]);    //set number of city
			ways.setCost(n[1]); //set cost city 
		} catch (Exception e) {
			System.out.println("Enter: neighbor cost"); //if incorrect data is entered
		}
		return ways; //return city's way
	}
	
//	Enter, read and set [NAME1 - source, NAME2 - destination]
	public static String[] Name1Name2(){
		String Name1Name2 [] = new String[2];
		Scanner s = new Scanner(System.in);
		String inputS = s.nextLine();    //read the line
		String [] o = inputS.split(" "); //set in array
		
		for(int i = 0; i < 2; i++) {
			Name1Name2[i] = o[i];   //Set [NAME1 - source, NAME2 - destination] in arrray
		}
		return Name1Name2; //return array with source and destination
	}
	
//	return number of find's cost for way
	public static int repeatOfFind() {
		int repeat = 0;
		Scanner input = new Scanner(System.in);
		try {
			repeat = input.nextInt();
			if(repeat >= 100) {
				System.out.println("You exceeded the limit tests, you can only use 100");
				repeat = 100;
			}
		} catch (Exception e) {
			System.out.println("Enter possitive integer");
			repeatOfFind();
		}
		return repeat;
	}
}
