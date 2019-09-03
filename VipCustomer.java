package Switch;

public class VipCustomer {

	private String name;
	private int creditLimit;
	private String emailAddress;

	public VipCustomer() {
		this("default", 2000, "default@gmail.com");
	}

	public VipCustomer(String name, int creditLimit) {
		this(name, 2000, "UNKOWN@gmail.com");
		this.name = name;
		this.creditLimit = creditLimit;
	}

	public VipCustomer(String name, int creditLimit, String emailAddress) {

		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
