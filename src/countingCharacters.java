import java.util.Scanner;


public class countingCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the input string?");
		String input = scan.nextLine();
		System.out.println(input + " has " + input.length() + " characters." );
		
	}

}
