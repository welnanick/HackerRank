package algorithms.warmup.solveMeSecond;

import java.util.Scanner;

public class Solution
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numberOfTests = input.nextInt();
		for (int i = 0; i < numberOfTests; i++)
		{
			int a = input.nextInt();
			int b = input.nextInt();
			int sum = a + b;
			System.out.println(sum);
		}
		input.close();
	}
}
