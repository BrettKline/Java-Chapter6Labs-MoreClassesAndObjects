
public class RoomDimension {
	private double length;
	private double width;
	
	public RoomDimension(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double GetArea() {
		return length * width;
	}
	
}
