package mission03;

public class Main {
	public static void main(String[] args) {		
		for (int i = 0; i <= 100; i++) {
			// 십의 자리수 : i / 10
			// 일의 자리수 : i % 10
			int ten = i / 10;
			int one = i % 10;
			
			boolean ten369 = (ten == 3 || ten == 6 || ten == 9);
			boolean one369 = (one == 3 || one == 6 || one == 9);
			
			if( ten369 && one369 ) 
				System.out.println("**");
			else if( ten369 || one369 )
				System.out.println("*");
			else
				System.out.println(i);			
		}	
	}
}
