import java.util.Scanner;
public class Prog6_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the dimensions of two tracts of land.");
		LandTract tract1 = new LandTract(input.nextDouble(), input.nextDouble());
		LandTract tract2 = new LandTract(input.nextDouble(), input.nextDouble());
		if (tract1.equals(tract2)) {
			System.out.println("These tracts have the same area.");
		}
		else {
			System.out.println("These tracts don't have the same area.");
		}
		System.out.println(tract1.toString());
		System.out.println(tract2.toString());
		input.close();
	}
	
}
