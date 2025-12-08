package mission15;

/**
 * ALOHA 스터디는 모든 수강생에게 다양한 교재를 제공하기 위해 작은 도서관을 운영하려고 한다. 
 * 이 도서관의 교재를 관리하기 위한 프로그램을 아래의 조건에 따라 구현하시오.
 * 
 * - 구현할 기능
 * 1. isbn, title, writer, content, price 를 멤버변수로 갖는 Book 클래스 정의
 * 2. Book 클래스의 생성자를 정의하되, 최소 1번 이상 오버로딩하시오.
 * 3. Book 클래스의 멤버변수의 값을 가져오고, 지정하는 getter, setter 메소드 정의
 * 4. Book 클래스의 멤버변수들을 정리된 문자열 형태로 반환해주는 toString 메소드 정의
 * 5. Book 객체를 생성할 Library 클래스 정의. 아래의 출력결과와 같이 실행되도록 main 메소드를 작성하시오.
 
 * <조건> 
 * - 객체는 별도로 입력받지 않고, 출력결과와 동일한 정보를 갖도록 생성한다.
 * - 생성된 Book 객체들은 컬렉션에 추가하고 반복문을 이용하여 출력한다
 */

public class Book {

	String isbn;
	String title;
	String writer;
	String content;
	int price;
	
	public Book() {
		
	}	

	public Book(String isbn, String title, String writer, String content, int price) {
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return isbn + "\t| " + title + "\t| " + writer + "\t| " + content + "\t| "
				+ price;
	}
	
	
	
	
	
	
	
}
