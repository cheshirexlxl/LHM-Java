package mission15;

import java.util.ArrayList;

public class Library {
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add( new Book("123123", "이게 자바냐", "감자바", "자바 감자바", 33000) );
		bookList.add( new Book("112112", "정보처리기", "김휴먼", "국가기술자격", 45000) );
		bookList.add( new Book("001001", "실무 DB", "박디비", "디비디비딥", 60000) );
		
		for (Book book : bookList) {
			System.out.print(book.getIsbn() + " \t| " + book.getTitle() + " \t| " + book.getWriter() + " \t| " + book.getContent() + " \t| " + book.getPrice());
			System.out.println();
			// System.out.println(book);
		}
		
	}
}
