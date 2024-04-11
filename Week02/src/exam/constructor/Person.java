package exam.constructor;

public class Person {
	String name;		// 이름
	double height;		// 키
	double weight;		// 몸무게
	
	public Person() { }
	
	public Person(String pname) { 
		name = pname;
	}	  
	
	public Person(String pname, double pheight, double pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}

