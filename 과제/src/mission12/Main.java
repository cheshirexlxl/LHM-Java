package mission12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 정수 N을 입력받아 N개의 게임의 로또 번호를 출력하시오. 
 * ArrayList를 선언하여 1~45 사이의 랜덤한 값을 중복되지 않도록 저장하고 출력하는 과정을 N번 반복하시오.  
 */
public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 게임?");
		int N = sc.nextInt();		
		
		for (int i = 0; i < N; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			System.out.print("[" + (i + 1) + " 게임] : ");
			
			for (int j = 0; j < 6; j++) {
				// 랜덤
				int rand = (int) (Math.random() * 45 + 1);
				
				// 중복제거
				if(list.contains(rand)) j--; // contains : 값이 존재하면 true, 존재하지 않으면 false 를 반환
				else list.add(rand);
			}	
			
			// 오름차순 정렬
			Collections.sort( list );
			
			// 출력
			for (Integer lotto : list) {
				System.out.print(lotto + " ");
			}
			System.out.println();
		}	
		
		sc.close();
	}
}
