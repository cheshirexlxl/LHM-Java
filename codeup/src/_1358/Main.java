package _1358;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i+=2) {		// 홀수 개씩 별이 늘어나게
			int space = (n - i) / 2;		// 좌측 공백 개수
			
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
	
}
