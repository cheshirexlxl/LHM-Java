package mission13;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class Singleton {
	private static Singleton instance;			
    
    private Singleton() {}

	public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }    
    
    
    // 자동 번호 생성
    public ArrayList<Integer> getRandNum() {
    	ArrayList<Integer> list = new ArrayList<>();
    	while (list.size() < 6) {
			int rand = (int) (Math.random() * 45 + 1);
			if(!list.contains(rand)) {
				list.add(rand);
			}
		}
    	// 오름차순 정렬
		Collections.sort( list );
		return list;
    }       

    // 날짜/시간 정보(Calendar)를 출력하는 메소드
	public void printCalendar(Calendar cal) {		
		
		// 날짜 형식을 지정하는 방법
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd일 (E) HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd일 (E)");
		
		// 오늘 날짜
		String today = sdf1.format( cal.getTime() );		
		System.out.print("발행일\t: ");
		System.out.println(today);
				
		// 추첨일 시간은 고정값 : 오후 9시, 0분, 0초
		cal.set(Calendar.AM_PM, 1);
		cal.set(Calendar.HOUR, 9);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		
		int dayOfWeek = cal.get( Calendar.DAY_OF_WEEK );		// 일~토(1~7)
		
		cal.add(Calendar.DATE, 7-dayOfWeek);
		String drawDate = sdf1.format( cal.getTime() );
		System.out.print("추첨일\t: ");
		System.out.println(drawDate);
		
		// 추첨일로부터 1년 + 1일 추가
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.DATE, 1);
			
		String deadline = sdf2.format( cal.getTime());
		System.out.print("지급기한\t: ");
		System.out.println(deadline);
		
	}
	
	// 뽑은 숫자
	public void printNum(String label, String type, ArrayList<Integer> nums) {
		System.out.print(label + " " + type);
		Collections.sort(nums);	// 오름차순
		
		for (int num : nums) {
			String result = String.format("%02d", num);
	        System.out.print("\t" + result);
		}
		System.out.println();
	}
	
	// 당첨결과
	public void printResult(String label, String type, ArrayList<Integer> nums, ArrayList<Integer> winning, int bonus) {
		System.out.print(label + " " + type);
		Collections.sort(nums);	// 오름차순
		
		int count = 0;
		
		for (int num : nums) {
			String result = String.format("%02d", num);
			
			if (winning.contains(num)) count++;	// 당첨번호와 매치
			
	        System.out.print("\t" + result);
		}
		
		// 보너스 번호 매치
		boolean bonusMatch = nums.contains(bonus);
		// 등수
	    String grade = switch (count) {
			case 6 -> "(1등)";
			case 5 -> bonusMatch ? "(2등)" : "(3등)";
			case 4 -> "(4등)";
			case 3 -> "(5등)";
			default -> "(낙첨)";
	    };
	    
	    System.out.print("\t" + grade);
	    System.out.println();
	}


	// 당첨번호
	public ArrayList<Integer> winningNum() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(14);
		list.add(19);
		list.add(24);
		list.add(29);
		list.add(36);
		list.add(42);
		return list;
	}
	
	public int bonusNum() {
		return 45;
	}	
	
	public void getWinningNum() {
		// 출력
		System.out.print("당첨번호 : ");
		for (int num : winningNum()) {
			System.out.print(num + " ");
		}	
		System.out.println();
		System.out.print("보너스 번호 : " + bonusNum());
		System.out.println();

	}
    
}
