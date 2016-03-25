package contests.thirtyDaysOfCode.dayTen;

import java.util.Scanner;

/**
 * Created by Nick on 1/28/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfTests = input.nextInt();
        for (int i = 0; i < numberOfTests; i++) {

            int baseTenNumber = input.nextInt();
            String baseTwoNumber = "";
            while (baseTenNumber != 0) {

                baseTwoNumber = baseTenNumber % 2 + baseTwoNumber;
                baseTenNumber = baseTenNumber / 2;

            }
            System.out.println(baseTwoNumber);

        }

    }

}