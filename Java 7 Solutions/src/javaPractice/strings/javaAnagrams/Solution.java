package javaPractice.strings.javaAnagrams;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nick on 3/24/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        int[] aCount = new int[26];
        int[] bCount = new int[26];
        countLetters(a, aCount);
        countLetters(b, bCount);
        if (Arrays.equals(aCount, bCount)) {

            System.out.println("Anagrams");

        }
        else {

            System.out.println("Not Anagrams");

        }

    }

    private static void countLetters(String word, int[] countStorage) {

        for (int i = 0; i < word.length(); i++) {

            int index = word.toLowerCase().charAt(i) - 'a';
            countStorage[index]++;

        }

    }

}