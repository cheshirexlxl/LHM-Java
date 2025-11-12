package Ex02;

public class Library {
	public static void main(String[] args) {
		
		System.out.println("######## 조은 스터디 도서관 ########");			
		
		Book book = new Book("123123", "이게 자바냐", "감자바" , "자바 감자바", 33000);
		System.out.println(book);
		// System.out.println(book.isbn + "\t|\t" + book.title + "\t|\t" + book.writer + "\t|\t" + book.content + "\t|\t" + book.price);
		
		Book book2 = new Book("112112", "정보처리기사", "김조은" , "국가기술자격", 45000);
		System.out.println(book2.isbn + "\t|\t" + book2.title + "\t|\t" + book2.writer + "\t|\t" + book2.content + "\t|\t" + book2.price);

		Book book3 = new Book();
		book3.setIsbn("001001");
		System.out.println(book3.getIsbn());
	}
}
