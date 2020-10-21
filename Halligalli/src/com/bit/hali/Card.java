package com.bit.hali;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class Card extends Frame implements ActionListener {
	Button btn1, btn2, btn3, btn4, btnbell;
	String[][] allCard = {
			{"사1", "사1", "사1", "사1", "사1", "사2", "사2", "사2", "사2", "사3", "사3", "사3", "사4", "사4", "사5"}, // [0][0], [0][1] ..
			{"바1", "바1", "바1", "바1", "바1", "바2", "바2", "바2", "바2", "바3", "바3", "바3", "바4", "바4", "바5"}, // [1][0], [1][1] ..
			{"자1", "자1", "자1", "자1", "자1", "자2", "자2", "자2", "자2", "자3", "자3", "자3", "자4", "자4", "자5"}, // [2][0], [2][1] ..
			{"포1", "포1", "포1", "포1", "포1", "포2", "포2", "포2", "포2", "포3", "포3", "포3", "포4", "포4", "포5"} // [3][0], [3][1] ..
	};
	
	String[] shuffleCard = new String[56];
	int shuffleCardlength = 0;
	Vector<String> player1 = new Vector<String>(14);
	Vector<String> player2 = new Vector<String>(14);
	Vector<String> player3 = new Vector<String>(14);
	Vector<String> player4 = new Vector<String>(14);
	Vector<String> bell = new Vector<String>(56);
	Vector<String> showCard = new Vector<String>(4);
	
	String[] fruit = new String[showCard.size()]; // 바
	String[] num = new String[showCard.size()]; // 1
	
	public void Btn() {
		// 버튼에 arraylist 개수 다시 세팅
		btn1.setLabel(Integer.toString(player1.size()));
		btn2.setLabel(Integer.toString(player2.size()));
		btn3.setLabel(Integer.toString(player3.size()));
		btn4.setLabel(Integer.toString(player4.size()));
		btnbell.setLabel(Integer.toString(bell.size()));
	}
	
	boolean boo = true;
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
//		if(showCard.size() == 4) { // 보이는 카드가 4개면 index0부터 삭제
//			showCard.remove(0);
//		}
		
		if(obj == btnbell) {
			// 처음 벨을 누르면 player들에게 카드 나눠줌
			if(bell.size() == 56) {
				for(int i=0; i<56; i+=4) { 
					player1.add(shuffleCard[i]);
					player2.add(shuffleCard[i+1]);
					player3.add(shuffleCard[i+2]);
					player4.add(shuffleCard[i+3]);
					bell.clear();
				}
				boo = false;
				// 낸 카드 null로 초기화
				for(int i=0; i<4; i++) {
					showCard.add(null);
				}
				Btn();
			}
			// 벨 눌렀을때 검사
			else {
				String showCardStr = ""; 
				char[] fruit = new char[4];
				char[] su = new char[4];
				int index1 = 0;
				int index2 = 0;
				for(int i=0; i<4; i++) {
					showCardStr += showCard.get(i); // "사1포3자4자3"
				}
				char[] arr_showCardStr = new char[showCardStr.length()]; 
				
				for(int i=0; i<arr_showCardStr.length; i++) {
					arr_showCardStr[i] = showCardStr.charAt(i); // 사 1 포 3 ...
					if(arr_showCardStr.length % 2 == 0) {
						fruit[index1] = arr_showCardStr[i]; // 사 포 자 자
						index1++;
					}
					else {
						su[index2] = arr_showCardStr[i]; // 1 3 4 3
						index2++;
					}
				} // for end
				
//				if(fruit)

					
			
				
			}
//			
			
 				
// 				for(int i=0; i<3; i++) {
// 					for(int j=1+i; j<4; j++) {
// 						if(showCard.get(i).charAt(0) == showCard.get(j).charAt(0)) {
// 							System.out.println(showCard.get(i));
// 							System.out.println(showCard.get(j));
// 						} else {
// 							System.out.println("중복없음");
// 						}
// 						
// 					}
// 				}
//					if (showCard.elementAt(0).charAt(0) == showCardCheck.next().charAt(0)) {
//						if(showCard.elementAt(0).charAt(1) + showCardCheck.next().charAt(1) == "5") {
//							// 벨에 저장된거 다줌 
//						}
//
//					} else {
//						// 한장씩 나눠줌
//					}
//				while(showCardCheck.hasNext()) {
////					System.out.print(showCard.elementAt(1).charAt(0) + " "); 
//					System.out.println(showCardCheck.next().charAt(0));
//				}

		} // btnbell end

		else if(obj == btn1) {
			System.out.println("player1 : " + player1.get(0));
			bell.add(player1.get(0)); // 낸 카드 bell에 저장
			showCard.remove(0); // 원래 낸 카드 지우고
			showCard.add(0, player1.get(0)); // 그 자리에 다시 냄
			player1.remove(0);
			Btn();
			if(player1.size() == 0) {
				System.out.println("패배");
			}
		}
		else if(obj == btn2) {
			System.out.println("player2 : " + player2.get(0));
			bell.add(player2.get(0));
			showCard.remove(1);
			showCard.add(1, player2.get(0));
			player2.remove(0);
			Btn();
			if(player2.size() == 0) {
				System.out.println("패배");
			}
		}
		else if(obj == btn3) {
			System.out.println("player3 : " + player3.get(0));
			bell.add(player3.get(0));
			showCard.remove(2);
			showCard.add(2, player3.get(0));
			player3.remove(0);
			Btn();
			if(player3.size() == 0) {
				System.out.println("패배");
			}
		}
		else if(obj == btn4) {
			System.out.println("player4 : " + player4.get(0));
			bell.add(player4.get(0));
			showCard.remove(3);
			showCard.add(3, player4.get(0));
			player4.remove(0);
			Btn();
			if(player4.size() == 0) {
				System.out.println("패배");
			}
		}
		
//		for(int i=0; i<showCard.size(); i++) {
//			fruit[i] = showCard.elementAt(i).charAt(0);
//			num[i] = showCard.elementAt(i).charAt(1);
//		}
		
		System.out.println("낸카드 : " + showCard);
		System.out.println("player1카드 " + player1);
		System.out.println("player2카드 " + player2);
		System.out.println("player3카드 " + player3);
		System.out.println("player4카드 " + player4);
		System.out.println("지금까지 낸 모든 카드 bell에 저장 " + bell);
		System.out.println();
	} // actionperfomed end
		
	public Card() {
		setTitle("할리갈리");

		
		
		Panel p = new Panel();
		
		// 인자앞에 과일종류붙여서 문자열변환, 배열복사.
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 14; j++) {
				shuffleCard[shuffleCardlength] = allCard[i][j];
				shuffleCardlength++;
			}
		} // outforend
		
		// 카드 섞기
		int count = 2000;
		for (int k = 0; k < count; k++) {
			int i = (int) (Math.random() * shuffleCard.length);
			int j = (int) (Math.random() * shuffleCard.length);
			
			String tmp = shuffleCard[i];
			shuffleCard[i] = shuffleCard[j];
			shuffleCard[j] = tmp;
		}
		
		// bell 에 섞인 56장 카드 저장
		for(int i=0; i<56; i++) {
			bell.add(shuffleCard[i]);
		}
		
		System.out.println(bell);
		
		// 버튼에 arraylist 개수
		btn1 = new Button(); 
		btn1.setLabel(Integer.toString(player1.size()));
		btn1.addActionListener(this);
		btn2 = new Button();
		btn2.setLabel(Integer.toString(player2.size()));
		btn2.addActionListener(this);
		btn3 = new Button();
		btn3.setLabel(Integer.toString(player3.size()));
		btn3.addActionListener(this);
		btn4 = new Button();
		btn4.setLabel(Integer.toString(player4.size()));
		btn4.addActionListener(this);
		btnbell = new Button();
		btnbell.setLabel(Integer.toString(bell.size()));
		btnbell.addActionListener(this);
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btnbell);
		add(p);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	
		setVisible(true);
		setSize(400, 400);
		setLocation(400, 100);

	} // card end
	
	public static void main(String[] args) {
		new Card();
		
	} // main end
} // card class end
