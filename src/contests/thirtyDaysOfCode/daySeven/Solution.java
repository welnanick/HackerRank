package contests.thirtyDaysOfCode.daySeven;

import java.util.Scanner;

/**
 * Created by Nick on 1/28/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfNumbers = input.nextInt();
        int[] numbers = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 1; i <= numberOfNumbers; i++) {
            System.out.print(numbers[numberOfNumbers - i]);
            if (!(i == numberOfNumbers)) {
                System.out.print(" ");
            }
        }

    }

}