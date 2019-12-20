import java.util.*;

public class CricketClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Delivery d = new Delivery();

		System.out.println("Menu \n1.Player details of the delivery\n" + "\n" + "2.Run details of the delivery ");
		int choice = Integer.parseInt(s.nextLine());
		switch (choice) {
		case 1:
			if (choice == 1) {
				System.out.println("Enter the bowler name ");
				String bowl = s.nextLine();
				System.out.println("Enter the batsman name ");
				String bat = s.nextLine();

				d.displayDetails(bowl, bat);
				break;
			}
		case 2:
			if (choice == 2) {
				System.out.println("Enter the number of runs ");
				long run = Long.parseLong(s.nextLine());
				d.displayDetails(run);
				if (run == 6) {

					System.out.println("It is a Sixer.");

				} else if (run == 4) {

					System.out.println("It is a boundary.");
				}

				break;
			}
		default:
			System.out.println("Invalid Data");
			break;
		}

	}

}

/*
String myStringOfWords = "This is my string of words as an example";
String[] words = myStringOfWords.split(" ");

for(String eachWord : words) {
	System.out.println(eachWord);
}*/