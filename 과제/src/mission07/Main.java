package mission07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[1][5];		
		
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}			
		}
		
		// 오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int j2 = j+1; j2 < arr[i].length; j2++) {
					if( arr[i][j] > arr[i][j2] ) {
						int temp = arr[i][j];
						arr[i][j] = arr[i][j2];
						arr[i][j2] = temp;
					}
				}
				System.out.print(arr[i][j] + " ");
			}			
			System.out.println(); 
		}

		// 내림차순 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int j2 = j+1; j2 < arr[i].length; j2++) {
					if( arr[i][j] < arr[i][j2] ) {
						int temp = arr[i][j];
						arr[i][j] = arr[i][j2];
						arr[i][j2] = temp;
					}
				}
				System.out.print(arr[i][j] + " ");
			}			
		}			
		
		sc.close();
	}
}
