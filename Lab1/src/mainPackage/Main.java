package mainPackage;
import java.util.Scanner;
/* This program is designed to determine how much one should
 * save per month in order to retire comfortably using the amount 
 * needed per year, social security income, the annual return for 
 * years during retirement, and the number of years retired.
 */
public class Main {

	public static void main(String[] args) { //Main process
		
		determineValues();

	}

	private static void determineValues(){ //Used to get all needed input values
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of years you plan to work.");
		int numYearsWork = input.nextInt();
		
		System.out.println("Enter annual return for your working years.");
		double workingReturn = input.nextDouble();
		
		System.out.println("Enter the number of years you plan to retire.");
		int numYearsRetire = input.nextInt();
		
		System.out.println("Enter annual return for your retired years.");
		double retiredReturn = input.nextDouble();
		
		System.out.println("Enter amount needed per year during retirement.");
		double amountNeeded = input.nextDouble();
		
		System.out.println("Enter expected Social Security income.");
		double SSI = input.nextDouble();
		
		input.close();	
		
		calculateOutput(numYearsWork, workingReturn, numYearsRetire, retiredReturn, amountNeeded, SSI);
		//^^Calls the "calculateOutput" method. This passes parameters who have had their values specified by the user. The method then calculates
		// the total amount needed to be saved and and how much money must be saved per month to attain this value
	}
	
	private static void calculateOutput(int numYearsWork, double workingReturn, int numYearsRetire, double retiredReturn, double amountNeeded, double SSI) {
		
		double totalSave = (amountNeeded-SSI)*((1-(1/(Math.pow(1+(retiredReturn/100)/12,numYearsRetire*12 )))))/((retiredReturn/100)/12);
		//Calculates the total amount of money needed for retirement using the amount needed per year, social security income, the annual return
		//for years during retirement, and the number of years retired
		
		double monthlySave = totalSave*(((workingReturn/100)/12)/((Math.pow(1+(workingReturn/100)/12, numYearsWork*12))-1));
		System.out.print("You will need to save $");
		System.out.printf("%.2f",totalSave);
		System.out.println(" in all.");
		System.out.print("This means you must save $");
		System.out.printf("%.2f",monthlySave);
		System.out.println(" per month.");
		//The above lines print the amount needed for retirement and how much to save per month. 
	}
}
