package shippackage;
public class ShipDemo {

	public static void main(String[] args) {
		
		/** Declare array to store the ships*/
		Ship[] ships = new Ship[6];
		
		/** FIll array with elements of Ship */
		ships[0] = new Ship("Merriweather", "11/2/2021");
		ships[1] = new Ship("Nevermore","11/2/2021");
		ships[2] = new CruiseShip("Perugius", "11/2/2021", 250);
		ships[3] = new CruiseShip("Greyrat", "11/2/2021", 15);
		ships[4] = new CargoShip("Castor", "11/2/2021", 835);
		ships[5] = new CargoShip("Albion", "11/2/2021", 220);

		/** Print the results by iterating over the array */
		for (Ship entry : ships) {
		    System.out.println(entry);
		}
	}
}
