
public class LandTract {
	private double width;
	private double length;
	
	public LandTract(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public double GetArea() {
		return width * length;
	}
	public boolean equals(LandTract myLandTract) {
		if (myLandTract.GetArea() == this.GetArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "LandTract [width=" + width + ", length=" + length + ", GetArea()=" + GetArea() + "]";
	}
	
}
