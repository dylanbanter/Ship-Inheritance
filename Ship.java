package shippackage;

public class Ship {
	private String ShipName;
	private String YearBuilt;
	
	/** Constructor for ship name and year built */
	public Ship(String ShipName, String YearBuilt) {
		this.ShipName = ShipName;
		this.YearBuilt = YearBuilt;
		}
	/** Set Methods */
	public void setShipName(String ShipName) {
		this.ShipName = ShipName;
	}
	public void setYearBuilt(String YearBuilt) {
		this.YearBuilt = YearBuilt;
	}
		/** Get Methods */
	public String getShipName() {return ShipName;}
	public String getYearBuilt() {return YearBuilt;}
	
	/** toString method that displays ship's name and year built */
	public String toString() {
			return "Ship | Name of Ship: " + this.ShipName + ", Date Built: " + this.YearBuilt;
		}

	
}
