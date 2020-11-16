package com.monster;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * @author aryansh
 *
 */
abstract class Base  {
    protected static final Map<Character,Integer> VALUE_MAP = new HashMap<>();

    protected BigInteger BASE;
    protected char[] CHAR_SET;

    void loadValueMap() {
        IntStream.range(0,BASE.intValue()).forEach(i -> VALUE_MAP.put(CHAR_SET[i],i));
    }

    public BigInteger getBase(){
        return BASE;
    }

    public int getVal(char c) {
        return VALUE_MAP.get(c);
    }

    public char getChar(int v) {
        return CHAR_SET[v];
    }
}
