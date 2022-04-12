package b;

import java.io.*;

public class ATM {
	int kontostand = 400;
	
	/**
	 * Main command loop of the ATM
	 * Asks the user to enter a number, and passes this number to the function cashout(...) 
	 * which actually does the calculation and produces money.
	 * If the user enters anything else than an integer number, the loop breaks 
	 * and the program exists
	 */
	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//einlesen vom eingegebenen betrag

		while(true) {
			try {
				//versuch das im try komplett auszuführen und wenn es probleme gibt mach catch
				System.out.print("Enter the amount to withdraw: ");
				//eingabe zu einem int parsen
				int amount = Integer.parseInt(br.readLine());
				//Funktionsaufruf mit dem eingegeben betrag (amount)
				cashout(amount);
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void cashout(int amount) {
		if (amount <= kontostand){
			kontostand = kontostand - amount ;
			System.out.println("Ok, here is your money, enjoy!");
		} else {
			System.out.println("Sorry, not enough money in the bank.");
		}
	};
	
	/**
	 * Launches the ATM
	 */
	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.run();
	};
};