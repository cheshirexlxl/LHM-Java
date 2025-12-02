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
//		int year = cal.get( Calendar.YEAR );
//		int month = cal.get( Calendar.MONTH ) + 1;				// 월(0~11)
//		int day = cal.get( Calendar.DAY_OF_MONTH );				
		int dayOfWeek = cal.get( Calendar.DAY_OF_WEEK );		// 일~토(1~7)
//		int hour = cal.get( Calendar.HOUR );					// 12시 표시
//		int hourOfDay = cal.get( Calendar.HOUR_OF_DAY );		// 24시 표시
//		int minute = cal.get( Calendar.MINUTE );
//		int second = cal.get( Calendar.SECOND );
//		int millisecond = cal.get( Calendar.MILLISECOND );
//		int ampm = cal.get( Calendar.AM_PM );
		
		// 날짜 형식을 지정하는 방법
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd일 (E) HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd일 (E)");
		
		// 오늘 날짜
		String today = sdf.format( cal.getTime() );		
		System.out.print("발행일\t: ");
		System.out.println(today);
				
		// 추첨일 시간은 고정값 : 오후 9시, 0분, 0초
		cal.set(Calendar.AM_PM, 1);
		cal.set(Calendar.HOUR, 9);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		
		cal.add(Calendar.DATE, 7-dayOfWeek);
		String drawDate = sdf.format( cal.getTime() );
		System.out.print("추첨일\t: ");
		System.out.println(drawDate);
		
		// 추첨일로부터 1년 + 1일 추가
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.DATE, 1);
			
		String deadline = sdf2.format( cal.getTime());
		System.out.print("지급기한\t: ");
		System.out.println(deadline);
		
	}
	
	// 당첨번호
    
}
