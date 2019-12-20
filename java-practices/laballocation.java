import java.util.Scanner;
class laballocation {
	public static void main(String...arg) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter X");
		int x = Integer.parseInt(s.nextLine());
		
		System.out.println("Enter Y");
		int y = Integer.parseInt(s.nextLine());
		
		System.out.println("Enter Z");
		int z = Integer.parseInt(s.nextLine());
		
		if(x<y && y<2) {
			System.out.println("L1 has minimal seating capacity");
		}
		else if(y<z) {
			System.out.println("L2 has minimal seating capacity");
		}
		else {
			System.out.println("L3 has minimal seating capacity");
		}
	}
}
			