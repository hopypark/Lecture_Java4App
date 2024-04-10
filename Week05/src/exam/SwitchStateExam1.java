package exam;

public class SwitchStateExam1 {

	public static void main(String[] args) {
		//char rank = 'G';
//		double rank = 3.12;
		int rank = 2;
		
		switch(rank) {
		case 2:
			System.out.println("Gold");
			break;
		case 4:
			System.out.println("Silver");
			break;
		case 3:
			System.out.println("Bronze");
			break;
		default:
			System.out.println("No Medal");
			
		}

	}

}
