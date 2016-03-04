import java.util.Scanner;
public class Prog6_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a Retail item's description, item number, wholesale cost, and retail cost, then how many you want.");
		String desc = input.nextLine();
		CashRegister myCheckout = new CashRegister(desc, input.nextInt(), input.nextDouble(), input.nextDouble(), input.nextInt());
		System.out.println("Subtotal: " + myCheckout.GetSubtotal());
		System.out.println("Tax: " + myCheckout.GetSalesTax());
		System.out.println("Total: " + myCheckout.GetTotal());
		
		
		input.close();

	}

}
