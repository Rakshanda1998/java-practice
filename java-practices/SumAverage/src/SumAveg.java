import java.util.ArrayList;
import java.util.Scanner;

public class SumAveg {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(num);

		for (int i = 0; i < num; i++) {
			list.add(s.nextInt());
		}
		double sum = 0;

		for (int i : list) {
			sum += i;
		}
		double average = sum / list.size();
		System.out.printf("%.0f \n", sum);
		System.out.printf("%.2f", average);
	}
}