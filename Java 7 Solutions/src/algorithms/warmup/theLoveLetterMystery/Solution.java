package algorithms.warmup.theLoveLetterMystery;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfTestCases = input.nextInt();
        for (int i = 0; i < numberOfTestCases; i++) {

            String turnIntoPalindrome = input.next();
            int half = (int) Math.ceil(((turnIntoPalindrome.length() * 1.0) / 2));
            String firstHalf = turnIntoPalindrome.substring(0, half);
            String secondHalf = turnIntoPalindrome.substring(half);
            String temp = "";
            for (int j = secondHalf.length() - 1; j >= 0; j--) {

                temp = temp + secondHalf.charAt(j);

            }
            secondHalf = temp;
            int numberOfOperations = 0;
            for (int k = 0; k < secondHalf.length(); k++) {

                int first = firstHalf.charAt(k);
                int second = secondHalf.charAt(k);
                numberOfOperations += Math.abs((second - first));

            }
            System.out.println(numberOfOperations);

        }
        input.close();

    }

}