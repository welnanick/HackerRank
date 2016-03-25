package javaPractice.strings.javaStringsIntroduction;

import java.util.Scanner;

/**
 * Created by Nick on 3/24/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();

        System.out.println(a.length() + b.length());
        if (a.compareToIgnoreCase(b) > 0) {

            System.out.println("Yes");

        }
        else {

            System.out.println("No");

        }
        StringBuilder builder = new StringBuilder();
        builder.append(a.toUpperCase().charAt(0));
        builder.append(a.substring(1));
        builder.append(" ");
        builder.append(b.toUpperCase().charAt(0));
        builder.append(b.substring(1));
        System.out.println(builder);

    }

}