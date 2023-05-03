package cci.ch_10_sorting_and_searching;

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
