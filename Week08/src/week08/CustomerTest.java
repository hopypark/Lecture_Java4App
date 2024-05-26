package week08;

public class CustomerTest {
	public static void main(String[] args) {		
		Customer kim = new Customer(100010, "김유신"); // customer
		System.out.println(kim.showCustomerInfo());
		VIPCustomer lee = new VIPCustomer(10020, "이순신", 12340); 		// VIP customer
		System.out.println(lee.showCustomerInfo());
		Customer vc = new VIPCustomer(10030, "홍길동", 12345);		// ?? 묵시적 자동형변환
		System.out.println(vc.showCustomerInfo());
		
		System.out.println("===================할인율과 보너스 포인트 계산 후 =====================");
		int kimPrice = kim.calcPrice(10000);
		int leePrice = lee.calcPrice(10000);
		int vcPrice = vc.calcPrice(10000);
		
		System.out.println(kim.getCustomerNamer() + "님이 " + kimPrice+"원 지불하였습니다.");
		System.out.println(kim.showCustomerInfo());
		System.out.println(lee.getCustomerNamer() + "님이 " + leePrice+"원 지불하였습니다.");
		System.out.println(lee.showCustomerInfo());
		System.out.println(vc.getCustomerNamer() + "님이 " + vcPrice+"원 지불하였습니다.");
		System.out.println(vc.showCustomerInfo());
	}
}

