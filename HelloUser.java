import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		System.out.print("Ievadiet savu vārdu un uzvārdu ar atstarpi: ");

		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		scan.close();
		
		if (name.contains(" ") == false) {
			System.err.println("Ievadiet atstarpi!");
			System.exit(0);
		} 
		
		int space = name.indexOf(" ");
		int length = name.length();
		int start = 0;

		String firstName = name.substring(start, space);
		String lastName = name.substring(space + 1, length);
		String firstLetter = name.substring(start, start + 1);

		if (start == 0) {
			System.out.println("'" + firstLetter.toUpperCase() + firstName.substring(1, space).toLowerCase() + "'");
		}

		if (name.contains(" ")) {
			System.out.println("'" + lastName.toUpperCase() + "'");
		}
	}

}
