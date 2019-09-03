package Switch;

public class Account {

	private int accountNumber;
	private double accountBalance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;

	public Account() {
		this(3456, 1.50, "defult name", "default address", "default phone");
		System.out.println("empty constructor");
	}

	public Account(int accountNumber, double accountBalance, String customerName, String customerEmailAddress,
			String customerPhoneNumber) {
		System.out.println("account constructor");
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	

	public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
		this(99999,100.0,customerName,customerEmailAddress,customerPhoneNumber);
//		super();
//		this.customerName = customerName;
//		this.customerEmailAddress = customerEmailAddress;
//		this.customerPhoneNumber = customerPhoneNumber;
	}

	public void deposit(double depositAmount) {
		this.accountBalance += depositAmount;
		System.out.println("the deposit is" + depositAmount + " done. the new balance after " + this.accountBalance);
	}

	public void withdraw(double withdrawAmount) {
		if (this.accountBalance - withdrawAmount <= 0) {
			System.out.println("only " + this.accountBalance + " available. withdraw is not proccessed");
		} else {
			this.accountBalance -= withdrawAmount;
			System.out.println("withdrwal of " + withdrawAmount + " the remaining balace is " + this.accountBalance);
		}

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

}
