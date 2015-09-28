package algorithms.warmup.lonelyInteger;

import java.util.Scanner;

public class Solution
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numberOfNumbers = input.nextInt();
		int[] numbers = new int[101];
		for(int i = 0; i < numberOfNumbers; i++)
		{
			int currentNumber = input.nextInt();
			numbers[currentNumber]++;
		}
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] == 1)
			{
				System.out.println(i);
				break;
			}
		}
		input.close();
	}
}
