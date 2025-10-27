package day06.Ex04_중첩인터페이스;

// K에 ctrl + 1 + 엔터
public class K implements I.J {

	@Override
	public void methodA() {
		System.out.println("중첩 인터페이스 - methodA()");		
	}

	@Override
	public void methodB() {
		System.out.println("중첩 인터페이스 - methodB()");			
	}

	
	
}
