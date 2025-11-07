package _1153;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 내 답지
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		if( a > b) {
//			System.out.println(">");
//		}
//		else if(a < b) {
//			System.out.println("<");
//		}
//		else {
//			System.out.println("=");
//		}
		
		
		
		// 선생님 답지
		
		// 입력 : 3 6
		// 변수 : a b
		// 조건 : 
		//		1) (a > b)	 	: >
		//		2) (a < b) 		: <
		//		3) (a == b)		: =
		// 반복 : X
		// 출력 : >, <, =
		int a = sc.nextInt();
		int b = sc.nextInt();
		String answer = "";
		
		if( a > b ) answer = ">";
		else if( a < b ) answer = "<";
		else answer = "=";
		System.out.println(answer);
		
		sc.close();
	}
}
