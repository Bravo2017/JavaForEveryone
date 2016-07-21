/**
 * Modify the selection sort algorithm to sort an array of coins by their value.
 * 
 * @author DAVISK51
 * 
 */
public class P14Q2Sort {

	public static void sort(double[] coins) {
		for (int firstPosSwap = 0; firstPosSwap < coins.length - 1; firstPosSwap++) {
			int minPos = minimumPosition(coins, firstPosSwap);
			P14Q2ArrayUtil.swap(coins, minPos, firstPosSwap);
		}
	}

	private static int minimumPosition(double[] coins, int from) {
		int minPos = from;
		for (int firstPosSwap = from + 1; firstPosSwap < coins.length; firstPosSwap++) {
			if (coins[firstPosSwap] < coins[minPos]) {
				minPos = firstPosSwap;
			}
		}
		return minPos;
	}

}
