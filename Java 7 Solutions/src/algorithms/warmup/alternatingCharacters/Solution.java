package algorithms.warmup.alternatingCharacters;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfTestCases = input.nextInt();
        for (int i = 0; i < numberOfTestCases; i++) {

            int numberOfDeletions = 0;
            String testString = input.next();
            for (int j = 0; j < testString.length() - 1; j++) {

                if (testString.charAt(j) == testString.charAt(j + 1)) {

                    numberOfDeletions++;

                }

            }
            System.out.println(numberOfDeletions);

        }
        input.close();

    }

}