package mission09;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Object[]> list = new ArrayList<>();		
		
		int money = 50000;			// 화폐단위
		int count = 0;				// 화폐매수		
		
		while(sc.hasNext()) {
			String name = sc.next();	// 성명 입력
			
			if(name.equals("QUIT")) {				
				break;
			}			
			
			int N = sc.nextInt();		// 간식비 입력
			list.add(new Object[]{name, N});
		}
		
		
		for (Object[] entry : list) {
		    System.out.println(entry[0] + " " + entry[1]);
		}
		sc.close();
	}
}
