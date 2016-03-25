package javaPractice.strings.patternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by Nick on 3/24/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfInputs = input.nextInt();

        //get rid of the floating \n in the input
        input.nextLine();
        for (int i = 0; i < numberOfInputs; i++) {

            try {

                Pattern.compile(input.nextLine());
                System.out.println("Valid");

            }
            catch (PatternSyntaxException e) {

                System.out.println("Invalid");

            }

        }

    }

}