package contests.thirtyDaysOfCode.dayTwentyFive;

import java.util.Scanner;

/**
 * Created by Nick on 1/29/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfNumbers = input.nextInt();
        for (int i = 0; i < numberOfNumbers; i++) {

            int number = input.nextInt();
            double squareRoot = Math.sqrt(number);
            boolean prime = true;
            if (number > 3) {
                for (int j = 2; j < squareRoot; j++) {

                    if (number % j == 0) {

                        prime = false;

                    }

                }
            }
            if (prime && number != 1) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not prime");
            }

        }

    }

}