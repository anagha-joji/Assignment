package bankProcess;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	String bankName;
	
	public Bank(String bankName) {
		this.bankName = bankName;
		}
	
	//creating list of Customers
	List<Customer> clist = new ArrayList<Customer>();
}
