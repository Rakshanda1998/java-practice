import java.util.*;

public class CardClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Card c1 = new MembershipCard("Collin" , "45678" , "20/11/2021" , 10);
		Card c2 = new PaybackCard("Anandhi" , "12345" , "14/01/2020", 1000, 50000);

		System.out.println("Select the Card \r\n" + "\r\n" + "1.Payback Card \r\n" + "\r\n" + "2.Membership Card ");
		int menu = Integer.parseInt(s.nextLine());

		switch (menu) {
		case 1:
			if (menu == 1) {
				System.out.print("Enter the Card Details:");
				String name = s.nextLine();
				c2.setHolderName(name);
				String number = s.nextLine();
				c2.setCardNumber(number);
				String d = s.nextLine();
				c2.setExpiryDate(d);

				System.out.println("Enter points in card  ");
				int point = Integer.parseInt(s.nextLine());

				System.out.println("Enter Amount  ");
				double amt = Double.parseDouble(s.nextLine());
				c2.display();
				break;
			}
		case 2:
			if (menu == 2) {
				System.out.print("Enter the Card Details:");
				String name1 = s.nextLine();
				c1.setHolderName(name1);
				String number1 = s.nextLine();
				c1.setCardNumber(number1);
				String d1 = s.nextLine();

				c1.setExpiryDate(d1);

				System.out.println("Enter rating in card  ");
				long rate = Long.parseLong(s.nextLine());
				c1.display();
				break;
			}
		default:
			System.out.println("Invalid Data");
			break;
		}

	}

}
