package Recursion;

import java.util.Scanner;

public class Multiplication_Recursive {

		public static int multiplyTwoIntegers(int m, int n)
		{
			if(m == 0 || n == 0)
				return 0;
			
			return n + multiplyTwoIntegers(n,m-1);
		}
		
		public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(multiplyTwoIntegers(m, n));
		s.close();
	}

}
