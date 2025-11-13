package Ex02;

import java.util.ArrayList;

public class Library {
	public static void main(String[] args) {				
		
		Book book1 = new Book("123123", "이게 자바냐", "감자바" , "자바 감자바", 33000);
		Book book2 = new Book("112112", "정보처리기사", "김조은" , "국가기술자격", 45000);
		Book book3 = new Book("001001", "실무 DB", "박디비" , "디비디비딥", 60000);
		
		// 컬렉션 추가
		ArrayList<Book> list = new ArrayList<>();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		
		System.out.println("######## 조은 스터디 도서관 ########");	
		
		// 반복문으로 출력
		for (Book book : list) {
			System.out.println(book.toString());
		}
	}
}
