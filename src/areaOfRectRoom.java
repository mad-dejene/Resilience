import java.util.Scanner;


public class areaOfRectRoom {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("What is the length of the room in feet? ");
		int length = scan.nextInt();
		System.out.print("What is the width of the room in feet? ");
		int width = scan.nextInt();
		
		int area = length * width;
		double convertedArea = area * 0.09290304;
		
		System.out.println("You entered dimensions of " + length + " feet by " + width + ".");
		
		System.out.print("The area is \n" + area + " square feet\n" + convertedArea + " square meters");
	}

}
