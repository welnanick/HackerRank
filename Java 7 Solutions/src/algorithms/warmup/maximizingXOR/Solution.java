package algorithms.warmup.maximizingXOR;

import java.util.Scanner;

public class Solution {

    static int maxXor(int left, int right) {

        int max = 0;
        for (int i = left; i <= right; i++) {

            for (int j = i; j <= right; j++) {

                int tempResult = i ^ j;
                if (tempResult > max) {

                    max = tempResult;

                }

            }

        }
        return max;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int left = input.nextInt();
        int right = input.nextInt();
        System.out.println(maxXor(left, right));
        input.close();

    }

}