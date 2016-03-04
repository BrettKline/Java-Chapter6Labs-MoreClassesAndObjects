
public class Odometer {
	private double mileage;
	private FuelGauge myFuelGauge;
	public Odometer(double mileage, double gallonsOfFuel) {
		this.mileage = mileage;
		myFuelGauge = new FuelGauge(gallonsOfFuel);
	}
	
	public void DriveCar() {
		if (myFuelGauge.CanCarMove()) {
			mileage++;
			if (mileage > 999999) {
				mileage = 0;
			}
			if (mileage % 24 == 0) {
				System.out.println("Burned a gallon of gas... Mileage: " + mileage + " Gallons remaining: " + myFuelGauge.getGallonsOfFuel());
			}

			myFuelGauge.useCar();
		}
		else {
			System.out.println("We need to fill the car, so let's do that.");
			myFuelGauge.fillCar();
		}
	}
}
