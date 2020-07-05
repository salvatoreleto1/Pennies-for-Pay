/*
 * By Salvatore Leto
 */

import java.util.Scanner; // for keyboard

public class penniesForPay {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in); // creates keyboard scanner
		
		int pennies = 1; //daily wage
		int daysWorked = 0; //days worked
		int total = 0; //total pennies accumulated
		double salary = 0; //salary earned from pennies
		
		/*
		 * While loop to validate user input
		 */
		while (daysWorked < 1) {
			System.out.println("Enter days worked");
			daysWorked = kb.nextInt();
		}
		
		System.out.println("Day \t Pennies Earned");
		
		/*
		 * For loop creates a table, calculates 
		 * pennies earned everyday, doubles pennies 
		 * earned until count variable reaches daysWorked var
		 */
		for (int count = 1; count <= daysWorked; count++) {
			System.out.println(count + "\t" + pennies);
			total = total + pennies;
			pennies = pennies * 2;
		}
		
		/*
		 * Cast operation to divide pennies earned
		 * and then print dollar amount.
		 */
		salary = (double)total / 100.00;
		System.out.println("Total Salary: $" + salary);
		
		kb.close(); // closes keyboard
	}
	
}
