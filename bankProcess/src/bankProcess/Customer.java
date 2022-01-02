package bankProcess;

public class Customer {
	String customerName, depositType,bank;
	int baseAmount;
	

	public Customer(String customerName, String depositType, int baseAmount,String bank) {
		this.customerName = customerName;
		this.depositType = depositType;
		this.baseAmount = baseAmount;
		this.bank = bank;
	}
}
