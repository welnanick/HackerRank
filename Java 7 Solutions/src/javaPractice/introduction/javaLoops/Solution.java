package javaPractice.introduction.javaLoops;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfTests = input.nextInt();
        for (int i = 0; i < numberOfTests; i++) {

            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            String output = "";
            for (int j = 0; j < n; j++) {

                int sum = a;
                for (int k = 0; k <= j; k++) {

                    sum += b * Math.pow(2, k);

                }
                output += sum;
                if (j != n - 1) {

                    output += " ";

                }

            }
            System.out.println(output);

        }
        input.close();

    }

}