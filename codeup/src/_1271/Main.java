package _1271;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 내 답지
//		int n = sc.nextInt();
//		
//		// 가장 큰 값을 저장할 변수 (최소값으로 초기화)
//		int max = Integer.MIN_VALUE;
//		
//		for (int i = 1; i <= n; i++) {			
//			int input = sc.nextInt();
//			
//			// 가장 큰 값 갱신
//			if (input > max) {
//                max = input;
//          }			
//		}
//		System.out.println(max);
		
		
		
		// 선생님 답지
		
		// * 최댓값
		// 입력 : 5
		//       1 2 3 4 5
		// 변수 : N, input, max
		// 조건 : 입력받은 값이랑 최댓값을 저장한 변수랑 비교 조건
		//       ( input > max ) -> max = input
		// 반복 : N번만큼 반복하면서 입력		
		// 출력 : 최댓값 : max
		int N = sc.nextInt();
		int max = 0;
		for (int i = 0; i < N; i++) {
			int input = sc.nextInt();
			if( input > max )
				max = input;
		}
		System.out.println(max);
		
		sc.close();
	}
}
