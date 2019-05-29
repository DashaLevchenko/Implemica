package task2;

import java.util.ArrayList;

public class Run {
	public static void main(String [] args) {
		//Set objects: Tests, Cities, Ways
		Tests tests = Input.inputTests();
		int repeat = tests.getS();
		for(int y = 0; y < repeat; y++) {
			tests.citiesInTest();
		}
		
		//Find the minimum transportation cost from city NAME1 to city NAME2
		int reapitOfFind = Input.repeatOfFind();  //Enter number of find
		//take name of city out and to
		ArrayList<String []> ArrName1Name2 = new ArrayList<String[]>();
		String Name1Name2 [] = new String[2]; 
		//Write name of city out and to
		for(int i = 0; i < reapitOfFind; i++) {
			Name1Name2 = Input.Name1Name2();  //call function for writing cities' name 
			ArrName1Name2.add(Name1Name2); //writing cities' name in array
		}
		
		//find the minimum transportation cost 

		for(int i = 0; i < reapitOfFind; i++) {
			SearchMinCost.findCost(tests, ArrName1Name2.get(i));
		}
	}
}
