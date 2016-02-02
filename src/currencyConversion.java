import java.util.Scanner;

public class currencyConversion {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many euros are you exchanging? ");
		double euros = scan.nextDouble();
		
		System.out.print("What is the exchange rate? ");
		double exchangeRate = scan.nextDouble();
	
		double finalAmount = (euros * exchangeRate) / 100;
		System.out.printf((int)euros + " euros at an exchange rate of " + exchangeRate + " is %.2f U.S. dollars.",finalAmount);
		

	}

}
