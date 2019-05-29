package task2;

import java.util.ArrayList;

/*
 * Create a object for data storage
 */

public class Cities {
	private String name;  //name of city
	private int p;		 //number of neighbors
	private	ArrayList<Ways> cityWays = new ArrayList<Ways>();  //Array of city's ways
	
	//set name of city
	public void setName(String name) {
		this.name = name;
	}
	//set number of neighbors
	public void setP(int p) {
		this.p = p;
	}
	
	//return name of City
	public String getName() {
		return name;
	}
	
	//return number of neighbors
	public int getP() {
		return p;
	}
	
	//set list of ways for some City's object
	public void waysOfCity(){
		for(int i = 0; i < p; i++) {
			Ways way = Input.inputWays(); 
			cityWays.add(way);
		}
	}
	//return list of ways for some City's object
	public  ArrayList<Ways> getWaysOfCity(){
		return cityWays;
	}
}
