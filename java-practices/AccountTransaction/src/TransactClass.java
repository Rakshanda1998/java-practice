import java.util.Scanner;

public class TransactClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ActTransact actr = new ActTransact("1000321", 5000);

		int acpik;
		int amt;

		System.out.println("Enter the Account Number ");
		String accountNum = scn.nextLine();

		System.out.println("Enter the Account Balance ");
		int bal = Integer.parseInt(scn.nextLine());
		System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount ");
		acpik = scn.nextInt();
		switch (acpik) {

		case 1:
			if (acpik == 1) {
				System.out.println("Enter the amount to deposit");
				amt = scn.nextInt();
				actr.deposit(amt);
				break;
			}

		case 2:
			if (acpik == 2) {
				System.out.println("Enter the amount to withdraw");
				amt = scn.nextInt();
				actr.withdraw(amt);
				break;
			}
		default:
			System.out.println("Sorry...!!! Worng enter");
			break;
		}

	}

}