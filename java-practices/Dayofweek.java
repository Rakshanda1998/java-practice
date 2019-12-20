import java.util.*;
class Dayofweek {
	public static void main(String...arg) {
		Scanner s = new Scanner(System.in);
		
		String[] day = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		System.out.println("Enter the day number");
		int number = s.nextInt();

		
		if(number > 0 && number < 8){
			System.out.println("Day of the week is "+day[number-1]);
		}
		else {
			System.out.println("Invalid number");
		}
	}
}