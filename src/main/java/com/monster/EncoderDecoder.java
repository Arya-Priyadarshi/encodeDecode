package com.monster;

import java.math.BigInteger;

/**
 * @author aryansh
 *
 */
public class EncoderDecoder {

	/**
	 * 
	 * Generic decoding method based on Based Type.
	 * 
	 *
	 * 
	 */
	public static byte[] decode(String num, Base encoder) {
		BigInteger dec_value = BigInteger.ZERO;
		BigInteger base = BigInteger.ONE;

		int temp = num.length();
		while (temp > 0) {
			BigInteger last_digit = BigInteger.valueOf(encoder.getVal(num.charAt(--temp)));
			dec_value = dec_value.add(base.multiply(last_digit));
			base = base.multiply(encoder.getBase());
		}

		return dec_value.toByteArray();
	}

	/**
	 * 
	 * 
	 * Generic encoding method which will convert bytes to corresponding Base.
	 *
	 * 
	 */
	public static String encode(byte[] byteArr, Base encoder) {
		StringBuilder result = new StringBuilder();
		BigInteger dec_value = new BigInteger(byteArr);
		BigInteger base = encoder.getBase();

		do {
			int mod = dec_value.mod(base).intValue();
			result.append(encoder.getChar(mod));
			dec_value = dec_value.subtract(BigInteger.valueOf(mod)).divide(base);
		} while (!dec_value.equals(BigInteger.ZERO));

		return result.reverse().toString();
	}

	/**
	 * 
	 * 
	 * Printing.
	 *
	 * 
	 */
	public static void iteration(String octal ,byte[] byteArr) 
	{
		System.out.println("Octal String : "+octal);
		StringBuilder result = new StringBuilder();
		result.append("{ ");
		for (byte byt : byteArr)

		{
			result.append(byt);
			result.append(",");
		}
		result.deleteCharAt(result.length()-1);
		result.append(" }");
		
		System.out.println("Decoded Value : "+result.toString());
	}
}
