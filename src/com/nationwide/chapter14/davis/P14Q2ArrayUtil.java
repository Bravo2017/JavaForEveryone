
public class P14Q2ArrayUtil {
	static public final double DIME = .10;
	public static final double DOLLAR = 1.00;
	public final static double HALFDOLLAR = .50;
	static public final double NICKEL = .05;
	static public final double PENNY = .01;
	static public final double QUARTER = .25;

	public static double[] coins = new double[6];
	{
		fillArray();
	}

	public static double[] fillArray() {

		coins[0] = DIME;
		coins[1] = DOLLAR;
		coins[2] = HALFDOLLAR;
		coins[3] = NICKEL;
		coins[4] = PENNY;
		coins[5] = QUARTER;

		return coins;
	}

	public static void swap(double[] coins, int firstPosSwap, int secondPosSwap) {
		double temp = coins[firstPosSwap];
		coins[firstPosSwap] = coins[secondPosSwap];
		coins[secondPosSwap] = temp;
	}
}
