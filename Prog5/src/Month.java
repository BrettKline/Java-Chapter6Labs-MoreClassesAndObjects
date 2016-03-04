
public class Month {
	private int monthNumber;
	
	public Month() {
		this.monthNumber = 1;
	}
	public Month(int monthNumber) {
		if (monthNumber > 12 || monthNumber < 1) {
			this.monthNumber = 1;
		}
		else {
			this.monthNumber = monthNumber;
		}
	}
	public Month(Months thisMonth) {
		this.monthNumber = thisMonth.ordinal();
	}
}
