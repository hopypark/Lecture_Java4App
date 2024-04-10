package week02;

public class StudentTest1 {
	public static void main(String[] args) {
		Student park = new Student();
		park.studentName = "박경태";
		//park.setStudentName("박경태");

		System.out.println(park.studentName);
		System.out.println(park.getStudentName());
	}
}

