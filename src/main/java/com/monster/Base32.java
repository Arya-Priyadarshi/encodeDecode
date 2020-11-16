package com.monster;

import java.math.BigInteger;

/**
 * @author aryansh
 *
 */
class Base32 extends Base {
    private static final char[] CHAR_SET = {
            'A','B','C','D','E','F','G','H',
            'I','J','K','L','M','N','O','P',
            'Q','R','S','T','U','V','W','X',
            'Y','Z','2','3','4','5','6','7'
    };

    private Base32(){
        super.BASE = BigInteger.valueOf(32);
        super.CHAR_SET = CHAR_SET;
        super.loadValueMap();
    }

    private static class Holder {
        private static final Base32 instance = new Base32();
    }

    public static Base getInstance() {
        return Holder.instance;
    }
}

