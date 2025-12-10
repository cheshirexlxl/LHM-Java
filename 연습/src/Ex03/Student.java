package Ex03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 모두의 코딩에서 월말 코딩 대회를 열었다. 
 * 매니저는 학생들의 성적을 취합하여  * “student.txt” 파일로 정리하였다. 
 * 한 학생의 성적은 다음과 같은 양식으로 기록되어 있다. 
 * txt 파일에서 학생들의 성적정보 (번호/이름/성적/수업이름) 추출하여, 
 * 성적 순으로 내림차순, 번호 순으로 오름차순 정렬하여 출력하시오
 */
public class Student {
	int no;
	String name;
	int score;
	String className;
	
	public Student() {
		
	}

	public Student(int no, String name, int score, String className) {
		this.no = no;
		this.name = name;
		this.score = score;
		this.className = className;
	}
	
	// 텍스트 파일입력
	public static LinkedList<Student> getTxtToList(LinkedList<Student> list) {
		try {
			File file = new File("./src/Ex03/student.txt");
			Scanner sc = new Scanner(file);
			Student std;
			while(sc.hasNextLine()) {
				String stn = sc.nextLine();
				String[] data = stn.split("/");
				int no = Integer.parseInt( data[0] );
				String name = data[1];
				int score = Integer.parseInt( data[2] );
				String className = data[3];
				std = new Student(no, name, score, className);
				list.offer(std);
			}
			
			// 정렬
			Collections.sort( list, new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					int no1 = o1.no;
					int no2 = o2.no;
					int score1 = o1.score;
					int score2 = o2.score;
					
					int result1 = no1 - no2; // 오름차순
					int result2 = score2 - score1; // 내림차순
					return result2 != 0 ? result2 : result1;
				}
			} );
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
