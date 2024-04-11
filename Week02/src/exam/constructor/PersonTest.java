package exam.constructor;

public class PersonTest {
	public static void main(String[] args) {
		Person lee = new Person();
		lee.name = "이순신";
		lee.height = 180.0;
		lee.weight = 74.5; 
		
		Person kim = new Person("김유신", 195.8, 90.5);		
	}
}

