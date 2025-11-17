package mission08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		int num = 1;
		
		for (int i = 0; i < N; i++) {
			if(i % 2 == 0) {
				// 짝수줄일때  0,2,4...번째줄 올림차순
				for (int j = 0; j < N; j++) {
					arr[i][j] = num++;
				}				
			}
			else {
				// 홀수줄일때 1,3,5...번째줄 내림차순
				for (int j = N - 1; j >= 0; j--) {
					arr[i][j] = num++;
				}	
			}
		}
		
		// 출력
        for (int[] row : arr) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
