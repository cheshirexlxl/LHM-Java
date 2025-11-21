package mission11;

import java.util.Scanner;

public class Bank {
	static Scanner sc = new Scanner(System.in);		
	static Account[] account = new Account[1000];
	static int count = 0;

	// 메뉴
	public static void menu() {
		System.out.println("===============================");
		System.out.println("1. 계좌등록");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 계좌목록");
		System.out.println("6. 종료");
		System.out.println("===============================");
		System.out.print("입력>> ");
	}
	
	// 계좌등록
	public static void add() {
		System.out.print("계좌번호>> ");
		String num = sc.nextLine();
		System.out.print("예금주>> ");
		String holder = sc.nextLine();
		System.out.print("최초예금액>> ");
		long money = sc.nextLong();
		System.out.print("비밀번호>> ");
		String pw = sc.next();
		System.out.println("'" + holder + "' 님의 계좌가 개설되었습니다.");
		
		account[count++] = new Account(num, holder, money, pw);	// 계좌 객체 생성		
	}
	// 입금
	public static void deposit() {
		
	}
	// 출금
	public static void withdraw() {
		
	}
	// 계좌조회
	public static void check() {
		
	}
	// 계좌목록
	public static void list() {
		System.out.print("관리자 비밀번호>> ");
		String admPw = sc.next();
		System.out.println("============= 계좌목록 =============");
		System.out.println("예금주\t계좌번호\t잔고\t");
		for (int i = 0; i < count; i++) {			
			System.out.println(account[i].getAccountHolder() + "\t" + 
							   account[i].getAccountNumber() + "\t" + 
							   account[i].getBalance());
		}
	}	
	
	public static void main(String[] args) {
				
		while(true) {
			menu();
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
				case 1: // 계좌등록
						add();										
						break;
				case 2: // 입금
						deposit();
						break;
				case 3: // 출금
						withdraw();						
						break;
				case 4: // 계좌조회
						check();						
						break;
				case 5: // 계좌목록
						list();						
						break;
				case 6: // 종료
						System.out.println("시스템을 종료합니다.");
						sc.close();
						return;
			}
		}
	}
}
