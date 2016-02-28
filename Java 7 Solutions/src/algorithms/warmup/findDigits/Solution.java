package algorithms.warmup.findDigits;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfInputs = input.nextInt();
        for (int i = 0; i < numberOfInputs; i++) {
            int counter = 0;
            int number = input.nextInt();
            int tempNumber = number;
            while (tempNumber > 0) {
                int currentDigit = tempNumber % 10;
                if (currentDigit > 0) {
                    if (number % currentDigit == 0) {
                        counter++;
                    }
                }
                tempNumber = tempNumber / 10;
            }
            System.out.println(counter);
        }
        input.close();
    }
}