package Model;

/**
 * @author andrewmccoy - agmccoy
 * CIS175 - Fall 2021
 * Jan 20, 2023
 */
public class Rentor {
	//properties
	private String fullName;
	private boolean hasPets;	
	private int numOfRooms;	
	private int age;
	private int costOfRent;

	//Constructors
	public Rentor() {
	}
	public Rentor(String _fullName, int _numOfRooms) {
		this.fullName = _fullName;
		this.numOfRooms = _numOfRooms;
	}

	//Getters and Setters
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
	public boolean isHasPets() {
		return hasPets;
	}
	public void setHasPets(boolean hasPets) {
		this.hasPets = hasPets;
	}


	public int getNumOfRooms() {
		return numOfRooms;
	}
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//HelperMethods
	public int determineCostOfRent() {
		int tempRentCost = 0;
		if(this.numOfRooms == 1) {
			tempRentCost = 750;
		}else if(this.numOfRooms == 2) {
			tempRentCost = 1175;
		}
		
		if(this.hasPets == true) {
			tempRentCost = tempRentCost + 25;
		}
		this.costOfRent = tempRentCost;
		return this.costOfRent;
	}
	
	
	public String getRenterInformation() {	
		this.determineCostOfRent();
		String stringRent = String.valueOf(this.costOfRent);
		String message = "Thanks " + this.fullName + ", your bill is $" + stringRent;
		return message;
	}
	
	public boolean determineCareCategory() {
		if(this.age >= 68) {
			return true;
		}else return false; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
