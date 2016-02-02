import java.util.Scanner;


public class simpleMath {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("What is the first number? ");
		double first = scan.nextDouble();
		System.out.print("What is the second number? ");
		double second = scan.nextDouble();
		
		double add = first + second;
		double sub = first - second;
		double divide = first / second;
		double multiply = first * second; 
		
		System.out.println(first + " + " + second + " = " + add);
		System.out.println(first + " - " + second + " = " + sub);
		System.out.println(first + " * " + second + " = " + multiply);
		System.out.println(first + " / " + second + " = " + divide);
		
		
		
		

	}

}
