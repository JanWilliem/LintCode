package playground;

import java.text.DecimalFormat;

public class Pow {
	public static void main(String[] args) {
		getPriceValue();
	}

	/**
	 * Get Price Value.
	 * 
	 * @param amount
	 * @return
	 */
	private static String getPriceValue() {
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		long decimalPlaceCount = 3;
		double placeCountNumber = Math.pow(10, decimalPlaceCount);
		String priceValue = decimalFormat.format(12995
				/ placeCountNumber);
		System.err.println(priceValue);
		return priceValue;
	}
		
}
