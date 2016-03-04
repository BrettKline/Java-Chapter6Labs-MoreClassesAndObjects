
public class RetailItem {
	private String description;
	private int itemNumber;
	private CostData cost;
	
	public RetailItem(String description, int itemNumber, double wholesale, double retail) {
		this.description = description;
		this.itemNumber = itemNumber;
		cost = new CostData(wholesale, retail);
	}
	public void SetWholesaleCost(double wholesale) {
		cost.setWholesale(wholesale);
	}
	public void SetRetailCost(double retail) {
		cost.setRetail(retail);
	}
	public double GetWholesaleCost() {
		return cost.wholesale;
	}
	public double GetRetailCost() {
		return cost.retail;
	}
	@Override
	public String toString() {
		return "RetailItem [description=" + description + ", itemNumber=" + itemNumber + ", cost=" + cost.retail + " retail, " + cost.wholesale + " wholesale]";
	}
}
