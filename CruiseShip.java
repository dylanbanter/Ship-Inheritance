package shippackage;

public class CruiseShip extends Ship {
	/** Field for max passengers */
	private int maxPassengers;
	
	/** Constructor */
	public CruiseShip(String ShipName, String YearBuilt, int maxPassengers) {
		super(ShipName, YearBuilt);
		this.maxPassengers = maxPassengers;
	}
	/** Set method */
	public void setmaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	/** Get method */
	public int getmaxPassengers() {return maxPassengers;}
	/** toString method to override the toString method in Ship class.
	    Displays ship name and passengers, not year built.*/
	@Override
	public String toString() {
		return (super.toString() + "," +" CruiseShip | Number of Passengers: " + this.maxPassengers);
	}
}
