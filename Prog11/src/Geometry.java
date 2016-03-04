
public class Geometry {
	public static double GetCircleArea(double radius) {
		if (radius < 0) {
			System.out.println("Attempted to compute an impossible shape; try not using negative numbers."); 
			return -1;
		}
		else {
			return Math.PI * radius * radius;
		}
	}
	public static double GetRectangleArea(double height, double width) {
		if (height < 0 || width < 0) {
			System.out.println("Attempted to compute an impossible shape; try not using negative numbers."); 
			return -1;
		}
		else {
			return height * width;
		}
	}
	public static double GetTriangleArea(double base, double height) {
		if (base < 0 || height < 0) {
			System.out.println("Attempted to compute an impossible shape; try not using negative numbers."); 
			return -1;
		}
		else {
			return base * height * 0.5;
		}
	}
}
