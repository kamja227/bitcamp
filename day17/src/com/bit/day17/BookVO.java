package com.bit.day17;

/* 도서대여 프로그램
 * 도서정보:
 * 		1, id
 * 		2. 제목
 * 		3. 저자
 * 		4. 대여가격
 * 		5. 현재상태 (대여중 or no) -> 이게 없는 방법으로도 충분히 가능
 * 프로그램 기능
 * 		1. 대여
 * 		2. 반납
 * 		3. 각종 정보 출력
 * 			1. 대여중인 책 출력
 * 			2. 대여가능한 책 출력
 * 			3. 전체 책 목록 출력
 * 		4. 생성자를 통해서 기본적으로 몇권의 책을 대여가능 목록에 넣는다,
 */

public class BookVO {
	private int id;
	private String title;
	private String author;
	private int price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "BookVO [id=" + id + ", title=" + title + ", author=" + author + ", price" + price;
	}
	public boolean equals(Object o) {
		if(o instanceof BookVO) {
			BookVO b = (BookVO) o;
			if(id == b.id) {
				return true;
			}
		}
		return false;
	}
} // class end

