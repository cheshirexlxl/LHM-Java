package mission13;

import java.util.ArrayList;
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

	// 날짜
//    public static void getDateTime() {
//    	
//    }  
    
}
