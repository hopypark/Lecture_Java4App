package week08;

public class VIPCustomer extends Customer {
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;		
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}

	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint = this.bonusPoint + (int)(price * bonusRatio); 
		return price - (int)(price * this.saleRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 아이디는 " 
				+ this.agentID + "입니다.";
	}
}


