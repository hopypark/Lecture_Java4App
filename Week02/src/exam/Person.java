package exam;

public class Person {
	String name;		// 이름
	int height;			// 키(cm)
	double weight;		// 몸무게(kg)
	boolean isSuperman; // 수퍼맨이냐? yes/no
	
	Person(){}	// 기본 생성자
	Person(String pname, int pheight, double pweight, boolean pisSuperman){
		name = pname;
		height = pheight;
		weight = pweight;
		isSuperman = pisSuperman;
	}	
	
	public void waking() {
		System.out.println("걷는다.");
	}
	
	public void eat() {
		System.out.println("먹는다.");
	}	
	
	public void whoIam() {
		if (isSuperman) {
			System.out.println("나는 Superman이고, 이름은 " + name + "입니다.");
		}else {
			System.out.println("나는 사람이고, 이름은 " + name + "입니다.");	
		}
	}
}

