import java.util.Scanner;
class ReplaceOrganization {
	public static void main(String...arg) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the content of the document");
		String x = s.nextLine();
		
		System.out.println("Enter the old name of the company");
		String y = s.nextLine();
		
		System.out.println("Enter the name of the company");
		String z = s.nextLine();
		
		System.out.println("The content of the modified document is");
		String content = x.replace(y,z);
		
		System.out.println(content);
	}
}