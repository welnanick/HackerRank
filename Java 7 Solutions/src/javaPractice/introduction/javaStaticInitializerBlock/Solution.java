package javaPractice.introduction.javaStaticInitializerBlock;

import java.util.Scanner;

/**
 * Created by Nick on 3/24/2016.
 */
public class Solution {

    public static Scanner input = new Scanner(System.in);
    private static int B = input.nextInt();
    private static int H = input.nextInt();
    private static boolean flag = false;

    static {

        if (B > 0 && H > 0) {

            flag = true;

        }
        else {

            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }

    }

    /**
     * Pulled from Hacker Rank Exercise
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        if (flag) {

            int area = B * H;
            System.out.print(area);

        }

    }

}