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
	// static JLabel[] cardImage = new JLabel[56]; // card �׸�
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
	static Color color4 = new Color(255, 255, 255); // �ý��۸޼��� ���
	static Color color5 = new Color(242, 222, 255); // �� ������ �ٲ�� ��

	
	/*
	 * 00 01 02 03 04 05 06 07 08 09 010 011 012 013 �ٳ���
	 * 10 11 12 13 14 15 16 17 18 19 110 111 112 113 ����
	 * 20 21 22 23 24 25 26 27 28 29 210 211 212 213 �ڵ�
	 * 30 31 32 33 34 35 36 37 38 39 310 311 312 313 ����
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
			bw.write("���");
			bw.newLine();
			bw.flush();
			String numberOfPlayers = null;

			while ((numberOfPlayers = br.readLine()) != null) {

				if (numberOfPlayers.equals("4")) {
					ta.append("�������� 4P ���� ��������\n");
					ta.append("���� ����! 1P���� �����ϼ���\n");
					break;
				} else if (numberOfPlayers.equals("3")) {
					ta.append("�ڡڡڡ� 3P ���� �ڡڡڡ�\n");
				} else if (numberOfPlayers.equals("2")) {
					ta.append("�������� 2P ���� ��������\n");
				} else if (numberOfPlayers.equals("1")) {
					ta.append("�ߡߡߡ� 1P ���� �ߡߡߡ�\n");
				} else {
					ta.append("PLAYER �� ��ٸ��� ���Դϴ� ... \n");
				}
				ta.revalidate();
			}
			bw.write("����");
			bw.newLine();
			bw.flush();

			
			// jbtns[0] = 1P ���� ����
			jbtns[1].setEnabled(false);
			jbtns[2].setEnabled(false);
			jbtns[3].setEnabled(false);

			String msg = null;
			while ((msg = br.readLine()) != null) {

				if (position == 0) {

					if (!ta.getText().contains("1P �й�")
							&& msg.contains("4ī�����")) {
						jbtns[0].setEnabled(true);
					} else if (ta.getText().contains("4P �й�")
							&& msg.contains("3ī�����")) {
						jbtns[0].setEnabled(true);
					} else if (ta.getText().contains("3P �й�")
							&& ta.getText().contains("4P �й�")
							&& msg.contains("2ī�����")) {
						jbtns[0].setEnabled(true);
					}

					if (ta.getText().contains("1P �й�")) {
						jbtns[4].setEnabled(false);
						jla1.setEnabled(false);
						la6.setEnabled(false);
						break;
					}

				} else if (position == 1) {// 2p

					if (!ta.getText().contains("2P �й�")
							&& msg.contains("1ī�����")) {
						jbtns[2].setEnabled(true);
					} else if (ta.getText().contains("1P �й�")
							&& msg.contains("4ī�����")) {
						jbtns[2].setEnabled(true);
					} else if (ta.getText().contains("1P �й�")
							&& ta.getText().contains("4P �й�")
							&& msg.contains("3ī�����")) {
						jbtns[2].setEnabled(true);
					}
					if (ta.getText().contains("2P �й�")) {
						jbtns[4].setEnabled(false);
						jla3.setEnabled(false);
						la5.setEnabled(false);
						break;
					}

				} else if (position == 2) {

					if (!ta.getText().contains("3P �й�")
							&& msg.contains("2ī�����")) {
						jbtns[3].setEnabled(true);
					} else if (ta.getText().contains("2P �й�")
							&& msg.contains("1ī�����")) {
						jbtns[3].setEnabled(true);
					} else if (ta.getText().contains("2P �й�")
							&& ta.getText().contains("1P �й�")
							&& msg.contains("4ī�����")) {
						jbtns[3].setEnabled(true);
					}

					if (ta.getText().contains("3P �й�")) {
						jbtns[4].setEnabled(false);
						jla4.setEnabled(false);
						la4.setEnabled(false);
						break;
					}

				} else if (position == 3) {

					if (!ta.getText().contains("4P �й�")
							&& msg.contains("3ī�����")) {
						jbtns[1].setEnabled(true);
					}

					else if (ta.getText().contains("3P �й�")
							&& msg.contains("2ī�����")) {
						jbtns[1].setEnabled(true);
					} else if (ta.getText().contains("3P �й�")
							&& ta.getText().contains("2P �й�")
							&& msg.contains("1ī�����")) {
						jbtns[1].setEnabled(true);
					}

					if (ta.getText().contains("4P �й�")) {
						jbtns[4].setEnabled(false);
						jla2.setEnabled(false);

						break;
					}
				}

				// 6547

				if (msg.contains("1ī�����")) {
					jbtns[0].setEnabled(false);
					String left = msg.substring(msg.lastIndexOf("��") + 1);
					System.out.println(left);
					la6.setText("    [1P] ī�� �� : " + left);
					la6.setBackground(color5);
					Thread.sleep(70);
					la6.setBackground(null);

					if (msg.contains("�й�") || left.equals("0")) {
						ta.append("[1P �й�]\n");
						jla1.setIcon(new ImageIcon("bincard.jpg"));
						jbtns[0].setEnabled(false);
						// jbtns[4].setEnabled(false);
						jla1.setEnabled(false);
						la6.setVisible(false);
					} else {
						System.out.println(msg.substring(0, msg.indexOf("1ī")));
						String cardImage = msg.substring(0, msg.indexOf("1ī"));
						int idx = Integer.parseInt(cardImage);
						jla1.setIcon(cardImages.get(idx));
						// p3.add(jla1, haliui.gridcons(1, 0));
					}
				} else if (msg.contains("4ī�����")) {
					jbtns[1].setEnabled(false);
					String left = msg.substring(msg.lastIndexOf("��") + 1);
					System.out.println(left);
					la7.setText("    [4P] ī�� �� : " + left);
					la7.setBackground(color5);
					Thread.sleep(70);
					la7.setBackground(null);

					if (msg.contains("�й�") || left.equals("0")) {
						ta.append("[4P �й�]\n");
						jbtns[1].setEnabled(false);
						// jbtns[4].setEnabled(false);
						jla2.setEnabled(false);
						la7.setVisible(false);
					} else {
						String cardImage = msg.substring(0, msg.indexOf("4ī"));
						int idx = Integer.parseInt(cardImage);
						jla2.setIcon(cardImages.get(idx));
						// p3.add(jla2, haliui.gridcons(3, 0));
					}
				} else if (msg.contains("2ī�����")) {
					jbtns[2].setEnabled(false);
					String left = msg.substring(msg.lastIndexOf("��") + 1);
					System.out.println(left);
					la5.setText("    [2P] ī�� �� : " + left);
					la5.setBackground(color5);
					Thread.sleep(70);
					la5.setBackground(null);

					if (msg.contains("�й�") || left.equals("0")) {
						ta.append("[2P �й�]\n");
						jbtns[2].setEnabled(false);
						// jbtns[4].setEnabled(false);
						jla3.setEnabled(false);
						la5.setVisible(false);
					} else {
						String cardImage = msg.substring(0, msg.indexOf("2ī"));
						int idx = Integer.parseInt(cardImage);
						jla3.setIcon(cardImages.get(idx));
						// p5.add(jla3, haliui.gridcons(1, 0));
					}
				} else if (msg.contains("3ī�����")) {
					jbtns[3].setEnabled(false);
					String left = msg.substring(msg.lastIndexOf("��") + 1);
					System.out.println(left);
					la4.setText("    [3P] ī�� �� : " + left);
					la4.setBackground(color5);
					Thread.sleep(70);
					la4.setBackground(null);

					if (msg.contains("�й�") || left.equals("0")) {
						ta.append("[3P �й�]\n");
						jbtns[3].setEnabled(false);
						// jbtns[4].setEnabled(false);
						jla4.setEnabled(false);
						la4.setVisible(false);
					} else {
						String cardImage = msg.substring(0, msg.indexOf("3ī"));
						int idx = Integer.parseInt(cardImage);
						jla4.setIcon(cardImages.get(idx));
						// p5.add(jla4, haliui.gridcons(3, 0));
					}

					// thisPlayer = ���� ������� playerStrema Index + 1�� ����ؼ� �ο�
				} else if (msg.contains("����") || msg.contains("����")) {
					String player01size = msg.substring(msg.indexOf("01") + 2,
							msg.indexOf("02"));
					String player02size = msg.substring(msg.indexOf("02") + 2,
							msg.indexOf("03"));
					String player03size = msg.substring(msg.indexOf("03") + 2,
							msg.indexOf("04"));
					String player04size = msg.substring(msg.indexOf("04") + 2);

					// String posi = msg.substring(msg.indexOf("[") + 1,
					// msg.indexOf("P"));
					if (msg.contains("����")) {
						jla1.setIcon(new ImageIcon("bincard.jpg"));
						jla2.setIcon(new ImageIcon("bincard.jpg"));
						jla3.setIcon(new ImageIcon("bincard.jpg"));
						jla4.setIcon(new ImageIcon("bincard.jpg"));
					} // ifEnd

					System.out.println("üũ");
					// System.out.println(posi);
					// if (posi.contains("1")) {
					System.out.println("üũ2");
					la6.setText("    [1P] ī�� �� " + player01size);
					// } else if (posi.contains("2")) {
					la5.setText("    [2P] ī�� �� " + player02size);
					// } else if (posi.contains("3")) {
					la4.setText("    [3P] ī�� �� " + player03size);
					// } else if (posi.contains("4")) {
					la7.setText("    [4P] ī�� �� " + player04size);
					// }
					ta.append(msg.substring(0, msg.lastIndexOf("!")) + "\n");
					System.out.println(msg);

				} else if (msg.contains("�¸�")) {

					ta.append(msg + "\n");
					break;

				} else {
					if (msg.contains("[1P �й�] 1P�� ���� ī�尡 �����ϴ�.")) {
						jla1.setEnabled(false);
					}
					if (msg.contains("[4P �й�] 4P�� ���� ī�尡 �����ϴ�.")) {
						jla2.setEnabled(false);
					}
					if (msg.contains("[2P �й�] 2P�� ���� ī�尡 �����ϴ�.")) {
						jla3.setEnabled(false);
					}
					if (msg.contains("[3P �й�] 3P�� ���� ī�尡 �����ϴ�.")) {
						jla4.setEnabled(false);
					}
					ta.append(msg + "\n");
				}
				ta.revalidate();
				// if (!(msg.contains("����") || msg.contains("����")))
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
				ta.append("�����ϼ̽��ϴ�. \n");
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
		// String diamsg = "<html>��<BR/>��</html>";

		String diamsg = "<html>1. 1P���� �ݽð�������� ���ư��� ī�带 ���ϴ�.<br/>"
				+ "2. ���ĳ��� ī��� �߿��� ���� ������ 5���� �Ǹ� ���� Ĩ�ϴ�.<br/>"
				+ "3. ���� ���� ���� ģ ����� �׶�����<br/>" + "4. ���ĳ��� ī����� ��� �������ϴ�.<br/>"
				+ "5. ���� �߸� ġ�� �ٸ� ����鿡�� ī�带 ���徿 �ݴϴ�.<br/>"
				+ "6. ���������� ī�带 ���� �ִ� ����� �̱�ϴ�.</html>";

		public Dialog createDialog(String title, String contents, int wid,
				int hei) {

			Panel pa1 = new Panel(new FlowLayout());
			Panel pa2 = new Panel(new FlowLayout());
			Dialog dia = new Dialog(this, title);
			JLabel diala = new JLabel(contents);
			diabtn = new Button("Ȯ��");
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
				createDialog("���ӹ��", diamsg, 400, 220);
			}

			if (menu_m2 == obj) {
				createDialog("������", "������, �����, ���翬", 300, 150);

			}

			try {
				isr = new InputStreamReader(socket.getInputStream());
				osw = new OutputStreamWriter(socket.getOutputStream());
				bw = new BufferedWriter(osw);
				br = new BufferedReader(isr);

				if (obj == jbtns[0]) {// 1p
					bw.write("1ī�����");
					bw.newLine();
					bw.flush();
				} else if (obj == jbtns[2]) {// 2p
					bw.write("2ī�����");
					bw.newLine();
					bw.flush();
				} else if (obj == jbtns[3]) {// 3p
					bw.write("3ī�����");
					bw.newLine();
					bw.flush();
				} else if (obj == jbtns[1]) {// 4p
					bw.write("4ī�����");
					bw.newLine();
					bw.flush();
				} else if (obj == jbtns[4]) {// bell �߾�
					bw.write("������");
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

			p2.setBackground(color3); // ���
			p3.setBackground(color2); // ī������
			p4.setBackground(color1); // ���κ�
			p5.setBackground(color2); // ī��Ʒ���

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

			if (position == 0) {// 1p ���� �� 11�ù���
				jbtns[1].setEnabled(false);
				jbtns[2].setEnabled(false);
				jbtns[3].setEnabled(false);
			} else if (position == 1) {// 2p ���� �Ʒ� 7�ù���
				jbtns[0].setEnabled(false);
				jbtns[1].setEnabled(false);
				jbtns[3].setEnabled(false);
			} else if (position == 2) {// 3p ������ �Ʒ� 5�ù���
				jbtns[0].setEnabled(false);
				jbtns[1].setEnabled(false);
				jbtns[2].setEnabled(false);
			} else if (position == 3) {// 4p ������ �� 1�ù���
				jbtns[0].setEnabled(false);
				jbtns[2].setEnabled(false);
				jbtns[3].setEnabled(false);
			}
			jla1 = new JLabel(new ImageIcon("bincard.jpg"));
			jla2 = new JLabel(new ImageIcon("bincard.jpg"));
			jla3 = new JLabel(new ImageIcon("bincard.jpg"));
			jla4 = new JLabel(new ImageIcon("bincard.jpg"));

			Panel p8 = new Panel(new BorderLayout());
			la6 = new Label("    [1P] ī�� �� : 14");
			p8.add(jbtns[0], BorderLayout.CENTER);
			p8.add(la6, BorderLayout.NORTH);
			p3.add(p8, gridcons(0, 0));

			// jla2.setIcon(cardImages.get(33));
			p3.add(jla1, gridcons(1, 0));// ����ī��
			p3.add(jla2, gridcons(3, 0));// ����ī��

			Panel p9 = new Panel(new BorderLayout());
			la7 = new Label("    [4P] ī�� �� : 14");
			p9.add(jbtns[1], BorderLayout.CENTER);
			p9.add(la7, BorderLayout.NORTH);
			p3.add(p9, gridcons(4, 0));
			p4.add(jbtns[4], gridcons(1, 0));// �� ��ư
			Panel p7 = new Panel(new BorderLayout());
			la5 = new Label("    [2P] ī�� �� : 14");
			p7.add(jbtns[2], BorderLayout.CENTER);
			p7.add(la5, BorderLayout.NORTH);
			p5.add(p7, gridcons(0, 0));

			p5.add(jla3, gridcons(1, 0));// ����ī��
			p5.add(jla4, gridcons(3, 0));// ����ī��

			Panel p6 = new Panel(new BorderLayout());
			la4 = new Label("    [3P] ī�� �� : 14");
			p6.add(jbtns[3], BorderLayout.CENTER);
			p6.add(la4, BorderLayout.NORTH);
			p5.add(p6, gridcons(4, 0));

			p1.setLayout(new GridLayout(3, 1));
			p1.add(p3); // ����
			p1.add(p4); // �� ��ġ
			p1.add(p5); // �Ʒ���

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
			Menu m1 = new Menu("����");
			menu_m1 = new MenuItem("���ӹ��");
			menu_m2 = new MenuItem("������");
			menu_m1.addActionListener(this);
			menu_m2.addActionListener(this);
			m1.add(menu_m1);
			m1.add(menu_m2);
			mb.add(m1);

			setMenuBar(mb);
			setTitle("�Ҹ����� ����");

			addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					dispose();
				}
			});// addwindwolistener

		}// Haliui������

	}// Haliuicalss
}// testClientClass