import java.util.Scanner;
public class Prog6_1 {
	public static double CalculateArea(double radius) {
		return (Math.PI * Math.pow(radius, 2));
	}
	public static double CalculateArea(double width, double length) {
		return (width * length);
	}
	public static double CalculateArea(double radius, double height, double pi) {
		return (pi * Math.pow(radius, 2) * height);
	}
	
	public static void main(String[] args) {
		System.out.println("Do you want to calculate the area of a (c)ircle, a (r)ectangle, or a c(y)linder?");
		Scanner input = new Scanner(System.in);
		boolean isInputBad;
		String shapeToCalc; 
		do {
			shapeToCalc = input.nextLine();
			switch (shapeToCalc) {
			case "c":
			case "circle":
			case "r":
			case "rectangle":
			case "y":
			case "cylinder":
				isInputBad = false;
				break;
			default:
				isInputBad = true;
				System.out.println("I don't understand what shape you want. Please input again.");
				break;
			}
		}
		while (isInputBad);
		switch (shapeToCalc) {
		case "c":
		case "circle":
			System.out.println("Input the radius of a circle to get the area.");
			double radius1 = input.nextDouble();
			System.out.println(CalculateArea(radius1));
			break;
		case "r":
		case "rectangle":
			System.out.println("Input the width and length of a rectangle to get the area.");
			double width = input.nextDouble();
			double length = input.nextDouble();
			System.out.println(CalculateArea(width,length));
			break;
		case "y":
		case "cylinder":
			System.out.println("Input the radius and height of a cylinder, then the value of pi, to get the area.");
			double radius2 = input.nextDouble();
			double height = input.nextDouble();
			double pi = input.nextDouble();
			System.out.println(CalculateArea(radius2, height, pi));
			break;
		default:
			System.out.println("Somehow you got this far with invalid input, aborting.");
		}
		input.close();
	}

}
