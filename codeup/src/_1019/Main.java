package _1019;

import java.util.Scanner;

/**
 * 년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습
 * 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
 * (%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.) * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] parts = input.split("\\.");
		int y = Integer.parseInt(parts[0]);
		int m = Integer.parseInt(parts[1]);
		int d = Integer.parseInt(parts[2]);
		
		System.out.printf("%04d.%02d.%02d", y, m, d);
		
		sc.close();
	}
}
