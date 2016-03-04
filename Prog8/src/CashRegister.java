
public class CashRegister {
	public RetailItem retailItem;
	public int quantity;
	
	public CashRegister(String description, int itemNumber, double wholesale, double retail, int quantity) {
		this.quantity = quantity;
		retailItem = new RetailItem(description, itemNumber, wholesale, retail);
	}
	public double GetSubtotal() {
		return retailItem.GetRetailCost() * quantity;
	}
	public double GetSalesTax() {
		return (retailItem.GetRetailCost() * quantity) * .06;
	}
	public double GetTotal() {
		return this.GetSubtotal() + this.GetSalesTax();
	}
}
