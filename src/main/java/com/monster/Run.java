package com.monster;

/**
 * @author aryansh
 *
 */
public class Run {

	public static void main(String[] args) 
	
	{
		testOctalDecode1();
		testOctalDecode2();

	}
	
	 static void testOctalDecode1() 
	    {
	        String input = "31646541";
	        byte[] original =  EncoderDecoder.decode(input, Base8.getInstance());
	        EncoderDecoder.iteration(input, original);
	    }

	  static void testOctalDecode2() {
	        String input = "116311474231113516702134342400414143206126403671660545535070012425145143"
	                + "3665154621070427104557201067171276700627170465777043334607301704736021762"
	                + "6325467150763006577133541526554667660414027165423126701315057614760526500"
	                + "0452421616177052165224543311447543654741617367042213645643631333465753306"
	                + "2163564254163664432653550166600433332675642447003252221104064117622317044"
	                + "717471253";
	        byte[] original =  EncoderDecoder.decode(input, Base8.getInstance());
	        EncoderDecoder.iteration(input, original);
	    }

  
}
