package ConditionalStatements;

public class SwapingTheNo {
	public static void main(String args[]) {
		int a=1086,b=3340,temp;
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		/*temp=a;
		a=b;
		b=temp; 
		System.out.println("The value of a after swapping is:"+a);
		System.out.println("The value of b after swapping is:"+b);*/
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a after swapping is:"+a);
		System.out.println("The value of b after swapping is:"+b);
	}

}
