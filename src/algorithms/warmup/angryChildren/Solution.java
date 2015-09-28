package algorithms.warmup.angryChildren;

import java.util.Random;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numberOfNumbers = input.nextInt();
		int numberOfKids = input.nextInt();
		int[] numbers = new int[numberOfNumbers];
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = input.nextInt();
		}
		quickSortRecursive(numbers, 0, numbers.length-1);
		int leastUnfairNumber = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length-(numberOfKids-1); i++)
		{
			int tempAnswer = numbers[i + (numberOfKids-1)] - numbers[i];
			if (tempAnswer < leastUnfairNumber)
			{
				leastUnfairNumber = tempAnswer;
			}
		}
		System.out.println(leastUnfairNumber);
		input.close();
	}
	
	private static void quickSortRecursive(int[] array, int startIndex, int endIndex)
	{
		if (startIndex < endIndex)
		{
			int pivot = partition(array, startIndex, endIndex);
			quickSortRecursive(array, startIndex, pivot-1);
			quickSortRecursive(array, pivot+1, endIndex);
		}
	}

	private static int partition(int[] array, int startIndex, int endIndex)
	{
		int pivotIndex = chooseRandomPivot(startIndex, endIndex);
		int pivotValue = array[pivotIndex];
		swap(array, pivotIndex, endIndex);
		int leftHalfIndex = startIndex;
		for (int i = startIndex; i < endIndex; i++)
		{
			if (array[i] < pivotValue)
			{
				swap(array, i, leftHalfIndex);
				leftHalfIndex++;
			}
		}
		swap(array, leftHalfIndex, endIndex);
		return leftHalfIndex;
	}

	private static void swap(int[] array, int pivotIndex, int endIndex)
	{
		int temp = array[endIndex];
		array[endIndex] = array[pivotIndex];
		array[pivotIndex] = temp;
	}

	private static int chooseRandomPivot(int startIndex, int endIndex)
	{
		Random randomNumberGenerator = new Random();
		int numberOfIndexes = endIndex - startIndex;
		int randomIndex = randomNumberGenerator.nextInt(numberOfIndexes+1);
		return randomIndex+startIndex;
	}
}