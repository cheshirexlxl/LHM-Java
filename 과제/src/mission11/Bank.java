package mission11;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		Account account = new Account();
		
		while (true) {
			System.out.println("====================================");
			System.out.println("1. 계좌등록");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 계좌조회");
			System.out.println("5. 계좌목록");
			System.out.println("6. 종료");
			System.out.print("입력>> ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
				case 1: // 계좌등록
						System.out.println("test1");					
						break;
				case 2: // 입금
						System.out.print("계좌번호>> ");
						int num = sc.nextInt();
						System.out.print("입금액>> ");
						int pay = sc.nextInt();
						account.depositChek(pay);
						int yn = sc.nextInt();
						switch (yn) {
							case 1:
								account.deposit(pay);
								break;
							case 2:
								System.out.println("test");
								break;
						}
						break;
				case 3: // 출금
						System.out.println("test3");
						break;
				case 4: // 계좌조회
						System.out.println("test4");
						break;
				case 5: // 계좌목록
						System.out.println("test5");
						break;
				case 6: // 종료
						System.out.println("시스템을 종료합니다.");
						sc.close();
						return;
			}
		}
		
		// sc.close();
	}
}
