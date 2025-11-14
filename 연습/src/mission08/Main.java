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
				for (int j = 0; j < N; j++) {
					arr[i][j] = num++;
				}				
			}
			else {
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
