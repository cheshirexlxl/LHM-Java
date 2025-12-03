package mission13;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
		Singleton st = Singleton.getInstance();
		Calendar lottoCal = Calendar.getInstance();	
		
		ArrayList<ArrayList<Integer>> lottoAll = new ArrayList<>(); // 로또 숫자 리스트
		ArrayList<String> lottoType = new ArrayList<>(); // 자동/수동 타입
		ArrayList<Integer> lottoNum = st.winningNum(); // 당첨번호
		int bonus = st.bonusNum(); // 보너스 번호		
		
		System.out.print("몇 게임? ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			ArrayList<Integer> list1 = new ArrayList<>();
			ArrayList<Integer> list2 = new ArrayList<>();			
			String[] arr = {"①", "②", "③", "④", "⑤", "⑥"};
			
			System.out.print("[" + (i + 1) + " 게임] (1.자동 / 2. 수동) : ");
			int num = sc.nextInt();
			
			switch (num) {
				case 1: 					
					list1 = st.getRandNum();
					lottoAll.add(list1);        // 자동 번호 저장
					lottoType.add("자 동");     	// '자동' 저장
					break;	
				case 2:					
					for (int j = 0; j < 6; j++) {
						System.out.print(arr[j] + " : ");
						int randNum = sc.nextInt();						
						list2.add(randNum);						
					}
					lottoAll.add(list2);        // 수동 번호 저장
					lottoType.add("수 동");     	// '수동' 저장					
					break;
				default:
					System.err.println("선택할 수 없는 숫자입니다.");
					return;
			}			
			// 출력
			if( num == 1) {
				// 자동일때
				for (Integer lotto : list1) {
					System.out.print(lotto + " ");
				}
			} else {
				// 수동일때
				for (Integer lotto : list2) {
					System.out.print(lotto + " ");
				}				
			}
			System.out.println();			
		}
		
		
		
		System.out.println("############ 인생역전 Lottoria ############");	
		
		// 날짜
		st.printCalendar(lottoCal);
		System.out.println("----------------------------------------------------");
		
		// 뽑은 숫자 불러오기	
		for (int i = 0; i < lottoAll.size(); i++) {
			char label = (char) ('A' + i);	// A,B,C,D...
			st.printNum(String.valueOf(label), lottoType.get(i), lottoAll.get(i));
		}
		
		System.out.println("----------------------------------------------------");
		
		// 금액
		int money = 1000 * N;
		NumberFormat nf = NumberFormat.getNumberInstance();
		
		System.out.println("금액\t\t\t\t\t\t₩" + nf.format(money));
		System.out.println("####################################################");
		System.out.println();		
			
		// 당첨번호
		st.getWinningNum();	
		
		System.out.println();
		System.out.println("########################## 당첨 결과 ##########################");
		
		// 당첨결과	
		for (int i = 0; i < lottoAll.size(); i++) {
			char label = (char) ('A' + i);	// A,B,C,D...
			st.printResult(String.valueOf(label), lottoType.get(i), lottoAll.get(i), lottoNum, bonus);
		}		
		System.out.println("############################################################");

		
		sc.close();
	}
}
