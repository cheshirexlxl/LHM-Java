package _1502;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		int k = 1;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[j][i] = k++;	// i <==> j 위치만 변경			
			}		
		}	
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}	
			System.out.println();
		}
		sc.close();
	}	
}
