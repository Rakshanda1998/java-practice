import java.util.Scanner;
class SecureUrl {
	public static void main(String...arg) {
		Scanner s = new Scanner(System.in);
		  
		System.out.println("Enter the String");
		String x = s.nextLine();
		System.out.println("Enter the start string");
		String y = s.nextLine();
		 
		 if (x.startsWith(y)) {
			 System.out.println( " start with 'https' ");
		 }
		 else {
			 System.out.println( " does not start with 'https' ");
		 }
	}
}