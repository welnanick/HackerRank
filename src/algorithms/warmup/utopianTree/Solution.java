package algorithms.warmup.utopianTree;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numberOfTestCases = input.nextInt();
		for(int i = 0; i < numberOfTestCases; i++)
		{
			int treeHeight = 1;
			int numberOfCycles = input.nextInt();
			for (int j = 1; j <= numberOfCycles; j++)
			{
				if (j%2 == 0)
				{
					treeHeight++;
				}
				else
				{
					treeHeight = treeHeight*2;
				}
			}
			System.out.println(treeHeight);
		}
		input.close();
	}
}
