
public class RoomCarpet {
	private RoomDimension myRoom;
	private double cost;
	
	public RoomCarpet(RoomDimension myRoom, double cost) {
		this.myRoom = myRoom;
		this.cost = cost;
	}
	
	public double GetCost() {
		return myRoom.GetArea() * cost;
	}
}
