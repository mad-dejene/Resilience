import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("What is your name? ");
		String input = scan.next(); 
		System.out.println("Hey there, " + input + "! What's up?");
		scan.close();
		
	}

}
