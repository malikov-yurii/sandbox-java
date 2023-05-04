package cci.ch_10_sorting_and_searching;

public class BitSet {

    public static final int ADDRESS_BITS_PER_WORD = 5;
    public static final int BITS_PER_WORD = 1 << ADDRESS_BITS_PER_WORD;
    private final int[] words;

    public BitSet(int maxValue) {
        words = new int[maxValue >> ADDRESS_BITS_PER_WORD + 1];
    }

    public boolean get(int val) {
        int wordInd = getWordIndex(val);
        return (words[wordInd] & getMask(val)) != 0;
    }

    public void set(int val) {
        int bucketId = val / BITS_PER_WORD;
        words[bucketId] |= getMask(val);
    }

    private static int getWordIndex(int val) {
        return val >> ADDRESS_BITS_PER_WORD - 1;
    }

    private static int getMask(int val) {
        return 1 << (val & 0x1F);
    }
}
/*
 public class BitMap {
    private final byte[] bytes;

    public BitMap(int maxValue) {
        bytes = new byte[maxValue / Byte.SIZE + 1];
    }

    public boolean contains(int val) {
        int bucketId = val / Byte.SIZE;
        int mask = 1 << (val % Byte.SIZE);
        return (bytes[bucketId] & mask) != 0;
    }

    public void add(int val) {
        int bucketId = val / Byte.SIZE;
        int mask = 1 << (val % Byte.SIZE);
        bytes[bucketId] |= mask;
    }
}
*/