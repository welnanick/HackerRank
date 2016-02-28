package javaPractice.introduction.javaOutputFormatting;

/**
 * Created by Nick on 9/29/2015.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String string = input.next();
            int number = input.nextInt();
            String row = "";
            row += string;
            for (int j = 0; j < 15 - string.length(); j++) {
                row += " ";
            }
            String numberString = Integer.toString(number);
            String printMe = "";
            for (int k = 0; k < 3 - numberString.length(); k++) {
                printMe += "0";
            }
            printMe += numberString;
            System.out.println(row + printMe);
        }
        System.out.println("================================");

    }
}