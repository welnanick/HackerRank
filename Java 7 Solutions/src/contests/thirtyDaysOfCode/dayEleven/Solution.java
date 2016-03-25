package contests.thirtyDaysOfCode.dayEleven;

import java.util.Scanner;

/**
 * Created by Nick on 1/28/2016.
 */
public class Solution {

    public static void main(String[] args) {

        int[][] inputArray = new int[6][6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {

                inputArray[i][j] = input.nextInt();

            }

        }

        int currentMaxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                int tempSum = inputArray[i][j] + inputArray[i][j + 1] + inputArray[i][j + 2] +
                        inputArray[i + 1][j + 1] + inputArray[i + 2][j] + inputArray[i + 2][j + 1] +
                        inputArray[i + 2][j + 2];
                if (tempSum > currentMaxSum) {

                    currentMaxSum = tempSum;

                }

            }

        }
        System.out.println(currentMaxSum);

    }

}