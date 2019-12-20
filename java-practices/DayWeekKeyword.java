import java.util.*;
class DayWeekKeyword {
	public static void main(String...arg) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the day number");
		int num = Integer.parseInt(s.nextLine());
		String[] a = new String[8];
		a[0] = "";
		a[1] = "Sun";
		a[2] = "Mon";
		a[3] = "Tue";
		a[4] = "wed";
		a[5] = "Thu";
		a[6] = "Fri";
		a[7] = "Sat";
		
		for (; num < a.length;) {
			System.out.println("Day of the week is "+a[num]);
			break;
		}
	}
}