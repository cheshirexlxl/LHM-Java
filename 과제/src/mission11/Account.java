package mission11;

/**
 * 예금액 최대 10억까지 관리 할 수 있는 통장 개설
 * 한 번에 송금할 수 있는 금액 1,000,000 원으로 제한
 * 
 * 조건
 * - ALOHA은행의 금고에는 최대1조까지 안전하게 보관할수있다. 따라서, ALOHA은행이 수용할 수 있는 최대 고객수는 1,000 명이다.
 * - Account 객체를 기본 생성 시 계좌번호, 예금주, 잔고는 각각 “계좌없음”, “이름없음“, 0 으로 초기화한다.
 * - Account 객체의 멤버변수는 Getter, Setter 메소드를 이용하여 접근한다.
 * - 잔고 직접 지정과 입금 및 출금은 허용된 금액 범위에서만 적용 가능하도록 한다.
 */
public class Account {

	private String accountNumber;	// 계좌번호
    private String accountHolder;	// 예금주
    private long balance;			// 잔고
    private String password;		// 비밀번호
	
    
    // 기본 생성자
    public Account() {
		this.accountNumber = "계좌없음";
		this.accountHolder = "이름없음";
		this.balance = 0;
		this.password = "";
	}

	public Account(String accountNumber, String accountHolder, long balance, String password) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.password = password;
	}	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// 계좌등록
	public void add() {		
		System.out.println("===============================");
		System.out.println("'" + accountHolder + "'님의 계좌가 개설되었습니다.");
	}
	
	// 입금
	public void depositChek(int amount) {
		System.out.println("============= 입금 =============");
		if (amount > 0) {			
			balance += amount;
	            System.out.println("'" + accountHolder + "'님에게 입금하는게 맞으십니까?");
	            System.out.println("1. 예");
				System.out.println("2. 아니오");
				System.out.print("입력>> "); 
        } else {
            System.err.println("유효하지 않은 입금액입니다.");
        }
	}
	
	public void deposit(int amount) {
        balance += amount;
        System.out.println("'" + accountHolder + "'님의 계좌에 " + amount + " 원이 입금되었습니다.");
	}
	
	// 출금
	public void withdraw(int amount) {
		System.out.println("============= 출금 =============");
		if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("'" + accountHolder + "'님의 계좌에 " + amount + " 원이 출금되었습니다.");
        } else {
            System.out.println("출금할 수 없습니다. 잔액이 부족하거나 유효하지 않은 금액입니다.");
        }
	}  
	
	// 계좌조회
	public void check() {
		System.out.println("============= 계좌조회 =============");
	}
	
	// 계좌목록
	public void list() {
		System.out.println("============= 계좌목록 =============");
	}    

}
