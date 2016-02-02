import java.util.Scanner;


public class printingQuotes {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("What is the quote? ");
		String quote = scan.nextLine();
		System.out.print("Who said it? ");
		String person = scan.nextLine();
		System.out.println(person + " says, " + '"' + quote + "." + '"');

	}

}
