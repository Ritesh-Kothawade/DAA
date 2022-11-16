package Recursion;

import java.util.Scanner;

public class Fibonacci_Using_Rescursion {

	
	public static int Fibonacci_Series(int n) 
	{
		if (n <= 1) {
            return n;
		}
        return Fibonacci_Series(n - 1) + Fibonacci_Series(n - 2);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int N = sc.nextInt();
		sc.close();
		  
		for(int i = 0; i < N; i++) 
		{
			System.out.print(Fibonacci_Series(i) + " ");
		}	

	}

}
