package javaPractice.strings.javaStrings;

import java.util.Scanner;

public class Solution
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		int substringNumber = input.nextInt();
		String smallest = "zzzzzzzzzz";
		String largest = "";
		for (int i = 0; i < inputString.length()-substringNumber+1; i++)
		{
			if(inputString.substring(i, i+substringNumber).compareTo(smallest) <= 0)
			{
				smallest = inputString.substring(i, i+substringNumber);
			}
			if(inputString.substring(i, i+substringNumber).compareTo(largest) >= 0)
			{
				largest = inputString.substring(i, i+substringNumber);
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	}

}