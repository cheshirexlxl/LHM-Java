package Ex02;

public class Book {
//	1. isbn, title, writer, content, price 를 멤버변수로 갖는 Book 클래스 정의
//	2. Book 클래스의 생성자를 정의하되, 최소 1번 이상 오버로딩 하시오.
//	3. Book 클래스의 멤버변수의 값을 가져오고, 지정하는 getter, setter 메소드 정의
//	4. Book 클래스의 멤버변수들을 정리된 문자열 형태로 반환해주는 toString 메소드 정의
//	5. Book 객체를 생성할 Library 클래스 정의. 아래의 출력결과와 같이 실행되도록 main 메소드를 	작성하시오.
	
	// 1. 변수
	String isbn;
	String title;
	String writer;
	String content;
	int price;	
	
	// 2_1. 생성자
	public Book() {
		
	}	
	
	// 2_2. 오버로딩
	public Book(String isbn, String title, String writer, String content, int price) {
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.price = price;
	}

	// 3.  getter, setter 메소드 정의
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

	// 4. toString 메소드 정의
	@Override
	public String toString() {
		return isbn + " | " + title + " | " + writer + " | " + content + " | "
				+ price;
	}
	
}
