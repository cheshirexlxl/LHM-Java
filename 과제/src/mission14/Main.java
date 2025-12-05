package mission14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/*
 * ALOHA 스터디에서 월말 코딩 대회를 열었다. 
 * 매니저는 학생들의 성적을 취합하여 “student.txt” 파일로 정리하였다. 
 * 한 학생의 성적은 다음과 같은 양식으로 기록되어 있다. 
 * txt 파일에서 학생들의 성적정보 (번호/이름/성적/수업이름) 추출하여, 
 * 성적순으로 내림차순, 번호 순으로 오름차순 정렬하여 출력하시오 
 */
public class Main {	
	public static void main(String[] args) {
		// 파일 경로
		String filePath = "./src/mission14/student.txt";
		
		try (			
			FileReader fr = new FileReader(filePath);		
			BufferedReader br = new BufferedReader(fr);	
		)		
		{		
			ArrayList<Student> list = new ArrayList<>();
			
			String text;			
			
			while( ( text = br.readLine() ) != null ) {			
				String[] info = text.split("/");		// 텍스트 자르기
				
				int num = Integer.parseInt(info[0]);	// 번호			
				String name = info[1];					// 이름
				int score = Integer.parseInt(info[2]);	// 성적		
				String className = info[3];				// 반
				
				list.add(new Student(num, name, score, className)); // 값 가져오기
			}			

			// 정렬
			Collections.sort( list, new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {				
					int num1 = o1.getNum();
					int num2 = o2.getNum();
					int score1 = o1.getScore();
					int score2 = o2.getScore();				

					int result1 = num1 - num2;				// 번호순 오름차순
					int result2 = score2 - score1;   		// 성적순 내림차순
					return result2 != 0 ? result2 : result1;			
				}
			});
			
			// 출력
			System.out.println("번호\t이름\t성적\t반");
			for (Student st : list) {				
				System.out.println(st.num + "\t" + st.name + "\t" + st.score + "\t" + st.className);
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
