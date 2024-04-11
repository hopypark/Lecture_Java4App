package exam;

public class Bus {
	int busNumber;
	int passengerCount;
	int fare;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public int take(int money) throws InsufficientBalanceException {
		if (isTakePossible(money)) throw new InsufficientBalanceException();
		else {
			postTake(); // 
			return money - 1000;
		}
	}
	
	private void postTake() {
		this.fare += 1000;
		this.passengerCount++;		
	}
	
	private boolean isTakePossible(int money) {
		if (money < 1000) return true;
		else return false;
	}
	
	public void showInfo() {
		System.out.println("버스 "+busNumber + "번의 승객은 " + passengerCount
				+ "명이고, 수입은 " + fare + "원 입니다.");
	}
}
