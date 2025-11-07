package _1018;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String time = sc.nextLine();		
		String[] parts = time.split(":");
		int h = Integer.parseInt(parts[0]);
		int m = Integer.parseInt(parts[1]);	
		
		System.out.printf("%d:%d", h, m);
		
		sc.close();
	}
}
