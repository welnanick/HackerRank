package javaPractice.strings.javaStringReverse;

import java.util.Scanner;

/**
 * Created by Nick on 3/24/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StringBuilder a = new StringBuilder(input.next());
        if (a.toString().equals(a.reverse().toString())) {

            System.out.println("Yes");

        }
        else {

            System.out.println("No");

        }

    }

}