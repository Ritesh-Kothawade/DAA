package patterns_and_others;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a = 0, b = 1;
		
		System.out.print(a+" "+b);
		
		for (int i = 0; i < n; i++) 
		{
			int nextNumber = a + b;
			System.out.print(" "+nextNumber);
			a=b;
			b=nextNumber;
		}
		sc.close();

	}

}
