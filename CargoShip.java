package shippackage;

public class CargoShip extends Ship {
	/** Cargo capacity in tonnage field*/
	private int Tonnage;
	
	/** Constructor */
	public CargoShip(String ShipName, int Tonnage) {
		super(ShipName);
		this.Tonnage = Tonnage;
	}
	/** Set Method */
	public void setTonnage(int Tonnage) {
		this.Tonnage = Tonnage;
	}
		/** Get Method */
	public int getTonnage() {return Tonnage;}
	/** toString method that overrides Ship class toString method.
	    Displays ship name and cargo capacity, not year built. */
	@Override
	public String toString() { 
		return (super.toString() + "," +" CargoShip | Total Tonnage of Cargo: " + this.Tonnage);
				}
}
