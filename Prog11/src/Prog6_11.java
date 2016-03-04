import java.util.Scanner;
public class Prog6_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Geometry calculator! Select an option: \r\n1. Calculate a Circle's area.\r\n2. Calculate a Rectangle's area.\r\n3. Calculate a Triangle's area.\r\n4. Don't calculate anything.\r\n\r\nInput 1 through 4.");
		switch (input.nextInt()) {
		case 1:
			System.out.println("Input a circle's radius to get its area.");
			System.out.println(Geometry.GetCircleArea(input.nextDouble()));
			break;
		case 2:
			System.out.println("Input a rectangle's width and height to get its area.");
			System.out.println(Geometry.GetRectangleArea(input.nextDouble(), input.nextDouble()));
			break;
		case 3:
			System.out.println("Input a triangle's base and height to get its area.");
			System.out.println(Geometry.GetTriangleArea(input.nextDouble(), input.nextDouble()));
			break;
		case 4: 
			System.out.println("Oh, okay. See you later!");
			break;
		default:
			System.out.println("I didn't understand what you wanted. Reboot the program and try again, please.");
			break;
		}
		input.close();
	}

}
