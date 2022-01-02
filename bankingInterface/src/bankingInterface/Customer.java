package bankingInterface;

public class Customer implements iBanking {
	String customerName;
	String depositType;
	int baseAmount;
	
	//Parameterized Constructor
	public Customer(String customerName, String depositType, int baseAmount) {
		this.customerName = customerName;
		this.depositType = depositType;
		this.baseAmount = baseAmount;
	}
	
	//implementation of functions
	
	//depositAmount - add thebaseAmount
	public int depositAmount(int amount) {
		amount = baseAmount + amount;
		return amount;
		}
	
	//withdrawAmount - subtract the baseAmount
	public int withdrawAmount(int amount) {
		amount = baseAmount - amount;
		return amount;
		}
}
