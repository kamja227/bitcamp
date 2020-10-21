package com.bit.hali;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.net.*;
import java.util.ArrayList;
import java.util.Vector;
import java.io.*;

public class HaliGaliClient extends Thread {
	static final String IP = "192.168.0.194";

	static final int PORT = 8080;
	static Vector<ImageIcon> cardImages = new Vector<>();
	int[][] allCard = new int[4][14];
	Toolkit tool = Toolkit.getDefaultToolkit();
	InputStreamReader isr;
	OutputStreamWriter osw;
	BufferedReader br;
	BufferedWriter bw;
	// boolean ready;
	Socket socket;
	TextArea ta;
	// static JLabel[] cardImage = new JLabel[56]; // card 그림
	JButton[] jbtns = new JButton[5];
	JLabel jla1;
	JLabel jla2;
	JLabel jla3;
	JLabel jla4;
	Label la4;
	Label la5;
	Label la6;
	Label la7;
	Panel p1;
	Panel p2;
	Panel p3;
	Panel p4;
	Panel p5;
	static Color color1 = new Color(217, 217, 217);
	static Color color2 = new Color(255, 255, 255);
	static Color color3 = new Color(235, 235, 235);
	static Color color4 = new Color(255, 255, 255); // 시스템메세지 배경
	static Color color5 = new Color(242, 222, 255); // 종 누를때 바뀌는 색

	
	/*
	 * 00 01 02 03 04 05 06 07 08 09 010 011 012 013 바나나
	 * 10 11 12 13 14 15 16 17 18 19 110 111 112 113 레몬
	 * 20 21 22 23 24 25 26 27 28 29 210 211 212 213 자두
	 * 30 31 32 33 34 35 36 37 38 39 310 311 312 313 딸기
	 * 
	 * 
	 * */
	
