package algorithms.warmup.isFibo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        List<Long> fibonacciNumbersList = new ArrayList<>();
        fibonacciNumbersList.add((long) 0);
        fibonacciNumbersList.add((long) 1);
        Scanner input = new Scanner(System.in);
        int numberOfTestCases = input.nextInt();
        for (int i = 0; i < numberOfTestCases; i++) {

            long isFibonacciNumber = input.nextLong();
            int count = 2;
            while (true) {

                if (isFibonacciNumber == 0 || isFibonacciNumber == 1) {

                    System.out.println("IsFibo");
                    break;

                }
                if (fibonacciNumbersList.size() == count) {

                    fibonacciNumbersList
                            .add((fibonacciNumbersList.get(count - 1) + fibonacciNumbersList.get(count - 2)));

                }
                if (!(fibonacciNumbersList.get(count) < isFibonacciNumber)) {

                    if (fibonacciNumbersList.get(count) == isFibonacciNumber) {

                        System.out.println("IsFibo");
                        break;

                    }
                    else {

                        System.out.println("IsNotFibo");
                        break;

                    }

                }
                count++;

            }

        }
        input.close();

    }

}