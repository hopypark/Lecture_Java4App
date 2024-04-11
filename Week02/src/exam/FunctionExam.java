package exam;

public class FunctionExam {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");

	}

	private static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;	// 결과값을 반환 = 반환값
	}

}
