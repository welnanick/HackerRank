package javaPractice.introduction.javaDatatypes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfTests = input.nextInt();
        for (int i = 0; i < numberOfTests; i++) {
            long inputNumber;
            try {
                inputNumber = input.nextByte();
                System.out.println(inputNumber + " can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            catch (InputMismatchException e1) {
                try {
                    inputNumber = input.nextShort();
                    System.out.println(inputNumber + " can be fitted in:");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                catch (InputMismatchException e2) {
                    try {
                        inputNumber = input.nextInt();
                        System.out.println(inputNumber + " can be fitted in:");
                        System.out.println("* int");
                        System.out.println("* long");
                    }
                    catch (InputMismatchException e3) {
                        try {
                            inputNumber = input.nextLong();
                            System.out.println(inputNumber + " can be fitted in:");
                            System.out.println("* long");
                        }
                        catch (InputMismatchException e) {
                            String number = input.nextLine();
                            System.out.println(number + " can't be fitted anywhere.");
                        }
                    }
                }
            }
        }
        input.close();
    }
}