package exam;

public class PersonTest {

	public static void main(String[] args) {
	
		Person lee = new Person("이순신", 180, 80.0, false);
		Superman cris = new Superman("크리스토퍼", 200, 100, true);
		lee.whoIam();
		cris.whoIam();
	}

}


