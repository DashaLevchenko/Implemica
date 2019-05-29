package task2;

public class Ways {
	private int nr;		//index of neighbors
	private int cost;	//cost
	private Cities city; //get city's object
	
	//Set number of way's neighbor 
	public void setNr(int nr) {
		this.nr = nr;
	}
	//Set number of way's cost
	public void setCost(int cost) {
		this.cost = cost;
	}
	//Get number of neighbor
	public int getNr() {
		return nr;
	}
	//Get number of cost
	public int getCost() {
		return cost;
	}
	//Set reference to city's object
	public void setCityWay(Cities city) {
		this.city = city;
	}
}
