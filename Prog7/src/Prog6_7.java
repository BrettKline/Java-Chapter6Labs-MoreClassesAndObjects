import java.util.Scanner;
public class Prog6_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a Retail item's description, item number, wholesale cost, and retail cost.");
		String desc = input.nextLine();
		RetailItem myRetailItem = new RetailItem(desc, input.nextInt(), input.nextDouble(), input.nextDouble());
		System.out.println(myRetailItem.toString());
		
		System.out.println("Input a new wholesale cost and retail cost.");
		myRetailItem.SetWholesaleCost(input.nextDouble());
		myRetailItem.SetRetailCost(input.nextDouble());
		System.out.println(myRetailItem.toString());
		
		input.close();

	}

}
