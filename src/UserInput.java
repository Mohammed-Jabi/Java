import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println("Enter Gender");
		char gender=sc.next().charAt(0);
		System.out.println("Enter Phone-number");
		long number=sc.nextLong();
		System.out.println("NAME:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("Phone-Number:"+number);
	}

}
