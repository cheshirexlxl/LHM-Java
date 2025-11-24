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
		System.out.println("============= 입금 =============");
		System.out.print("계좌번호>> ");
		String num = sc.nextLine();
		System.out.print("입금액>> ");
		long money = sc.nextLong();
		
		Account acc = find(num);
		System.out.println("'" + acc.getAccountHolder() + "' 님에게 입금하는게 맞으십니까?");
		System.out.println("1. 예");
		System.out.println("2. 아니오");
		System.out.print("입력>> ");
		int yn = sc.nextInt();
		switch (yn) {
			case 1: 
				System.out.println("'" + acc.getAccountHolder() + "' 님의 계좌에 " + money + " 원이 입금되었습니다.");
				break;
			case 2:				
				break;
		}
		
	}
	// 출금
	public static void withdraw() {
		System.out.println("============= 출금 =============");
		System.out.print("계좌번호>> ");
		String num = sc.nextLine();
		System.out.print("비밀번호>> ");
		String pw = sc.next();
		
		Account acc = find(num);
		if(!acc.getPassword().equals(pw)) {
			System.err.println("비밀번호가 다릅니다.");
			return;
		}
		
		System.out.print("출금액>> ");
		long money = sc.nextLong();
		System.out.println("'" + acc.getAccountHolder() + "' 님의 계좌에 " + money + " 원이 출금되었습니다.");
	}
	// 계좌조회
	public static void seach() {
		System.out.println("============= 계좌조회 =============");
		System.out.print("계좌번호>> ");
		String num = sc.nextLine();
		System.out.print("비밀번호>> ");
		String pw = sc.next();
		
		Account acc = find(num);
		if(!acc.getPassword().equals(pw)) {
			System.err.println("비밀번호가 다릅니다.");
			return;
		}
		
		System.out.println("'" + acc.getAccountHolder() + "' 님의 계좌잔액은 " + acc.getBalance() + " 원 입니다.");
	}
	// 계좌목록
	public static void list() {
		System.out.print("관리자 비밀번호>> ");
		String admPw = sc.next();
		System.out.println("============= 계좌목록 =============");
//		System.out.println("예금주\t계좌번호\t\t잔고\t");
//		for (int i = 0; i < count; i++) {			
//			System.out.println(account[i].getAccountHolder() + "\t" + 
//							   account[i].getAccountNumber() + "\t" + 
//							   account[i].getBalance());
//		}
		System.out.printf("%-10s %-15s %-10s\n", "예금주", "계좌번호", "잔고");
		for(int i = 0; i < count; i++) {
			System.out.printf("%-10s %-15s %-10d\n",
					account[i].getAccountHolder(),
					account[i].getAccountNumber(),
					account[i].getBalance());
		}
		
	}
	// 계좌찾기
	public static Account find(String num) {
		for (int i = 0; i < count; i++) {
			if(account[i].getAccountNumber().equals(num)) {
				return account[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
				
		while(true) {
			menu();
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
				case 1: // 계좌등록
						add(); break;
				case 2: // 입금
						deposit(); break;
				case 3: // 출금
						withdraw();	break;
				case 4: // 계좌조회
						seach(); break;
				case 5: // 계좌목록
						list();	break;
				case 6: // 종료
						System.out.println("시스템을 종료합니다.");						
						return;
			}
		}
	}
}
