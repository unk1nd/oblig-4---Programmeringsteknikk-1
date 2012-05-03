package oppgave2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

						 
			System.out.println(" ___  ______  ______  ______  ______  ______  ______  ______  ______  ___");
			System.out.println("  __)(__  __)(__  __)(__  __)(__  __)(__  __)(__  __)(__  __)(__  __)(__");
			System.out.println(" (______)(______)(______)(______)(______)(______)(______)(______)(______)");

			System.out.println("                     Probeus and Unkind problem-solver                   ");
			System.out.println("Whats the problem?");
			Calculator calc = new Calculator(scan.nextLine());
			if(calc.isInputValid() == true){
				System.out.println("You entered "+ calc.getInput());
				System.out.println("Result: " + calc.getResult());
			}
			else {
				System.out.println("Ugyldig problem");
			}
			System.out.println(" ___  ______  ______  ______  ______  ______  ______  ______  ______  ___");
			System.out.println("  __)(__  __)(__  __)(__  __)(__  __)(__  __)(__  __)(__  __)(__  __)(__");
			System.out.println(" (______)(______)(______)(______)(______)(______)(______)(______)(______)");
		}
		

}
