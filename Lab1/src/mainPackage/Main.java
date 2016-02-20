package mainPackage;
import java.util.Scanner;
/* This program is designed to determine how much one should
 * save to retire for a given amount of time given....
 */
public class Main {

	public static void main(String[] args) { //Main process

		calculateInterest();
		determineValues();
	}

	private static void calculateInterest() {
		// do stuffs
	}
	
	private static void determineValues(){ //Used to get all needed input values
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = input.nextInt();
		System.out.println(a);
		input.close();
		
	}
}
