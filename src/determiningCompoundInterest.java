import java.util.Scanner;


public class determiningCompoundInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the principal amount? ");
		double principal = scan.nextDouble();
		
		System.out.print("What is the rate? ");
		double interest = scan.nextDouble() / 100;
		
		System.out.print("What is the number of years? ");
		double year = scan.nextDouble();
		
		System.out.print("What is the number of times the interest is compounded per year? ");
		double compoundedPerYear = scan.nextDouble();
		
		System.out.printf("$" + (int)principal + " invested at " + interest*100 + "%c for " + (int)year + " years compounded " + (int)compoundedPerYear + " times per year is %.2f.",'%',compoundedInterestCalc(principal, interest, year,compoundedPerYear));
	}

	public static double compoundedInterestCalc( double principal, double interest, double year, double compoundedPerYear){
		double worth = principal * Math.pow((1 + interest/compoundedPerYear), compoundedPerYear*year );
		return worth;
	}
}
