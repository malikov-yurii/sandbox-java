package cci.todo;

public class FindAllPermutationsOfSmallStringInBiggerString {

    /*
    "Cracking the coding interview" page 70
    B - bigger:  abaacaab
    S - smaller: baa
    Answer is indexes of found permutation starts: [0, 1, 5]
    * */


    /* TODO Implement the first solution:
    1.  Traverse B string adding to map i char and removing (i-S) char.
    When map content equals to target map content (errorCount = 0) then (i) is the end of permutation.
    * The best complexity O(B+S).
    * Count all letters in prev S letters in map.

    class CharQty { int targetQty; int currQty; }
    Map <Character, CharQty> charCounts =  new HashMap<>();
    charCounts.put('a', new CharQty(2, 0));
    charCounts.put('b', new CharQty(1, 0));
    int errorCount = 2;

    Impl hint is taken from the link below
    "use auxiliary variables: an array 𝐴 and an integer 𝑐.
    𝐴 tracks the error in the number of occurrences of each character and 𝑐 tracks the number of non-zero errors.
    Update the count of the character which drops out,
     then update 𝑐 if it changed from or to zero,
     then repeat for the character which is coming in.
    After that, if 𝑐=0 you found a permutation of
    https://cs.stackexchange.com/questions/105537/ob-algorithm-to-find-positions-of-all-permutations-of-smaller-string-in-a-bigg

    * https://codereview.stackexchange.com/questions/166845/find-all-occurrences-of-all-permutations-of-a-shorter-string-within-a-longer-str

    2.Prime numbers solution is not so good because there will be to big numbers when S is quite long or many possible char and not just a-z
    https://stackoverflow.com/questions/41515081/algorithm-find-all-permutations-of-string-a-in-string-b
    * */


}
