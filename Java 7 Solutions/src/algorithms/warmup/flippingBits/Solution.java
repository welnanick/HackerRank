package algorithms.warmup.flippingBits;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfInputs = input.nextInt();
        for (int i = 0; i < numberOfInputs; i++) {

            long initialNumber = input.nextLong();
            long flippedNumber = ~initialNumber;
            long unsignedNumber = flippedNumber & 0xffffffffl; //trick to interpret as unsigned long
            System.out.println(unsignedNumber);

        }
        input.close();

    }

}