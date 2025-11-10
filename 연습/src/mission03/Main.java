package mission03;

public class Main {
	public static void main(String[] args) {		
		for (int i = 1; i <= 100; i++) {
			if( i == 3 || i == 6 || i == 9) {
				System.out.println("*");	
			}
			else {
				System.out.println(i);	
			}
		}
	}
}
