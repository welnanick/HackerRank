package javaPractice.strings.javaStringToken;

import java.util.Scanner;

/**
 * Created by Nick on 3/24/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        if (s.trim().equals("")) {

            System.out.println(0);

        }
        else {

            String[] tokens = s.trim().replaceAll("[ !,?._'@]+", " ").split(" ");
            System.out.println(tokens.length);
            for (String token : tokens) {

                if (!token.equals("")) {

                    System.out.println(token);

                }

            }

        }

    }

}