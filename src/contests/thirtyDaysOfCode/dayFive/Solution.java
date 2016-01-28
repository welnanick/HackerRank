package contests.thirtyDaysOfCode.dayFive;

import java.util.Scanner;

/**
 * Created by Nick on 1/24/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfTests = input.nextInt();
        for (int i = 0; i < numberOfTests; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            for (int j = 0; j < n; j++) {
                int sum = 0;
                sum += a;
                for (int k = 0; k <= j; k++) {
                    sum += Math.pow(2, k)*b;
                }
                System.out.print(sum);
                if (j < n-1) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }

}