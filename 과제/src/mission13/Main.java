package mission13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ‘김조은’씨는 로또판매점에 가서 로또를 구매합니다. 
 * 로또는 한장에 최대 5개의 게임을 선택할 수 있으며, 
 * (자동),(수동) 방식으로 1~45 사이의 숫자 중에서 6개의 번호를 지정할 수 있습니다. 
 * <실행결과>와 같이 구매한 로또 용지를 출력하고 
 * 당첨결과 도확인할 수 있는 프로그램을 작성해보세요.
 * 
 * <조건>
 * - ArrayList 를 이용하시오
 * - 싱글톤 패턴을 적용하시오.
 * - 발행일은 현재 시간으로 지정하며 추첨일은 토요일 오후 9시를 기준으로, 
 *   이전이면 그 주 토요일 9시로 이후이면 차주 토요일 오후 9시로 지정하시오.
 * - 지급기한은 1년하고 1일을 더한 날짜로 지정하시오.
 * 
 * - 당첨 등수는 당첨번호와 게임당 선택번호가 일치하는 개수로 정한다.
 *  6개 일치하면 1등, 
 *  5개 일치하고 보너스 번호가 일치하면 2등,
 *  5개만 일치하면 3등,
 *  4개 일치하면 4등,
 *  3개 일치하면 5등
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			String[] arr = {"①", "②", "③", "④", "⑤", "⑥"};
			
			System.out.print("[" + (i + 1) + " 게임] (1.자동 / 2. 수동) : ");
			int num = sc.nextInt();
			
			switch (num) {
				case 1: 					
					for (int j = 0; j < 6; j++) {
						// 랜덤
						int rand = (int) (Math.random() * 45 + 1);
						
						// 중복제거
						if(list.contains(rand)) j--;
						else list.add(rand);
					}	
					break;	
				case 2:
					int lottoNum[] = new int[6];
					for (int j = 0; j < lottoNum.length; j++) {
						System.out.print(arr[j] + " : ");
						int randNum = sc.nextInt();
						lottoNum[j] = (int) randNum;
					}	
					System.out.print(lottoNum + " ");
					break;
				default:
					break;
			}
			
			// 오름차순 정렬
			Collections.sort( list );
			
			// 출력
			for (Integer lotto : list) {
				System.out.print(lotto + " ");
			}
		}
		
		Singleton s01 = Singleton.getInstance();
		Singleton s02 = Singleton.getInstance();
		System.out.println(s01);
		System.out.println(s02);
	}
}
