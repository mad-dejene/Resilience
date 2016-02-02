import java.util.Scanner;


public class computingSimpleInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the principal: ");
		double principal = scan.nextDouble();
		
		System.out.print("Enter the interest: ");
		double interest = scan.nextDouble() / 100;
		
		System.out.print("Enter the year: ");
		double year = scan.nextDouble();
		
		System.out.println("After " + year + " years at " + interest * 100 + "%, the investment will be worth " + interestCalc(principal, interest, year) + ".");
	}

	public static double interestCalc( double principal, double interest, double year){
		double worth = principal * (1 + interest * year);
		return worth;
	}
}
