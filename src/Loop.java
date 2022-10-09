import java.util.Scanner;
//Factorial of numbers
class Loop {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		while(num!=0) {
			fact*=num;
			num--;
		}
		System.out.println("Fact of the given number is:"+fact);
	}

}
