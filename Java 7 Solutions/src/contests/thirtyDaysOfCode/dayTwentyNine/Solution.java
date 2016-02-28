package contests.thirtyDaysOfCode.dayTwentyNine;

import java.util.Scanner;

/**
 * Created by Nick on 1/29/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfTests = input.nextInt();
        input.nextLine();
        for (int i = 0; i < numberOfTests; i++) {

            String word = input.nextLine();
            String reversed = new StringBuilder(word).reverse().toString();
            boolean funny = true;
            for (int j = 0; j < word.length() - 1; j++) {

                if (Math.abs(word.charAt(j + 1) - word.charAt(j)) !=
                        Math.abs(reversed.charAt(j + 1) - reversed.charAt(j))) {

                    funny = false;

                }

            }
            if (funny) {

                System.out.println("Funny");

            }
            else {

                System.out.println("Not Funny");

            }

        }

    }

}