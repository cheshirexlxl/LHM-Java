package mission09;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		ArrayList<Object[]> list = new ArrayList<>();	
		int[] total = new int[10];
		
		while(sc.hasNext()) {
			String name = sc.next();	// 성명 입력			
			if(name.equals("QUIT")) {	// 성명의 입력이 "QUIT" 이면 입력의 끝	
				break;
			}						
			int N = sc.nextInt();		// 간식비 입력
			list.add(new Object[]{name, N});
		}		
		
		
		System.out.println("성명\t출장비\t오만원\t만원\t오천원\t천원\t오백원\t백원\t오십원\t십원\t오원\t일원");
		for (Object[] info : list) {	
			
		    System.out.print(info[0] + "\t" + info[1] + "\t");	// 성명, 간식비 출력	    
		    
		    int num = (int) info[1];	// 입력금액
		    int money = 50000;			// 화폐단위
			int count = 0;				// 화폐매수
			int idx = 0;			
			boolean sw = true;
		    	
		    while( money >= 1 ) {			
				// * 화폐매수 계산
				// (화폐매수) = (입력금액) / (화폐단위)
				count = num / money;				
				System.out.print(count + "\t");					 
				
				// (잔액) = (입력금액) % (화폐단위)
				num = num % money;
				
				if( sw ) {
					// (화폐단위) = (화폐단위) / 5
					money = money / 5;				
				}
				else {
					// (화폐단위) = (화폐단위) / 2
					money = money / 2;
				}
				
				total[idx] += count;	// 전체 화폐매수 계산
				
				sw = !sw;	//true, false 바꾸기
				idx++;
			}		    
		    System.out.println();
		}
		
		System.out.print("전체 화폐매수 :");
		for (int i = 0; i < total.length; i++) {
			System.out.print("\t" + total[i]);
		}
		
		sc.close();
	}
}
