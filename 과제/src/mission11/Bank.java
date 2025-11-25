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
		
		if(money < 0 || money > 1000000) {
			System.err.println("예금액은 최대 100만원 까지만 가능합니다.");
			return;
		}		
		
		account[count++] = new Account(num, holder, money, pw);		// 계좌 객체 생성	
		System.out.println("'" + holder + "' 님의 계좌가 개설되었습니다.");	// 출력
	}
	// 입금
	public static void deposit() {
		System.out.println("============= 입금 =============");
		System.out.print("계좌번호>> ");
		String num = sc.nextLine();
		
		Account acc = find(num);		
		if(acc == null) {
			System.err.println("계좌가 없습니다!");
			return;
		}
		
		System.out.print("입금액>> ");
		long money = sc.nextLong();
		
		boolean success = acc.deposit(money);
		if(!success) {
			System.err.println("예금액은 최대 100만원 까지만 가능합니다.");
			return;
		}
		
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
		
		Account acc = find(num);
		if(acc == null) {
			System.err.println("계좌가 없습니다!");
			return;
		}		
		
		System.out.print("비밀번호>> ");
		String pw = sc.next();	
		boolean success = acc.password(pw);
		if(!success) {
			System.err.println("비밀번호가 다릅니다!");
			return;
		}

		System.out.print("출금액>> ");
		long money = sc.nextLong();
		
		boolean success2 = acc.withdraw(money);
		if(success2) {
			System.out.println("'" + acc.getAccountHolder() + "' 님의 계좌에 " + money + " 원이 출금되었습니다.");
		} else {
			System.err.println("출금 가능한 금액이 아닙니다.");
			return;
		}
		
	}
	// 계좌조회
	public static void seach() {
		System.out.println("============= 계좌조회 =============");
		System.out.print("계좌번호>> ");
		String num = sc.nextLine();
		
		Account acc = find(num);
		if(acc == null) {
			System.err.println("계좌가 없습니다!");
			return;
		}
		
		System.out.print("비밀번호>> ");
		String pw = sc.next();
		
		boolean success = acc.password(pw);
		if(!success) {
			System.err.println("비밀번호가 다릅니다!");
			return;
		}
		
		System.out.println("'" + acc.getAccountHolder() + "' 님의 계좌잔액은 " + acc.getBalance() + " 원 입니다.");
	}
	// 계좌목록
	public static void list() {
		System.out.print("관리자 비밀번호>> ");
		String admPw = sc.next();
		if(!admPw.equals("1111")) {
			System.err.println("비밀번호가 맞지 않습니다!");
			return;
		}
		System.out.println("============= 계좌목록 =============");
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
				default: System.err.println("1~6까지의 숫자를 입력해 주세요.");
			}
		}
	}
}
