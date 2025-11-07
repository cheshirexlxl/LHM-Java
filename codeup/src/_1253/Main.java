package _1253;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 내 답지
//		if( a < b) {
//			for (int i = a; i <= b; i++) {			
//				System.out.print(i + " ");
//			}
//		}
//		else {			
//			for (int i = b; i <= a; i++) {			
//				System.out.print(i + " ");
//			}
//		}
		
		// 선생님 답지
		// swap ( 교환 )
		if( a > b) {
			int temp = a;
			a = b;
			b = temp;
		}		
		
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}		
		sc.close();
	}
	
}
