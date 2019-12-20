import java.util.*;
class RedCrossFor {
	public static void main(String...arg) {
		Scanner s = new Scanner(System.in);
		
		int tent = s.nextInt(); 
			int[] ar = new int[tent];
			int total = 0;
			
			for(int i=0; i<ar.length; i++) {
				ar[i] = s.nextInt();
				total = total + ar[i];
			}
			System.out.println(total);
	}
}