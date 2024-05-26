package week08;

public class Customer {
	protected int customerID;			// 고객 아이디
	protected String customerNamer;		// 고객 이름
	protected String customerGrade;		// 고객 등급
	int bonusPoint;						// 보너스 포인트
	double bonusRatio;					// 적립 비율
	
	public Customer() {
		initCustomer();		
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerNamer = customerName;
		initCustomer();
	}
	
	private void initCustomer() {
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		this.bonusPoint = 1000;
	}
		
	public int calcPrice(int price) {
		this.bonusPoint = this.bonusPoint + (int)(this.bonusPoint * this.bonusRatio);
		return price;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerNamer() {
		return customerNamer;
	}

	public void setCustomerNamer(String customerNamer) {
		this.customerNamer = customerNamer;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public String showCustomerInfo() {
		return this.customerNamer + "님의 등급은 " + this.customerGrade 
				+ "이며, 포인트는 " + this.bonusPoint + " 입니다.";
	}
}




