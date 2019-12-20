public class Profitmethod2 {
	public float calculateProfit(int x, int y, int z) {
		float cp = y/12f;
		float profit = z - cp;
		float percentage = (profit/cp)*100;
		return percentage;
		
	}
}