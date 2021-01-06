import java.util.Scanner;

public class DateValidator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ievadiet datumu: ");
		int date = scan.nextInt();
		System.out.print("Ievadiet mēnesi: ");
		int month = scan.nextInt();
		scan.close();

		if (month == 1 && date <= 31 && date > 0) {
			System.out.println(date + "." + " Janvāris");
		} else if (month == 2 && date <= 28 && date > 0) {
			System.out.println(date + "." + " Februāris");
		} else if (month == 3 && date <= 31 && date > 0) {
			System.out.println(date + "." + " Marts");
		} else if (month == 4 && date <= 30 && date > 0) {
			System.out.println(date + "." + " Aprīlis");
		} else if (month == 5 && date <= 31 && date > 0) {
			System.out.println(date + "." + " Maijs");
		} else if (month == 6 && date <= 30 && date > 0) {
			System.out.println(date + "." + " Jūnijs");
		} else if (month == 7 && date <= 31 && date > 0) {
			System.out.println(date + "." + " Jūlijs");
		} else if (month == 8 && date <= 31 && date > 0) {
			System.out.println(date + "." + " Augusts");
		} else if (month == 9 && date <= 31 && date > 0) {
			System.out.println(date + "." + " Septembris");
		} else if (month == 10 && date <= 31 && date > 0) {
			System.out.println(date + "." + " Oktobris");
		} else if (month == 11 && date <= 30 && date > 0) {
			System.out.println(date + "." + " Novembris");
		} else if (month == 12 && date <= 31 && date > 0) {
			System.out.println(date + "." + " Decembris");
		} else {
			System.out.println("Datums vai mēnesis nav derīgs.");
		}

	}

}
