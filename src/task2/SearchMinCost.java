package task2;

import java.util.ArrayList;

public class SearchMinCost{
	private static int min;   //minimum cost per way
	private static Integer cost; //cost of all way from start way to end way
	private static ArrayList<Cities> allCities;  //array to all cities in test
	private static String Name1;  //Source
	private static String Name2;  //destination
	private static ArrayList<Integer> idUsed; //Array of used cities
	private static int first;  //id of Name1
	
//	return the minimum cost in the way of some city
	public static int min(ArrayList<Ways> way ) {
		int arrMin[] = new int[way.size()];	//array of all cost in city
		for(int i = 0; i < way.size(); i++) {
			arrMin [i] = way.get(i).getCost();  //wtiting cost in array 
		}
		min = arrMin[0];
		for(int i = 0; i < arrMin.length; i++) {
			if(min > arrMin[i]) min = arrMin[i]; //the minimum cost
		}
		
		return min; 
	}
	
//	return city's object in test's array
	public static Cities searchName1(Tests tests, String[] Name1Name2) {
		Name1 = Name1Name2[0];  //set String Name1
		Name2 = Name1Name2[1];	//set String Name2
		
		allCities = tests.getCitiesInTest(); //list of all cities object in test's array
		idUsed = new ArrayList<Integer>();  //set array of used cities
		cost = 0; //set start cost
		
		Cities city1;
		for(int i = 0; i < allCities.size(); i++) {
			city1 = allCities.get(i); 
			String name = city1.getName();

			if(Name1.equals(name)) {
				return city1;  //if city is find, return it
			}			
		}
		return city1 = null; //if city isn't find
	}
	
//	return id of city in list of all cities test
	public static Integer idInAllList(String Name) {
		Integer id = 0;
		for(int i = 0; i < allCities.size(); i++) {
			Cities city = allCities.get(i);
			String temp = city.getName();
			if(temp == Name) id = i+1;
		}
		return id;
	}
	
//	return id low cost city
	public static Integer findMinCostForWay(Cities city){
		ArrayList<Ways> ways = city.getWaysOfCity(); //array all ways of city
		int minCost = min(ways); 	//low cost of all ways city
		Integer costWay = 0; //cost of each way
		int idNext = 0;  //id of next city low cost 
		Integer idCity = idInAllList(city.getName()); //id each city
		
		if(!city.getName().equals(Name2)) {   //if name of city isn't equals Name2
			for(int c = 0; c < ways.size(); c++) { //go through the list of all ways
				Ways way = ways.get(c);
				boolean on = false;

				for(int dot = 0; dot < idUsed.size(); dot++) {  
					//Check if the city is used before
					if(idUsed.get(dot).compareTo(way.getNr()) == 0) on = true; 
				}
				if(on == true) continue; //if the city was use, loop moves on to the next iteration
				Integer neighbor = way.getNr(); //get number of neighbor city
				costWay = way.getCost(); //get cost to neighbor
				
				Integer minInt = min; //get minimum
				
				// Check if the cost is equal to the minimum, and the index of the neighbor is greater than the index of the city
				if(costWay.compareTo(minInt) == 0 && neighbor.compareTo(idCity) == 1) {
					cost += costWay;  //increasing the total cost of the trip 
					idNext = way.getNr(); //get id next city low cost
				}
			}
		}
		return idNext; //return id next city low cost
	}
//	 Return city's object 
	public static Cities nextCity(int idNext) {
		Cities cityId = allCities.get(idNext-1); //get next city
		idUsed.add(idNext); //writing this city in list of used city 
		return cityId;
	}
	
//	return the cost of the whole trip
	public static int minCost() {
		return cost;
	}
	
//	The function performs the whole process of finding the minimum cost
	public static void findCost(Tests tests, String[] Name1Name2) {
		Cities cityName1 = SearchMinCost.searchName1(tests, Name1Name2);  //find city object of Name1
		String firstName = cityName1.getName(); //get name of first city
		first = idInAllList(firstName); //find id of first city
		nextCity(first); //write down id of first city in used list
		
		Integer idNextFromName1 = SearchMinCost.findMinCostForWay(cityName1); //get id way from the first city
		int idNext = idNextFromName1; 
	
		//finding the best way from Name1 to Name2 and summing up the total cost
		while(idNext != 0) {
			Cities next = SearchMinCost.nextCity(idNext);
			idNext = SearchMinCost.findMinCostForWay(next);
		}
		//get total cost
		int c = SearchMinCost.minCost();
		System.out.println(c);

	}
}
