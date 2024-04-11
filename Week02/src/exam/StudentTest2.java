package exam;

public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "홍길동";
		System.out.println(student1.getStudentName());

		Student student2 = new Student();
		student2.studentName = "이순신";			// 멤버 변수에 사용 
		System.out.println(student2.getStudentName());	// 매서드에 사용
	}
}