	public void cardImages() {

		String imageFile = "";
		ImageIcon icon = null;
		Image img = null;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 14; j++) {
				imageFile = ".\\cardimages2\\" + i + "" + j + ".jpg";
				img = tool.createImage(imageFile);
				icon = new ImageIcon(img);
				cardImages.add(icon);// 0~55
			}
		} // for
	}// cardImages

	@Override
	public void run() {
		// System.out.println("thread start");

		try {
			isr = new InputStreamReader(socket.getInputStream());
			br = new BufferedReader(isr);
			osw = new OutputStreamWriter(socket.getOutputStream());
			bw = new BufferedWriter(osw);

			int position = Integer.parseInt(br.readLine());

			Haliui haliui = new Haliui(socket, position, true);
			bw.write("대기");
			bw.newLine();
			bw.flush();
			String numberOfPlayers = null;

			while ((numberOfPlayers = br.readLine()) != null) {

				if (numberOfPlayers.equals("4")) {
					ta.append("♥♥♥♥ 4P 입장 ♥♥♥♥\n");
					ta.append("게임 시작! 1P부터 시작하세요\n");
					break;
				} else if (numberOfPlayers.equals("3")) {
					ta.append("★★★★ 3P 입장 ★★★★\n");
				} else if (numberOfPlayers.equals("2")) {
					ta.append("♠♠♠♠ 2P 입장 ♠♠♠♠\n");
				} else if (numberOfPlayers.equals("1")) {
					ta.append("◆◆◆◆ 1P 입장 ◆◆◆◆\n");
				} else {
					ta.append("PLAYER 를 기다리는 중입니다 ... \n");
				}
				ta.revalidate();
			}
			bw.write("시작");
			bw.newLine();
			bw.flush();

			
			// jbtns[0] = 1P 부터 시작
			jbtns[1].setEnabled(false);
			jbtns[2].setEnabled(false);
			jbtns[3].setEnabled(false);

			String msg = null;
			while ((msg = br.readLine()) != null) {

				if (position == 0) {

					if (!ta.getText().contains("1P 패배")
							&& msg.contains("4카드오픈")) {
						jbtns[0].setEnabled(true);
					} else if (ta.getText().contains("4P 패배")
							&& msg.contains("3카드오픈")) {
						jbtns[0].setEnabled(true);
					} else if (ta.getText().contains("3P 패배")
							&& ta.getText().contains("4P 패배")
							&& msg.contains("2카드오픈")) {
						jbtns[0].setEnabled(true);
					}

					if (ta.getText().contains("1P 패배")) {
						jbtns[4].setEnabled(false);
						jla1.setEnabled(false);
						la6.setEnabled(false);
						break;
					}

				} else if (position == 1) {// 2p

					if (!ta.getText().contains("2P 패배")
							&& msg.contains("1카드오픈")) {
						jbtns[2].setEnabled(true);
					} else if (ta.getText().contains("1P 패배")
							&& msg.contains("4카드오픈")) {
						jbtns[2].setEnabled(true);
					} else if (ta.getText().contains("1P 패배")
							&& ta.getText().contains("4P 패배")
							&& msg.contains("3카드오픈")) {
						jbtns[2].setEnabled(true);
					}
					if (ta.getText().contains("2P 패배")) {
						jbtns[4].setEnabled(false);
						jla3.setEnabled(false);
						la5.setEnabled(false);
						break;
					}

				} else if (position == 2) {

					if (!ta.getText().contains("3P 패배")
							&& msg.contains("2카드오픈")) {
						jbtns[3].setEnabled(true);
					} else if (ta.getText().contains("2P 패배")
							&& msg.contains("1카드오픈")) {
						jbtns[3].setEnabled(true);
					} else if (ta.getText().contains("2P 패배")
							&& ta.getText().contains("1P 패배")
							&& msg.contains("4카드오픈")) {
						jbtns[3].setEnabled(true);
					}

					if (ta.getText().contains("3P 패배")) {
						jbtns[4].setEnabled(false);
						jla4.setEnabled(false);
						la4.setEnabled(false);
						break;
					}

				} else if (position == 3) {

					if (!ta.getText().contains("4P 패배")
							&& msg.contains("3카드오픈")) {
						jbtns[1].setEnabled(true);
					}

					else if (ta.getText().contains("3P 패배")
							&& msg.contains("2카드오픈")) {
						jbtns[1].setEnabled(true);
					} else if (ta.getText().contains("3P 패배")
							&& ta.getText().contains("2P 패배")
							&& msg.contains("1카드오픈")) {
						jbtns[1].setEnabled(true);
					}

					if (ta.getText().contains("4P 패배")) {
						jbtns[4].setEnabled(false);
						jla2.setEnabled(false);

						break;
					}
				}

				// 6547

				if (msg.contains("1카드오픈")) {
					jbtns[0].setEnabled(false);
					String left = msg.substring(msg.lastIndexOf("픈") + 1);
					System.out.println(left);
					la6.setText("    [1P] 카드 수 : " + left);
					la6.setBackground(color5);
					Thread.sleep(70);
					la6.setBackground(null);

					if (msg.contains("패배") || left.equals("0")) {
						ta.append("[1P 패배]\n");
						jla1.setIcon(new ImageIcon("bincard.jpg"));
						jbtns[0].setEnabled(false);
						// jbtns[4].setEnabled(false);
						jla1.setEnabled(false);
						la6.setVisible(false);
					} else {
						System.out.println(msg.substring(0, msg.indexOf("1카")));
						String cardImage = msg.substring(0, msg.indexOf("1카"));
						int idx = Integer.parseInt(cardImage);
						jla1.setIcon(cardImages.get(idx));
						// p3.add(jla1, haliui.gridcons(1, 0));
					}
				} else if (msg.contains("4카드오픈")) {
					jbtns[1].setEnabled(false);
					String left = msg.substring(msg.lastIndexOf("픈") + 1);
					System.out.println(left);
					la7.setText("    [4P] 카드 수 : " + left);
					la7.setBackground(color5);
					Thread.sleep(70);
					la7.setBackground(null);

					if (msg.contains("패배") || left.equals("0")) {
						ta.append("[4P 패배]\n");
						jbtns[1].setEnabled(false);
						// jbtns[4].setEnabled(false);
						jla2.setEnabled(false);
						la7.setVisible(false);
					} else {
						String cardImage = msg.substring(0, msg.indexOf("4카"));
						int idx = Integer.parseInt(cardImage);
						jla2.setIcon(cardImages.get(idx));
						// p3.add(jla2, haliui.gridcons(3, 0));
					}
				} else if (msg.contains("2카드오픈")) {
					jbtns[2].setEnabled(false);
					String left = msg.substring(msg.lastIndexOf("픈") + 1);
					System.out.println(left);
					la5.setText("    [2P] 카드 수 : " + left);
					la5.setBackground(color5);
					Thread.sleep(70);
					la5.setBackground(null);

					if (msg.contains("패배") || left.equals("0")) {
						ta.append("[2P 패배]\n");
						jbtns[2].setEnabled(false);
						// jbtns[4].setEnabled(false);
						jla3.setEnabled(false);
						la5.setVisible(false);
					} else {
						String cardImage = msg.substring(0, msg.indexOf("2카"));
						int idx = Integer.parseInt(cardImage);
						jla3.setIcon(cardImages.get(idx));
						// p5.add(jla3, haliui.gridcons(1, 0));
					}
				} else if (msg.contains("3카드오픈")) {
					jbtns[3].setEnabled(false);
					String left = msg.substring(msg.lastIndexOf("픈") + 1);
					System.out.println(left);
					la4.setText("    [3P] 카드 수 : " + left);
					la4.setBackground(color5);
					Thread.sleep(70);
					la4.setBackground(null);

					if (msg.contains("패배") || left.equals("0")) {
						ta.append("[3P 패배]\n");
						jbtns[3].setEnabled(false);
						// jbtns[4].setEnabled(false);
						jla4.setEnabled(false);
						la4.setVisible(false);
					} else {
						String cardImage = msg.substring(0, msg.indexOf("3카"));
						int idx = Integer.parseInt(cardImage);
						jla4.setIcon(cardImages.get(idx));
						// p5.add(jla4, haliui.gridcons(3, 0));
					}

					// thisPlayer = 입장 순서대로 playerStrema Index + 1로 계산해서 부여
				} else if (msg.contains("성공") || msg.contains("실패")) {
					String player01size = msg.substring(msg.indexOf("01") + 2,
							msg.indexOf("02"));
					String player02size = msg.substring(msg.indexOf("02") + 2,
							msg.indexOf("03"));
					String player03size = msg.substring(msg.indexOf("03") + 2,
							msg.indexOf("04"));
					String player04size = msg.substring(msg.indexOf("04") + 2);

					// String posi = msg.substring(msg.indexOf("[") + 1,
					// msg.indexOf("P"));
					if (msg.contains("성공")) {
						jla1.setIcon(new ImageIcon("bincard.jpg"));
						jla2.setIcon(new ImageIcon("bincard.jpg"));
						jla3.setIcon(new ImageIcon("bincard.jpg"));
						jla4.setIcon(new ImageIcon("bincard.jpg"));
					} // ifEnd

					System.out.println("체크");
					// System.out.println(posi);
					// if (posi.contains("1")) {
					System.out.println("체크2");
					la6.setText("    [1P] 카드 수 " + player01size);
					// } else if (posi.contains("2")) {
					la5.setText("    [2P] 카드 수 " + player02size);
					// } else if (posi.contains("3")) {
					la4.setText("    [3P] 카드 수 " + player03size);
					// } else if (posi.contains("4")) {
					la7.setText("    [4P] 카드 수 " + player04size);
					// }
					ta.append(msg.substring(0, msg.lastIndexOf("!")) + "\n");
					System.out.println(msg);

				} else if (msg.contains("승리")) {

					ta.append(msg + "\n");
					break;

				} else {
					if (msg.contains("[1P 패배] 1P의 남은 카드가 없습니다.")) {
						jla1.setEnabled(false);
					}
					if (msg.contains("[4P 패배] 4P의 남은 카드가 없습니다.")) {
						jla2.setEnabled(false);
					}
					if (msg.contains("[2P 패배] 2P의 남은 카드가 없습니다.")) {
						jla3.setEnabled(false);
					}
					if (msg.contains("[3P 패배] 3P의 남은 카드가 없습니다.")) {
						jla4.setEnabled(false);
					}
					ta.append(msg + "\n");
				}
				ta.revalidate();
				// if (!(msg.contains("성공") || msg.contains("실패")))
			} // while

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ta.append("수고하셨습니다. \n");
				;
				if (br != null)
					bw.close();
				if (bw != null)
					br.close();
				if (socket != null)
					socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}// runENd

	public HaliGaliClient() {
		cardImages();
	}

	public static void main(String[] args) {
		HaliGaliClient me = new HaliGaliClient();
		// me.cardImages();

		try {
			me.socket = new Socket(IP, PORT);
			me.start();
			System.out.println("connected to server");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// System.out.println("Connertion refused");
			System.out.println("Server doesn't exist");
		}
	}// main
		// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	class Haliui extends Frame implements ActionListener {

		MenuItem menu_m1, menu_m2;
		InputStreamReader isr;
		OutputStreamWriter osw;
		BufferedReader br;
		BufferedWriter bw;
		Socket socket;
		int position;
		boolean visible = false;
		Button diabtn;
		Dialog dia;
		Dimension dim = tool.getScreenSize();
		// String diamsg = "<html>가<BR/>나</html>";

		String diamsg = "<html>1. 1P부터 반시계방향으로 돌아가며 카드를 냅니다.<br/>"
				+ "2. 펼쳐놓은 카드들 중에서 같은 과일이 5개가 되면 종을 칩니다.<br/>"
				+ "3. 가장 먼저 종을 친 사람이 그때까지<br/>" + "4. 펼쳐놓은 카드들을 모두 가져갑니다.<br/>"
				+ "5. 종을 잘못 치면 다른 사람들에게 카드를 한장씩 줍니다.<br/>"
				+ "6. 마지막까지 카드를 갖고 있는 사람이 이깁니다.</html>";

		public Dialog createDialog(String title, String contents, int wid,
				int hei) {

			Panel pa1 = new Panel(new FlowLayout());
			Panel pa2 = new Panel(new FlowLayout());
			Dialog dia = new Dialog(this, title);
			JLabel diala = new JLabel(contents);
			diabtn = new Button("확인");
			diabtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dia.dispose();
				}
			});
			pa1.add(diala);
			pa2.add(diabtn);
			dia.setLayout(new BorderLayout());
			dia.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dia.dispose();
				}
			});
			dia.add(pa1, BorderLayout.CENTER);
			dia.add(pa2, BorderLayout.SOUTH);
			dia.setSize(wid, hei);
			dia.setLocation(dim.width / 2 - wid / 2, dim.height / 2 - hei / 2);
			dia.setVisible(true);

			return dia;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();

			if (menu_m1 == obj) {
				createDialog("게임방법", diamsg, 400, 220);
			}

			if (menu_m2 == obj) {
				createDialog("제작자", "전형진, 김민주, 곽재연", 300, 150);

			}

			try {
				isr = new InputStreamReader(socket.getInputStream());
				osw = new OutputStreamWriter(socket.getOutputStream());
				bw = new BufferedWriter(osw);
				br = new BufferedReader(isr);

				if (obj == jbtns[0]) {// 1p
					bw.write("1카드오픈");
					bw.newLine();
					bw.flush();
				} else if (obj == jbtns[2]) {// 2p
					bw.write("2카드오픈");
					bw.newLine();
					bw.flush();
				} else if (obj == jbtns[3]) {// 3p
					bw.write("3카드오픈");
					bw.newLine();
					bw.flush();
				} else if (obj == jbtns[1]) {// 4p
					bw.write("4카드오픈");
					bw.newLine();
					bw.flush();
				} else if (obj == jbtns[4]) {// bell 중앙
					bw.write("종누름");
					bw.newLine();
					bw.flush();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}// actionperformed

		public GridBagConstraints gridcons(int x, int y) {
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.gridx = x;
			constraints.gridy = y;
			constraints.gridwidth = 1;
			constraints.gridheight = 1;
			constraints.weightx = 1.0;
			constraints.weighty = 1.0;
			constraints.fill = GridBagConstraints.NONE;
			return constraints;
		}// gridcons

		public Haliui(Socket socket, int position, boolean visible) {
			this.socket = socket;
			this.position = position;
			System.out.println("player" + position);

			p1 = new Panel();
			p2 = new Panel();
			p3 = new Panel(new GridBagLayout());
			p4 = new Panel(new GridBagLayout());
			p5 = new Panel(new GridBagLayout());

			p2.setBackground(color3); // 상단
			p3.setBackground(color2); // 카드윗줄
			p4.setBackground(color1); // 종부분
			p5.setBackground(color2); // 카드아랫줄

			for (int i = 1; i < 6; i++) {
				Image img = tool.createImage("card.jpg");
				Icon icon = new ImageIcon(img);
				jbtns[i - 1] = new JButton();
				jbtns[i - 1].setIcon(icon);
				jbtns[i - 1].setBorderPainted(false);
				jbtns[i - 1].setFocusPainted(false);
				jbtns[i - 1].setBackground(null);
				jbtns[i - 1].addActionListener(this);
			}
			jbtns[4].setIcon(new ImageIcon("bell1.png"));
			jbtns[4].addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					jbtns[4].setIcon(new ImageIcon("bell_pressed.png"));
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					jbtns[4].setIcon(new ImageIcon("bell1.png"));
				}
			});

			if (position == 0) {// 1p 왼쪽 위 11시방향
				jbtns[1].setEnabled(false);
				jbtns[2].setEnabled(false);
				jbtns[3].setEnabled(false);
			} else if (position == 1) {// 2p 왼쪽 아래 7시방향
				jbtns[0].setEnabled(false);
				jbtns[1].setEnabled(false);
				jbtns[3].setEnabled(false);
			} else if (position == 2) {// 3p 오른쪽 아래 5시방향
				jbtns[0].setEnabled(false);
				jbtns[1].setEnabled(false);
				jbtns[2].setEnabled(false);
			} else if (position == 3) {// 4p 오른쪽 위 1시방향
				jbtns[0].setEnabled(false);
				jbtns[2].setEnabled(false);
				jbtns[3].setEnabled(false);
			}
			jla1 = new JLabel(new ImageIcon("bincard.jpg"));
			jla2 = new JLabel(new ImageIcon("bincard.jpg"));
			jla3 = new JLabel(new ImageIcon("bincard.jpg"));
			jla4 = new JLabel(new ImageIcon("bincard.jpg"));

			Panel p8 = new Panel(new BorderLayout());
			la6 = new Label("    [1P] 카드 수 : 14");
			p8.add(jbtns[0], BorderLayout.CENTER);
			p8.add(la6, BorderLayout.NORTH);
			p3.add(p8, gridcons(0, 0));

			// jla2.setIcon(cardImages.get(33));
			p3.add(jla1, gridcons(1, 0));// 오픈카드
			p3.add(jla2, gridcons(3, 0));// 오픈카드

			Panel p9 = new Panel(new BorderLayout());
			la7 = new Label("    [4P] 카드 수 : 14");
			p9.add(jbtns[1], BorderLayout.CENTER);
			p9.add(la7, BorderLayout.NORTH);
			p3.add(p9, gridcons(4, 0));
			p4.add(jbtns[4], gridcons(1, 0));// 종 버튼
			Panel p7 = new Panel(new BorderLayout());
			la5 = new Label("    [2P] 카드 수 : 14");
			p7.add(jbtns[2], BorderLayout.CENTER);
			p7.add(la5, BorderLayout.NORTH);
			p5.add(p7, gridcons(0, 0));

			p5.add(jla3, gridcons(1, 0));// 오픈카드
			p5.add(jla4, gridcons(3, 0));// 오픈카드

			Panel p6 = new Panel(new BorderLayout());
			la4 = new Label("    [3P] 카드 수 : 14");
			p6.add(jbtns[3], BorderLayout.CENTER);
			p6.add(la4, BorderLayout.NORTH);
			p5.add(p6, gridcons(4, 0));

			p1.setLayout(new GridLayout(3, 1));
			p1.add(p3); // 윗줄
			p1.add(p4); // 종 위치
			p1.add(p5); // 아랫줄

			add(p2, BorderLayout.NORTH);
			ta = new TextArea("", 3, 70, 1);
			ta.setBackground(color4);
			ta.setEditable(false);
			ta.setText("WELCOME\n");
			p2.add(ta);
			add(p1, BorderLayout.CENTER);
			setVisible(visible);
			setSize(800, 800);
			setLocation(dim.width / 2 - 400, dim.height / 2 - 400);

			MenuBar mb = new MenuBar();
			Menu m1 = new Menu("도움말");
			menu_m1 = new MenuItem("게임방법");
			menu_m2 = new MenuItem("제작자");
			menu_m1.addActionListener(this);
			menu_m2.addActionListener(this);
			m1.add(menu_m1);
			m1.add(menu_m2);
			mb.add(m1);

			setMenuBar(mb);
			setTitle("할리갈리 게임");

			addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					dispose();
				}
			});// addwindwolistener

		}// Haliui생성자

	}// Haliuicalss
}// testClientClass