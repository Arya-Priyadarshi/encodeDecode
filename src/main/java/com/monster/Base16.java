package com.monster;

import java.math.BigInteger;

/**
 * @author aryansh
 *
 */
class Base16 extends Base {
    private static final char[] CHAR_SET = {
            '0','1','2','3','4','5','6','7',
            '8','9','A','B','C','D','E','F'
    };


    private Base16(){
        super.BASE = BigInteger.valueOf(16);
        super.CHAR_SET = CHAR_SET;
        super.loadValueMap();
    }

    private static class Holder {
        private static final Base16 instance = new Base16();
    }

    public static Base getInstance() {
        return Holder.instance;
    }

}
