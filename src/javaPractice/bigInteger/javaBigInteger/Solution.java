package javaPractice.bigInteger.javaBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		String b = input.nextLine();
		BigInteger bigIntegerA = new BigInteger(a);
		BigInteger bigIntegerB = new BigInteger(b);
		BigInteger sum = bigIntegerA.add(bigIntegerB);
		BigInteger product = bigIntegerA.multiply(bigIntegerB);
		System.out.println(sum);
		System.out.println(product);
		input.close();
	}

}
