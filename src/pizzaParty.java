import java.util.Scanner;


public class pizzaParty {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		int slicesPerPizza = 8;
		scan = new Scanner(System.in);
		System.out.print("How many people? ");
		int people = scan.nextInt();
		System.out.print("How many pizzas do you have? ");
		int pizzas = scan.nextInt();
		int numbOfSlices = slicesPerPizza * pizzas;
		int slicePerPerson = numbOfSlices / people;
		int leftovers = numbOfSlices - (people * slicePerPerson);
		
		System.out.println( people + " people with " + pizzas + " pizzas");
		
		System.out.println("Each person gets " + slicePerPerson + " pieces of pizza.");
		
		System.out.println("There are "+ leftovers +" leftover pieces.");
	}
}
