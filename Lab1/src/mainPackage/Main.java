package mainPackage;
import java.util.Scanner;
/* This program is designed to determine how much one should
 * save to retire for a given amount of time given....
 */
public class Main {

	public static void main(String[] args) { //Main process
		
		determineValues();
		calculateInterest();
		determineValues();
	}

	private static void calculateInterest() {
		// do stuffs
	}
	
	private static void determineValues(){ //Used to get all needed input values
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of years you plan to work.");
		int numYearsWork = input.nextInt();
		
		System.out.println("Enter annual return for your working years.");
		int workingReturn = input.nextInt();
		
		System.out.println("Enter the number of years you plan to retire.");
		int numYearsRetire = input.nextInt();
		
		System.out.println("Enter annual return for your retired years.");
		int retiredReturn = input.nextInt();
		
		System.out.println("Enter amount needed per year during retirement.");
		int amountNeeded = input.nextInt();
		
		System.out.println("Enter expected Social Security income.");
		int SSI = input.nextInt();
		
		input.close();	
	}
}
