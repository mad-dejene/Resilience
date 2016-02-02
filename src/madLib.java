import java.util.Scanner;


public class madLib {
	
	private static Scanner scan; 
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("Enter a noun: ");
		String noun = scan.nextLine();
		
		System.out.print("Enter a verb: ");
		String verb = scan.nextLine();
		
		System.out.print("Enter an adjective: ");
		String adj = scan.nextLine();
		
		System.out.print("Enter an adverb: ");
		String adverb = scan.nextLine();

		System.out.println("Do you " + verb + " your " + adj + " " + noun + " quickly? That's hilarious!");
	}

}
