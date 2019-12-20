import java.util.*;
class RedCrossWhile {
	public static void main(String...arg) {
		Scanner s = new Scanner(System.in);
		
		int tent = s.nextInt(); {
			int[] ar = new int[tent];
			int total = 0;
			int i = 0;
			
			while (i<ar.length) {
				ar[i] = s.nextInt();
				total = total + ar[i];
				i++;
			}
			System.out.println(total);
		}
	}
}