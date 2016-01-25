package javaPractice.introduction.javaStdinAndStdout2;

import java.util.Scanner;

/**
 * Created by Nick on 9/29/2015.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.nextLine();
        double b = input.nextDouble();
        input.nextLine();
        String c = input.nextLine();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}