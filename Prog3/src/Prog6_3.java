import java.util.Scanner;
public class Prog6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length and width of the room you're going to install carpet in?");
		RoomDimension myRoom = new RoomDimension(input.nextDouble(), input.nextDouble());
		System.out.println("Area is " + myRoom.GetArea());
		System.out.println("What is the cost per square foot of carpet?");
		RoomCarpet myCarpet = new RoomCarpet(myRoom, input.nextDouble());
		System.out.println("Cost is " + myCarpet.GetCost());
		
		input.close();

	}

}
