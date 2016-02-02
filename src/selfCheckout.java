import java.util.Scanner;

public class selfCheckout {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print(" How many items do you have? ");
		int items = scan.nextInt();
		double subtotal = 0;
		for(int i = 1; i <= items; i++){
			System.out.print("Enter the price of item " + i + ": ");
			double price = scan.nextDouble();
			System.out.print("Enter the quantity of item " + i + ": ");
			int quantity = scan.nextInt();
			subtotal += (double)(price * quantity);
		}
		System.out.println("Subtotal: $" + subtotal);
		
		double tax = 0.055 * subtotal;
		System.out.println("Tax: $" + tax);
		
		double total = subtotal + tax;
		
		System.out.println("Total: $" + total);
		
	}

}
