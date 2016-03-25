package algorithms.warmup.fillingJars;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfJars = input.nextInt();
        int numberOfOperations = input.nextInt();
        long sum = 0;
        for (int i = 0; i < numberOfOperations; i++) {

            int startIndex = input.nextInt();
            int endIndex = input.nextInt();
            int numberOfCandiesToAdd = input.nextInt();
            long numberOfJarsFilled = endIndex - startIndex + 1;
            sum += (numberOfJarsFilled * numberOfCandiesToAdd);

        }
        sum = (long) Math.floor(sum / (numberOfJars * 1.0));
        System.out.println(sum);
        input.close();

    }

}