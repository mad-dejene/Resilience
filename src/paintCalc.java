import java.util.Scanner;

public class paintCalc {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		double gallons = 350;
		System.out.print("What is the length of the roof? ");
		double length = scan.nextInt();
		System.out.print("What is the width of the roof? ");
		double width = scan.nextInt();
		double area = length * width;
		double gallonsNeeded = area / gallons;
		double parseGallonNeeded = Math.round(gallonsNeeded);
		
		if(gallonsNeeded > parseGallonNeeded){
			gallonsNeeded = parseGallonNeeded + 1;
		}
		else if (gallonsNeeded < parseGallonNeeded){
			gallonsNeeded = parseGallonNeeded;
		}
		
		System.out.println("You will need to purchase " + gallonsNeeded + " gallons of paint to cover "+ area +" square feet.");
	}
}
