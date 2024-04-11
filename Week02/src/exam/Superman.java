package exam;

public class Superman extends Person {
	
	Superman(String pname, int pheight, double pweight, boolean pisSuperman){
		name = pname;
		height = pheight;
		weight = pweight;
		isSuperman = pisSuperman;
//		super(pname, pheight, pweight, pisSuperman);
	}
	
	public void fly() {
		System.out.println("하늘을 난다.");
	}
	
}

