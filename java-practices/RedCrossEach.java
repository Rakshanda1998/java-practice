import java.util.*;
class RedCrossEach {
	public static void main(String...arg) {
		Scanner s = new Scanner(System.in);
		
		int tent = s.nextInt(); {
			int[] ar = new int[tent];
			int total = 0;
			
			for(int i=0; i<ar.length; i++) {
				ar[i] = s.nextInt();
			}
			for(int x:ar) {
				total = total + x;
			}
			System.out.println(total);
		}
	}
}