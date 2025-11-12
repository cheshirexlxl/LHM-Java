package mission06;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
			
		int lotto[][] = new int[N][6];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < lotto[i].length; j++) {
				// 1~45 사이의 랜덤수
				lotto[i][j] = (int) (Math.random() * 45) + 1;
				// 중복제거
				for (int j2 = 0; j2 <= j-1; j2++) {
					if( lotto[i][j] == lotto[i][j2] ) {
						j--;
						break;
					}
				}
			}			
		}
		
		// 오름차순 정렬
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < lotto[i].length - 1; j++) {
				for (int j2 = j+1; j2 < lotto[i].length; j2++) {
					if( lotto[i][j] > lotto[i][j2] ) {
						int temp = lotto[i][j];
						lotto[i][j] = lotto[i][j2];
						lotto[i][j2] = temp;
					}
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i + 1) + " 게임] : ");
			for (int j = 0; j < lotto[i].length; j++) {
				System.out.print(lotto[i][j] + " ");
			}
			System.out.println();
		}
	
		sc.close();
	}	
}
