package _1508;

import java.util.Scanner;

public class Main {
	// arr[1][1] = arr[1][0] - arr[0][0]
	// arr[2][1] = arr[2][0] - arr[1][0]
	// arr[2][3] = arr[2][1] - arr[1][1]
	// arr[3][1] = arr[3][0] - arr[2][0]
	// arr[3][2] = arr[3][1] - arr[2][1]
	// arr[3][3] = arr[3][2] - arr[2][2]
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a[][] = new int[N][N];		
		
		for (int i = 0; i < N; i++) {
            a[i][0] = sc.nextInt();
        }

		for (int i = 1; i < N; i++) {
            for (int j = 1; j <= i; j++) {
                a[i][j] = a[i][j - 1] - a[i - 1][j - 1];
            }
        }

		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
