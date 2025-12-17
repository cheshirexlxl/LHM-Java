package _1020;

import java.util.Scanner;

/**
 * 주민번호를 입력받아 형태를 바꿔 출력해보자.
 * 주민번호 앞 6자리와 뒷 7자리가 '-'로 구분되어 입력된다.
 * '-'를 제외한 주민번호 13자리를 모두 붙여 출력한다.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] parts = input.split("-"); 
		String a = parts[0];
		String b = parts[1];
		System.out.println(a + b);
		
		sc.close();
	}
}
