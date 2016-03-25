package contests.thirtyDaysOfCode.dayNine;

import java.util.Scanner;

/**
 * Created by Nick on 1/28/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        int gcd;

        if (x > y) {

            gcd = findGCD(x, y);

        }
        else {

            gcd = findGCD(y, x);

        }
        System.out.println(gcd);

    }

    private static int findGCD(int x, int y) {

        if (x == y) {

            return x;

        }
        else {

            int z = x - y;
            if (z > y) {

                return findGCD(z, y);

            }
            else {

                return findGCD(y, z);

            }

        }

    }

}