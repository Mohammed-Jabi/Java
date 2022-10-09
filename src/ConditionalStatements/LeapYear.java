package ConditionalStatements;

public class LeapYear {
	public static void main(String args[]) {
		int year=2000;
		/*if(year%4==0) {
			if(year%100==0) {
				System.out.println("The given Year is not a leap year.");
			}
			else {
				System.out.println("The given Year is a leap year.");
			}
		}
		else {
			System.out.println("The given year is not a Leap Year"); 
		}*/
		
		if((year%400==0)||(year%4==0 && 100!=0)) {
			System.out.println("The given Year is a leap year.");
		}
		else {
			System.out.println("The given year is not a Leap Year");
		}
	}

}
