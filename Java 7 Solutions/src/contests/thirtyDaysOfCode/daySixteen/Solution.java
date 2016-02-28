package contests.thirtyDaysOfCode.daySixteen;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nick on 1/28/2016.
 */
public class Solution {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfnumbers = input.nextInt();
        int[] numbers = new int[numberOfnumbers];
        for (int i = 0; i < numberOfnumbers; i++) {

            numbers[i] = input.nextInt();

        }
        quickSortRecursive(numbers, 0, numbers.length - 1);
        int leastDifference = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length - 1; i++) {

            if (Math.abs((numbers[i] - numbers[i + 1])) < leastDifference) {

                leastDifference = Math.abs((numbers[i] - numbers[i + 1]));
            }

        }
        int[] pairs = new int[numbers.length];
        int numberOfPairs = 0;
        for (int i = 0; i < numbers.length - 1; i++) {

            if (Math.abs((numbers[i] - numbers[i + 1])) == leastDifference) {

                pairs[numberOfPairs * 2] = numbers[i];
                pairs[(numberOfPairs * 2) + 1] = numbers[i + 1];
                numberOfPairs++;

            }

        }

        for (int i = 0; i < numberOfPairs; i++) {

            System.out.print(pairs[i * 2] + " " + pairs[(i * 2) + 1]);
            if (i < numberOfPairs - 1) {

                System.out.print(" ");

            }

        }

    }


    /**
     * Had quicksort already implemented so I didn't use insertion sort and suggested in the exercise
     */
    private static void quickSortRecursive(int[] array, int startIndex, int endIndex) {

        if (startIndex < endIndex) {

            int pivot = partition(array, startIndex, endIndex);
            quickSortRecursive(array, startIndex, pivot - 1);
            quickSortRecursive(array, pivot + 1, endIndex);

        }

    }

    private static int partition(int[] array, int startIndex, int endIndex) {

        int pivotIndex = chooseRandomPivot(startIndex, endIndex);
        int pivotValue = array[pivotIndex];
        swap(array, pivotIndex, endIndex);
        int leftHalfIndex = startIndex;
        for (int i = startIndex; i < endIndex; i++) {

            if (array[i] < pivotValue) {

                swap(array, i, leftHalfIndex);
                leftHalfIndex++;

            }

        }
        swap(array, leftHalfIndex, endIndex);
        return leftHalfIndex;

    }

    private static void swap(int[] array, int pivotIndex, int endIndex) {

        int temp = array[endIndex];
        array[endIndex] = array[pivotIndex];
        array[pivotIndex] = temp;

    }

    private static int chooseRandomPivot(int startIndex, int endIndex) {

        Random randomNumberGenerator = new Random();
        int numberOfIndexes = endIndex - startIndex;
        int randomIndex = randomNumberGenerator.nextInt(numberOfIndexes + 1);
        return randomIndex + startIndex;

    }

}