import java.util.Scanner;
public class Prog6_12 {

	public static void main(String[] args) {
		System.out.println("How many miles did you buy your car with? And how many gallons of gas was it filled with? (It can hold up to 15.)");
		Scanner input = new Scanner(System.in);
		Odometer myOdometer = new Odometer(input.nextDouble(), input.nextDouble());
		System.out.println("How many miles do you want to drive around?");
		for (int counter = input.nextInt(); counter > 0; counter--) {
			myOdometer.DriveCar();
		}
		input.close();
	}

}
