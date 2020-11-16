package com.monster;

import java.math.BigInteger;

/**
 * @author aryansh
 *
 */
class Base8 extends Base {
    private static final char[] CHAR_SET = {'0', '1', '2', '3', '4', '5', '6', '7'};

    private Base8() {
        super.BASE = BigInteger.valueOf(8);
        super.CHAR_SET = CHAR_SET;
        super.loadValueMap();
    }

    public static Base getInstance() {
        return Holder.instance;
    }
    
    private static class Holder {
        private static final Base8 instance = new Base8();
    }
}