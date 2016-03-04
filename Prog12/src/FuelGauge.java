
public class FuelGauge {
	private double gallonsOfFuel;
	private boolean canCarMove;

	public FuelGauge(double gallonsOfFuel) {
		if (gallonsOfFuel < 1) {
			this.gallonsOfFuel = 0;
			canCarMove = false;
		}
		else if (gallonsOfFuel > 15) {
			this.gallonsOfFuel = 15;
			canCarMove = true;
		}
		else {
			this.gallonsOfFuel = gallonsOfFuel;
			canCarMove = true;
		}
	}

	public double getGallonsOfFuel() {
		return gallonsOfFuel;
	}
	public boolean CanCarMove() {
		return canCarMove;
	}

	public void fillCar() {
		if (gallonsOfFuel < 15) {
			gallonsOfFuel++;
		}
		if (gallonsOfFuel > 14) {

			canCarMove = true;
			System.out.println("Car is done fueling...");
		}
		else {
			System.out.println("Car is too full of gas! Gallon not added.");
		}
	}
	public void useCar() {
		if (gallonsOfFuel > 0) {
			gallonsOfFuel--;
			canCarMove = true;
		}
		else {
			System.out.println("Car is out of gas! Car can't move.");
			canCarMove = false;
		}
	}
}
