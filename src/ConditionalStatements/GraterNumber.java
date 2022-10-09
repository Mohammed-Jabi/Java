package ConditionalStatements;

public class GraterNumber {

	public static void main(String[] args) {
		int a = 100, b = 20, c = 30;
		/*
		 * if(a>b && a>c) { System.out.println("A is greates among all"); } else if(b>a
		 * && b>c){ System.out.println("B is greatest among all"); } else {
		 * System.out.println("C is greatest among all"); }
		 */

		if (a > b) {
			if (a > c) {
				System.out.println("A is greatest among");
			} else {
				System.out.println("B is greatest among");
			}

		} else if (b > c) {
			System.out.println("B is greatest among");
		} else {
			System.out.println("C is greatest among");
		}
	}

}
