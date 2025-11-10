package mission02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 1;
		int sum1 = 0;	// 홀수의 합계
		int sum2 = 0;	// 짝수의 합계		
		
		// 홀수
		while ( a <= N ) {					
			if( a % 2 == 1 ) {
				System.out.print(a + "+");
				sum1 += a;
			}
			a++;
		}
		System.out.println("=" + sum1);		
		
		// 짝수
		a = 1;
		while ( a <= N ) {			
			if( a % 2 == 0 ) {
				System.out.print(a + "+");
				sum2 += a;
			}
			a++;
		}				
		System.out.println("=" + sum2);
		
		// 약수
		a = 1;
		while ( a <= N ) {			
			if( N % a == 0 ) {
				System.out.print(a + " ");				
			}
			a++;
		}
		sc.close();
	}
}
