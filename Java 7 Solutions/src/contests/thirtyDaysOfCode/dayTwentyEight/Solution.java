package contests.thirtyDaysOfCode.dayTwentyEight;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Nick on 1/29/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfStrings = input.nextInt();
        input.nextLine();
        for (int i = 0; i < numberOfStrings; i++) {

            String pattern = input.nextLine();

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (Exception e) {
                System.out.println("Invalid");
            }

        }

    }

}