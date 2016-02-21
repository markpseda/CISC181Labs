package mainPackage;
import java.util.Scanner;
/* This program is designed to determine how much one should
 * save to retire for a given amount of time given....
 * 
 * 
 *  TotalSaving = (RequiredIncome-MonthlySSIncome)*((1-(1/(Math.pow(1+(AnnualRetirment/100)/12,RetiredYears*12 )))))/((AnnualRetirment/100)/12);
        SaveMonthly = TotalSaving*(((AnnualReturn/100)/12)/((Math.pow(1+(AnnualReturn/100)/12, numberOfYears*12))-1));
 * 
 * 
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
	}
	
	private static void calculateOutput(int numYearsWork, double workingReturn, int numYearsRetire, double retiredReturn, double amountNeeded, double SSI) {
		
		double totalSave = (amountNeeded-SSI)*((1-(1/(Math.pow(1+(retiredReturn/100)/12,numYearsRetire*12 )))))/((retiredReturn/100)/12);
		
		double monthlySave = totalSave*(((workingReturn/100)/12)/((Math.pow(1+(workingReturn/100)/12, numYearsWork*12))-1));
		System.out.print("You will need to save $");
		System.out.printf("%.2f",totalSave);
		System.out.println(" in all.");
		System.out.print("This means you must save $");
		System.out.printf("%.2f",monthlySave);
		System.out.println(" per month.");
	}
}
