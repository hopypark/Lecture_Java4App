package week02;

public class Student {
	int studentID;		// 학번
	String studentName;	// 이름
	int grade;			// 학년
	String address;		// 사는 곳
	
	public String getStudentName() {	// 학생의 이름을 반환하는 매서드
		return studentName;
	}
	
	public static void main(String[] args) {
		Student park = new Student();
		park.studentName = "박경태";
		//park.setStudentName("박경태");

		System.out.println(park.studentName);
		System.out.println(park.getStudentName());
	}
}


