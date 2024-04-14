package exam.stat;

import exam.Bus;
import exam.InsufficientBalanceException;

public class Student {
	static int serialNumber = 1000;
	String studentName;	// 학생 이름
	int grade;			// 학년
	int money;			// 가진 돈
	int studentID;		// 학번
	
	public Student(String studentName, int grade, int money) {
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
		studentID = ++serialNumber;
	}
	
	public void takeBus(Bus bus) {
		try {
			this.money = bus.take(money);
		} catch (InsufficientBalanceException e) {
			System.out.println("잔액이 부족.");
		}	
	}
	
	public void showInfo() {
		System.out.println("학생 "+studentName + "님의 남은 돈은 " + money + "원입니다.");
	}
}
