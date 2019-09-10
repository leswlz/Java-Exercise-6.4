import java.util.Scanner;
public class Calculation_3 {
	public static void main(String[] args) {
		int number_1 = 0, number_2 = 0;
		Scanner reader = new Scanner(System.in);
		System.out.print("Choose from the following calculations:\r\n" + 
				"1: subtraction\r\n" + 
				"2: addition\r\n" + 
				"3: multiplication\r\n" + 
				"4: division\r\n" + 
				"5: remainder\r\n\n");
		System.out.print("Make your choice: ");
		int choice = reader.nextInt();
		if (choice >= 1 && choice <= 5) {
			switch (choice) {
			case 1:
				System.out.print("\nType in the first number: ");
				number_1 = reader.nextInt();
				System.out.print("Type in the second number: ");
				number_2 = reader.nextInt();
				System.out.print("\n" + number_1 + " - " + number_2 + " = " + (number_1 - number_2));
				break;
			case 2:
				System.out.print("\nType in the first number: ");
				number_1 = reader.nextInt();
				System.out.print("Type in the second number: ");
				number_2 = reader.nextInt();
				System.out.print("\n" + number_1 + " + " + number_2 + " = " + (number_1 + number_2));
				break;
			case 3:
				System.out.print("\nType in the first number: ");
				number_1 = reader.nextInt();
				System.out.print("Type in the second number: ");
				number_2 = reader.nextInt();
				System.out.print("\n" + number_1 + " * " + number_2 + " = " + (number_1 * number_2));
				break;
			case 4:
				System.out.print("\nType in the first number: ");
				number_1 = reader.nextInt();
				System.out.print("Type in the second number: ");
				number_2 = reader.nextInt();
				System.out.print("\n" + number_1 + " / " + number_2 + " = " + ((double)number_1 / number_2));
				break;
			case 5:
				System.out.print("\nType in the first number: ");
				number_1 = reader.nextInt();
				System.out.print("Type in the second number: ");
				number_2 = reader.nextInt();
				System.out.print("\n" + number_1 + " % " + number_2 + " = " + (number_1 % number_2));
				break;
			}
		} else {
				System.out.println("\nInvalid choice.");
		}		
	}
}