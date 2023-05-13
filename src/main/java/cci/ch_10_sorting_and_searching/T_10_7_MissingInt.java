package cci.ch_10_sorting_and_searching;

public class T_10_7_MissingInt {

    /*
    * Case 1. Four billion non-negative integers and 1 GB RAM
    * 1 GB memory is      2^33 bits (2^30 * 2^3 bits)
    * positive ints are   2^31 bits
    * Meaning positive ints fit in 1GB BitSet
    * */
    public static int findMissingInt(int[] ints) {
        return finMissingInt(ints, 0, Integer.MAX_VALUE);
    }

    private static int finMissingInt(int[] ints, int min, int max) {
        BitSet bitSet = new BitSet(max);
        for (int i : ints) {
            if (min <= i && i <= max) {
                bitSet.set(i - min);
            }
        }
        int range = max - min;
        for (int k = 0; k < range; k++) {
            if (!bitSet.get(k)) {
                return k + min;
            }
        }
        return -1;
    }

    /*
    * Case 2 One billion of distinct ints in file and 10 MB RAM.
    * 10 MB memory is      10 * 2^23 bits (10 * 2^20 * 2^3 bits)
    * positive ints are    2^31 bits
    *
    * Optimal SegmentSize for both steps : ss = 2^36 / ss = 2^18 = 262144
    *
    * Step1 RAM = 2^36 / 2^18 bits = 2^18 bits = 2^15 bytes = 32 KB
    * Step2 RAM =                  = 2^18 bits = 2^15 bytes = 32 KB
    *
    * */
    public static int findMissingIntWithLowMem(int[] ints) {
        int segmentSize = 1 << 18;

        int foundSegment = findSegmentWithMissingInt(ints, segmentSize);
        if (foundSegment == -1) {
            return -1;
        }

        int min = foundSegment * segmentSize;
        int max = min + segmentSize;
        return finMissingInt(ints, min, max);
    }

    private static int findSegmentWithMissingInt(int[] ints, int segmentSize) {
        int[] segments = new int[(Integer.MAX_VALUE / segmentSize) + 1];

        for (int i : ints) {
            int segmentInd = i / segmentSize;
            segments[segmentInd]++;
        }
        for (int i = 0; i < segments.length; i++) {
            if (segments[i] < segmentSize) {
                return i;
            }
        }
        return -1;
    }

}
