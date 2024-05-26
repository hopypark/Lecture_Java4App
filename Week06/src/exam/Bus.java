package exam;

public class Bus {
	int busNumber;
	int passengerCount;
	int fare;
	final static int FARE = 1_000;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public int take(int money) throws InsufficientBalanceException {
		if (isTakePossible(money)) throw new InsufficientBalanceException();
		else {			
			return postTake(money); // 버스 요금을 뺀 금액을 돌려준다.
		}
	}
	
	private int postTake(int money) {
		this.fare += Bus.FARE;
		this.passengerCount++;
		return money - Bus.FARE;
	}
	
	private boolean isTakePossible(int money) {
		if (money < Bus.FARE) return true;
		else return false;
	}
	
	public void showInfo() {
		System.out.println("버스 "+busNumber + "번의 승객은 " + passengerCount
				+ "명이고, 수입은 " + fare + "원 입니다.");
	}
}
