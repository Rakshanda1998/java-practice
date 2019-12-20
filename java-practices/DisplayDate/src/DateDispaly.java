import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DateDispaly {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String d;
		d = s.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d,yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(d, formatter);
		System.out.println(date);

	}

}