import java.util.Scanner;

public class retirementCalc {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("What is your current age? ");
		int currentAge = scan.nextInt();
		System.out.print("At what age would you like to retire? ");
		int retireAge = scan.nextInt();
		
		int yearTillRetire = retireAge - currentAge;
		int retireYear = 2016 + yearTillRetire;
		
		System.out.println("You have " + yearTillRetire + " years left until you can retire.\n"
				+ "It's 2016, so you can retire in " + retireYear + ".");

	}

}
