package contests.thirtyDaysOfCode.daySix;

import java.util.Scanner;

/**
 * Created by Nick on 1/24/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        for (int i = 1; i <= height; i++) {

            String level = "";
            for (int j = 0; j < height - i; j++) {

                level += " ";

            }
            for (int j = 0; j < i; j++) {

                level += "#";

            }
            System.out.println(level);

        }

    }

}