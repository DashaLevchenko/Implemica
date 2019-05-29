package task2;

import java.util.ArrayList;

public class Tests {
	private int s;  //number of tests
	private int n;	//number of cities
	private ArrayList<Cities> citiesInList = new ArrayList<Cities>(); //Array of City in test
	
	//Set number of test
	public void setS(int s) {
		this.s = s;
	}
	//Set number of cities in test
	public void setN(int n) {
		this.n = n;
	}
	//Return number of test
	public int getS() {
		return s;
	}
	//Return number of cities in test
	public int getN() {
		return n;
	}
	
	//Set city's object in test
	public void citiesInTest() {
		for(int i = 0; i < this.n; i++) {
			Cities cities = Input.inputCities();
			cities.waysOfCity();	
			citiesInList.add(cities);
		}
	}
	//Return city's object in test
	public ArrayList<Cities> getCitiesInTest() {
		return citiesInList;
	}
}
