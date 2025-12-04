package mission14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/*
 * ALOHA 스터디에서 월말 코딩 대회를 열었다. 
 * 매니저는 학생들의 성적을 취합하여 “student.txt” 파일로 정리하였다. 
 * 한 학생의 성적은 다음과 같은 양식으로 기록되어 있다. 
 * txt 파일에서 학생들의 성적정보 (번호/이름/성적/수업이름) 추출하여, 
 * 성적순으로 내림차순, 번호 순으로 오름차순 정렬하여 출력하시오 
 */
public class Main {
	
	int num;
	String name;
	int score;
	String className;
	
	
	public Main(int num, String name, int score, String className) {
		this.num = num;
		this.name = name;
		this.score = score;
		this.className = className;
	}
//
//	private static void Student(int num, String name, int score, String className) {
//		
//		
//	}
	
	public static void main(String[] args) {
		// 파일 경로
		String filePath = "./src/mission14/student.txt";
		
		try (
			// 문자 단위로 데이터 출력
			FileReader fr = new FileReader(filePath);
			// 데이터 출력 성능 향상
			BufferedReader br = new BufferedReader(fr);	
		)		
		{		
			
			String text;
			
			System.out.println("번호\t이름\t성적\t반");
			while( ( text = br.readLine() ) != null ) {
				ArrayList<Main> list = new ArrayList<>();
				// System.out.println(text);
				
				String[] info = text.split("/");
				int num = Integer.parseInt(info[0]);				
				String name = info[1];
				int score = Integer.parseInt(info[2]);				
				String className = info[3];
				
				list.add(new Main(num, name, score, className));
				
//				list.add(num);
//				list.add(name);
//				list.add(score);
//				list.add(className);
				
				//Collections.sort(score);	// 오름차순
				Collections.sort(list, (s1, s2) -> s1.score - s2.score);
				
				for (Main student : list) {
					//System.out.print(student +"\t");
					System.out.println(student.num + "\t" + student.name + "\t" + student.score + "\t" + student.className);
				}
				//System.out.println();
				
				//System.out.println(list);
//				System.out.print(num +"\t");
//				System.out.print(name +"\t");
//				System.out.print(score +"\t");
//				System.out.print(className);
//				System.out.println();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
