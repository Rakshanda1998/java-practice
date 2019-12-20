import java.util.Scanner;
class compareint {
	public static void main(String...arg) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a = Integer.parseInt(s.nextLine());
		
		System.out.println("Enter the second number");
		int b = Integer.parseInt(s.nextLine());
		   
	    if(a<b) {
			System.out.println(a+" is less than " +b);
		}
		else if(a==b) {
			System.out.println(a+" is equal to "+b);
		}
		else if(a>b) {
			System.out.println(a+" is greater than "+b);
		}
		else {
			System.out.println("No nehative numberss");
		}
	}
}
			