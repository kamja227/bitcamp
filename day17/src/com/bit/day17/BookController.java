package com.bit.day17;

import java.util.ArrayList;
import java.util.List;

public class BookController {
	private List<BookVO> inventoryList;
	private List<BookVO> rentList;

	public BookController(List<BookVO> inventoryList, List<BookVO> rentList) {
		this.inventoryList = inventoryList;
		this.rentList = rentList;
	}
	//
	public BookVO retrieveBookVO(List<BookVO> list, BookVO b) {
		int index = list.indexOf(b);
		return list.get(index);
	}

	//�� �뿩�Ǵ� å�� �����ָ� �κ��丮���� ��Ʈ�� �̵���Ű�� �޼ҵ�
	public void rentBookVO(BookVO b){
		rentList.add(retrieveBookVO(inventoryList, b));
		inventoryList.remove(b);
	}
	//�� �����ִ� BookVO ��ü�� list�� �߰��ϴ� add �޼ҵ�
	public void rentVO(BookVO b) {
		inventoryList.add(b);
		rentList.remove(b);
	}
	
	//�� �����ִ� BookVO ��ü�� list���� �����ϴ� remove �޼ҵ�
	public void returnBookVO(BookVO b) {
		inventoryList.add(retrieveBookVO(rentList, b));
		rentList.remove(b);
	}
	
	//�ش� bookVO ��ü�� �뿩�������� ����(validate) �ϴ� �޼ҵ�
	public boolean validateRentBookVO(BookVO b) {
		return inventoryList.contains(b);
	}
	
	//�ش� bookVO ��ü�� �ݳ��������� �����ϴ� �Ĥ��ҵ�
	public boolean validateReturnBookVO(BookVO b) {
		return rentList.contains(b);
	}
	
	//rentList�� inventoryList�� �ϳ��� ���ļ� �����ϴ� �޼ҵ�
	public List<BookVO> selectAll() {
		List<BookVO> list = new ArrayList<BookVO>();
		list.addAll(inventoryList);
		list.addAll(rentList);
		
		return list;
	}
	
	public List<BookVO> selectInventory() {
		return inventoryList;
	}
	
	public List<BookVO> selectRent() {
		return rentList;
	}
	public boolean isRentEmpty() {
		return rentList.size() == 0;
	}
	//�뿩������ å�� �ִ��� Ȯ���Ѵ�.
	public boolean isInventoryEmpty() {
		return inventoryList.size() == 0;
	}
}