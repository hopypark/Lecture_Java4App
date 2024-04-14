package exam.stat;

public class AppMain {

	public static void main(String[] args) {
		Student lee = new Student("홍길동", 5, 10_000);
		System.out.println("lee의 serialNumber: "+lee.serialNumber);
		System.out.println("lee의 studentID: "+lee.studentID);
		
		Student kim = new Student("김유신", 4, 20_000);
		System.out.println("kim의 serialNumber: "+lee.serialNumber);		
		System.out.println("kim의 studentID: "+kim.studentID);
		
	}

}
