package contests.thirtyDaysOfCode.dayTwenty;

import java.util.Scanner;

/**
 * Created by Nick on 1/28/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] split = sentence.split("[^A-Za-z]");
        int wordCount = 0;
        for (int i = 0; i< split.length; i++) {

            if (!split[i].equals("")) {

                wordCount++;

            }

        }
        System.out.println(wordCount);
        for (int i = 0; i< split.length; i++) {

            if (!split[i].equals("")) {

                System.out.println(split[i]);

            }

        }

    }

}