package contests.thirtyDaysOfCode.dayTwentySix;

import java.util.Scanner;

/**
 * Created by Nick on 1/29/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int dayOne = input.nextInt();
        int monthOne = input.nextInt();
        int yearOne = input.nextInt();
        input.nextLine();
        int dayTwo = input.nextInt();
        int monthTwo = input.nextInt();
        int yearTwo = input.nextInt();

        if (yearOne <= yearTwo) {

            if (monthOne <= monthTwo) {

                if (dayOne <= dayTwo) {

                    System.out.println(0);

                }
                else {

                    System.out.println(15 * (dayOne - dayTwo));

                }

            }
            else {

                System.out.println(500 * (monthOne - monthTwo));

            }

        }
        else {

            System.out.println(10000);

        }

    }

}