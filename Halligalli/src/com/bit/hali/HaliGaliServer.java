package com.bit.hali;

import java.net.*;
import java.io.*;
import java.util.*;

public class HaliGaliServer {

	static final int PORT = 8080;
	static int cnt = 0;
	static int position = 0;
	static HashMap<String, Socket> playerSu = new HashMap<>();
	static ArrayList<BufferedWriter> playerStream = new ArrayList<>();
	static int numberOfPlayers = 4;
	static int[][] allCard = new int[4][14];
	static String[] card2;
	static String[] card3 = new String[56];
	Vector<String> player01 = new Vector<String>();
	Vector<String> player02 = new Vector<String>();
	Vector<String> player03 = new Vector<String>();
	Vector<String> player04 = new Vector<String>();
	static ArrayList<String> openedCards = new ArrayList<>();
	static Vector<String> allOpenedCards = new Vector<>();

	public void setAllCard() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 14; j++) {
				allCard[i][j] = j;
			}
		} // outforEnd

	}// setCard

	public void cardShuffle(int[][] arr, int count) {
		String[][] card = new String[4][14];
		card2 = new String[56];
		int card2Length = 0;

		for (int i = 0; i < 4; i++) {// ���ھտ� ���������ٿ��� ���ڿ���ȯ, �迭����.
			for (int j = 0; j < 14; j++) {
				card[i][j] = i + "" + arr[i][j];
			}
		} // outforend

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 14; j++) {
				card2[card2Length] = card[i][j];
				card2Length++;
			}
		} // outforend
		System.arraycopy(card2, 0, card3, 0, 56);// �������μ������� �迭����.
		// Ŭ���̾�Ʈ �����̹����� �񱳿�

		for (int k = 0; k < count; k++) {
			int i = (int) (Math.random() * card2.length);
			int j = (int) (Math.random() * card2.length);

			String tmp = card2[i];
			card2[i] = card2[j];
			card2[j] = tmp;
		}
	}// cardShuffle

	public void cardShuffle(Vector<String> arr, int count) {

		String[] temp = new String[arr.size()];

		for (int i = 0; i < arr.size(); i++) {
			temp[i] = arr.get(i);
		}
		for (int k = 0; k < count; k++) {
			int i = (int) (Math.random() * temp.length);
			int j = (int) (Math.random() * temp.length);

			String tmp = temp[i];
			temp[i] = temp[j];
			temp[j] = tmp;
		}
		arr.removeAllElements();
		for (int i = 0; i < temp.length; i++) {
			arr.add(temp[i]);
		}

	}// cardShuffle

	public void cardDivide() {

		String[] player1 = new String[14];
		String[] player2 = new String[14];
		String[] player3 = new String[14];
		String[] player4 = new String[14];

		int idx = 0;
		for (int i = 0; i < 14; i++) {
			player1[idx] = card2[i];
			player2[idx] = card2[i + 14];
			player3[idx] = card2[i + 28];
			player4[idx] = card2[i + 42];
			idx++;
		}

		for (int j = 0; j < 14; j++) {
			player01.add(player1[j]);
			player02.add(player2[j]);
			player03.add(player3[j]);
			player04.add(player4[j]);
		}

	}// cardDivide

	public HaliGaliServer() {
		setAllCard();// ī�����
		cardShuffle(allCard, 200);// ī�弯��
		cardDivide();// 4����ϱ�
		Collections.synchronizedList(playerStream);
		Collections.synchronizedList(allOpenedCards);
		Collections.synchronizedList(player01);
		Collections.synchronizedList(player02);
		Collections.synchronizedList(player03);
		Collections.synchronizedList(player04);
		Collections.synchronizedMap(playerSu);

	}// TestServer������

	public static void main(String[] args) {
		HaliGaliServer me = new HaliGaliServer();
		me.startThread();
	}// main

	public synchronized void startThread() {

		ServerSocket svSocket = null;

		try {
			// System.out.println("server open");
			svSocket = new ServerSocket(PORT, 4);

			while (true) {// infinity loop

				System.out.println("waiting for accessing");
				Socket socket = svSocket.accept();
				// System.out.println(socket.getInetAddress() + "���� �����ϼ̽��ϴ�. ");

				TestThread th = new TestThread(socket, position);
				th.start(); // player thread

				playerSu.put(cnt + "key", socket);
				cnt++;// 0123 Ű��.

				// System.out.println("player : " + playersu.size());
				if (playerSu.size() == 4) {
					System.out.println("server is full");

				} // player4��Ǹ� accept����

				if ((playerSu.size() - 1) == position) {
					position++;
				}
			} // while
		} catch (IOException e) {
			position = 0;
			e.printStackTrace();
		}

	}// startThread

	class TestThread extends Thread {
		Socket socket;
		int position;
		int playerid;
		InetAddress ia;
		InputStream is = null;
		OutputStream os = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;

		TestThread(Socket socket, int position) {
			this.socket = socket;
			ia = socket.getInetAddress();
			playerid = ia.hashCode();
			this.position = position;

		}

		public void openedCards(String card) {
			openedCards.add(card);
			System.out.println(playerSu.size() + "    �̰Ŵ� ���� �����ϴ� ����� ������");
			if (openedCards.size() > playerSu.size()) {
				openedCards.remove(openedCards.get(0));
			} // if//firscard delete

			allOpenedCards.add(card);// ���µǸ鼭 ���� ī���

			System.out.println("����ī�������" + openedCards.size());
		}// openedCards

		public int numberOfFruit(int idx) {
			int fruit = 0;

			switch (Integer.parseInt(openedCards.get(idx).substring(1))) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				fruit = 1;
				break;
			case 5:
			case 6:
			case 7:
				fruit = 2;
				break;
			case 8:
			case 9:
			case 10:
				fruit = 3;
				break;

			case 11:
			case 12:
				fruit = 4;
				break;
			case 13:
				fruit = 5;
				break;
			default:
				break;
			}// switch

			return fruit;
		}

		public String fruitsValidate() {

			int[] fru0 = new int[4];
			int[] fru1 = new int[4];
			int[] fru2 = new int[4];
			int[] fru3 = new int[4];

			for (int i = 0; i < openedCards.size(); i++) {

				char fruit = openedCards.get(i).charAt(0);
				System.out.println(fruit);
				if (fruit == '0') {
					fru0[i] = numberOfFruit(i);
				} else if (fruit == '1') {
					fru1[i] = numberOfFruit(i);
				} else if (fruit == '2') {
					fru2[i] = numberOfFruit(i);
				} else if (fruit == '3') {
					fru3[i] = numberOfFruit(i);
				}
			} // for

			int fruitSum0 = 0;
			int fruitSum1 = 0;
			int fruitSum2 = 0;
			int fruitSum3 = 0;

			for (int i = 0; i < fru0.length; i++) {
				fruitSum0 += fru0[i];
				fruitSum1 += fru1[i];
				fruitSum2 += fru2[i];
				fruitSum3 += fru3[i];
			} // for

			System.out.println(fruitSum0);
			System.out.println(fruitSum1);
			System.out.println(fruitSum2);
			System.out.println(fruitSum3);

			if ((fruitSum0 != 0 && fruitSum0 % 5 == 0)
					|| (fruitSum1 != 0 && fruitSum1 % 5 == 0)
					|| (fruitSum2 != 0 && fruitSum2 % 5 == 0)
					|| (fruitSum3 != 0 && fruitSum3 % 5 == 0)) {
				return "����";
			} else {
				return "����";
			}
		}// fruitsValidate

		public String findCardIndex(String card) {
			String idx = null;
			for (int i = 0; i < card3.length; i++) {
				if (card3[i].equals(card)) {
					idx = i + "";
					break;
				} // if
			} // for
			return idx;
		}// findCardIndex

		@Override
		public void run() {// player�� ������ data�� ó���ؾ���.
			try {
				// playersu.get(playerid);

				is = socket.getInputStream();
				os = socket.getOutputStream();
				isr = new InputStreamReader(is);
				osw = new OutputStreamWriter(os);
				br = new BufferedReader(isr);
				bw = new BufferedWriter(osw);
				playerStream.add(bw);
				int thisPlayer = playerStream.indexOf(bw) + 1;
				numberOfPlayers = playerStream.size();

				bw.write(position + "");
				bw.newLine();
				bw.flush();

				String waiting = null;
				while ((waiting = br.readLine()) != null) {

					if (waiting.equals("����") && numberOfPlayers == 4) {
						break;
					}
					if (numberOfPlayers == 4) {
						for (int i = 0; i < playerStream.size(); i++) {
							bw = playerStream.get(i);
							bw.write(playerStream.size() + "");
							bw.newLine();
							bw.flush();
						}
						break;
					} else if (waiting.equals("���")) {
						for (int i = 0; i < playerStream.size(); i++) {
							bw = playerStream.get(i);
							bw.write(playerStream.size() + "");
							bw.newLine();
							bw.flush();
						}
					} else {
						bw.write("���");
						bw.newLine();
						bw.flush();
					}

				} // while
				System.out.println("��ü�޼��� ��¿Ϸ�");
				// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				// game start
				String msg = null;

				while ((msg = br.readLine()) != null) {
					synchronized (msg) {

						System.out.println(socket.getInetAddress());
						System.out.println("���� ī�� �� " + allOpenedCards.size());
						OutputStreamWriter bellosw = null;
						BufferedWriter bellbfw = null;
						if (msg.equals("1ī�����")) {
							System.out.println("1pī��� " + player01.size());
							try {
								String card = player01.get(0);
								openedCards(card);
								player01.remove(0);

								for (int i = 0; i < playerStream.size(); i++) {
									bw = playerStream.get(i);
									bw.write(findCardIndex(card) + "1ī�����"
											+ player01.size());
									bw.newLine();
									bw.flush();
								} // forend
							} catch (IndexOutOfBoundsException e) {

								bellosw = new OutputStreamWriter(playerSu.get(
										"0key").getOutputStream());
								bellbfw = new BufferedWriter(bellosw);
								bellbfw.write("�й�1ī�����");
								bellbfw.newLine();
								bellbfw.flush();
								playerStream.remove(bellbfw);

								for (int i = 0; i < playerStream.size(); i++) {
									bw = playerStream.get(i);
									bw.write("[1P �й�] 1P�� ���� ī�尡 �����ϴ�.");
									bw.newLine();
									bw.flush();
								} // forend
								playerSu.remove("0key");
								numberOfPlayers--;
							} // catch

						} else if (msg.equals("2ī�����")) {

							try {
								String card = player02.get(0);
								openedCards(card);
								player02.remove(0);

								for (int i = 0; i < playerStream.size(); i++) {

									bw = playerStream.get(i);
									bw.write(findCardIndex(card) + "2ī�����"
											+ player02.size());
									bw.newLine();
									bw.flush();

								} // forend
							} catch (IndexOutOfBoundsException e) {
								bellosw = new OutputStreamWriter(playerSu.get(
										"1key").getOutputStream());
								bellbfw = new BufferedWriter(bellosw);
								bellbfw.write("�й�2ī�����");
								bellbfw.newLine();
								bellbfw.flush();
								playerStream.remove(bellbfw);

								for (int i = 0; i < playerStream.size(); i++) {

									bw = playerStream.get(i);
									bw.write("[2P �й�] 2P�� ���� ī�尡 �����ϴ�.");
									bw.newLine();
									bw.flush();
								} // forend
								playerSu.remove("1key");
								numberOfPlayers--;
							} // catch
						} else if (msg.equals("3ī�����")) {

							try {
								String card = player03.get(0);
								openedCards(card);
								player03.remove(0);

								for (int i = 0; i < playerStream.size(); i++) {
									bw = playerStream.get(i);
									bw.write(findCardIndex(card) + "3ī�����"
											+ player03.size());
									bw.newLine();
									bw.flush();
								} // forend
							} catch (IndexOutOfBoundsException e) {
								bellosw = new OutputStreamWriter(playerSu.get(
										"2key").getOutputStream());
								bellbfw = new BufferedWriter(bellosw);
								bellbfw.write("�й�3ī�����");
								bellbfw.newLine();
								bellbfw.flush();
								playerStream.remove(bellbfw);

								for (int i = 0; i < playerStream.size(); i++) {
									bw = playerStream.get(i);
									bw.write("[3P �й�] 3P�� ���� ī�尡 �����ϴ�.");
									bw.newLine();
									bw.flush();
								} // forend
								playerSu.remove("2key");
								numberOfPlayers--;
							} // catch

						} else if (msg.equals("4ī�����")) {

							try {
								String card = player04.get(0);
								openedCards(card);
								player04.remove(0);

								for (int i = 0; i < playerStream.size(); i++) {
									bw = playerStream.get(i);
									bw.write(findCardIndex(card) + "4ī�����"
											+ player04.size());
									bw.newLine();
									bw.flush();
								} // forend
							} catch (IndexOutOfBoundsException e) {

								bellosw = new OutputStreamWriter(playerSu.get(
										"3key").getOutputStream());
								bellbfw = new BufferedWriter(bellosw);
								bellbfw.write("�й�4ī�����");
								bellbfw.newLine();
								bellbfw.flush();
								playerStream.remove(bellbfw);

								for (int i = 0; i < playerStream.size(); i++) {

									bw = playerStream.get(i);
									bw.write("[4P �й�] 4P�� ���� ī�尡 �����ϴ�.");
									bw.newLine();
									bw.flush();
								} // forend
								playerSu.remove("3key");
								numberOfPlayers--;
							} // catch
						} else if (msg.equals("������")) {

							String bell = fruitsValidate();// ����/���� üũ
							if (bell.equals("����")) {

								// for (int i = 0; i < playersu.size(); i++) {

								// �� ���� player
								// ã��
								System.out.println("�� ���� player " + thisPlayer);

								if (thisPlayer == 1) {
									player01.addAll(allOpenedCards);
									allOpenedCards.removeAllElements();

									openedCards.clear();
									cardShuffle(player01, 100);

								} else if (thisPlayer == 2) {
									player02.addAll(allOpenedCards);
									allOpenedCards.removeAllElements();
									openedCards.clear();
									cardShuffle(player02, 100);

								} else if (thisPlayer == 3) {
									player03.addAll(allOpenedCards);
									allOpenedCards.removeAllElements();
									openedCards.clear();
									cardShuffle(player03, 100);

								} else if (thisPlayer == 4) {
									player04.addAll(allOpenedCards);
									allOpenedCards.removeAllElements();
									openedCards.clear();
									cardShuffle(player04, 100);
								}

								for (int j = 0; j < playerStream.size(); j++) {// ��ü�޼���
									bw = playerStream.get(j);
									bw.write("[" + thisPlayer + "P " + bell
											+ "]!" + "01" + player01.size()
											+ "02" + player02.size() + "03"
											+ player03.size() + "04"
											+ player04.size()); // [ 3P ] ����
									bw.newLine();
									bw.flush();
								} // for

								// }// forend //bell���� player���� ���� ī�带 ���� ������.

								// ������������ ���� player 0123

							} else if (bell.equals("����")) {
								// for (int i = 0; i < playersu.size(); i++) {

								// �� ���� player

								// bell�߸����� �𿡰� ī�� ���徿��� �ٸ��÷��̾�� ������
								System.out.println("�÷��̾� " + thisPlayer + "P");

								if (thisPlayer == 1) {
									try {
										String card1 = player01.get(0);
										player02.add(card1);
										player01.remove(card1);

										card1 = player01.get(0);
										player03.add(card1);
										player01.remove(card1);

										card1 = player01.get(0);
										player04.add(card1);
										player01.remove(card1);

									} catch (Exception e) {
										bellosw = new OutputStreamWriter(
												playerSu.get("0key")
														.getOutputStream());
										bellbfw = new BufferedWriter(bellosw);
										bellbfw.write("�й�1ī�����");
										bellbfw.newLine();
										bellbfw.flush();
										playerStream.remove(bellbfw);
										for (int j = 0; j < playerStream.size(); j++) {
											bw = playerStream.get(j);
											bw.write("[1P �й�] 1P�� ���� ī�尡 �����ϴ�.  �й�1ī�����");
											bw.newLine();
											bw.flush();
										} // forend
										playerSu.remove("0key");
										numberOfPlayers--;
									}
								} else if (thisPlayer == 2) {
									try {
										String card1 = player02.get(0);
										player01.add(card1);
										player02.remove(card1);

										card1 = player02.get(0);
										player03.add(card1);
										player02.remove(card1);

										card1 = player02.get(0);
										player04.add(card1);
										player02.remove(card1);

									} catch (Exception e) {
										bellosw = new OutputStreamWriter(
												playerSu.get("1key")
														.getOutputStream());
										bellbfw = new BufferedWriter(bellosw);
										bellbfw.write("�й�2ī�����");
										bellbfw.newLine();
										bellbfw.flush();
										playerStream.remove(bellbfw);

										for (int j = 0; j < playerStream.size(); j++) {

											bw = playerStream.get(j);
											bw.write("[2P �й�] 2P�� ���� ī�尡 �����ϴ�. �й�2ī�����");
											bw.newLine();
											bw.flush();
										} // forend
										playerSu.remove("1key");
										numberOfPlayers--;
									}

								} else if (thisPlayer == 3) {
									try {
										String card1 = player03.get(0);
										player01.add(card1);
										player03.remove(card1);

										card1 = player03.get(0);
										player02.add(card1);
										player03.remove(card1);

										card1 = player03.get(0);
										player04.add(card1);
										player03.remove(card1);

									} catch (Exception e) {
										bellosw = new OutputStreamWriter(
												playerSu.get("2key")
														.getOutputStream());
										bellbfw = new BufferedWriter(bellosw);
										bellbfw.write("�й�3ī�����");
										bellbfw.newLine();
										bellbfw.flush();
										playerStream.remove(bellbfw);
										for (int j = 0; j < playerStream.size(); j++) {
											bw = playerStream.get(j);
											bw.write("[3P �й�] 3P�� ���� ī�尡 �����ϴ�. �й�3ī�����");
											bw.newLine();
											bw.flush();
										} // forend
										playerSu.remove("2key");
										numberOfPlayers--;
									}

								} else if (thisPlayer == 4) {
									try {
										String card1 = player04.get(0);
										player01.add(card1);
										player04.remove(card1);

										card1 = player04.get(0);
										player02.add(card1);
										player04.remove(card1);

										card1 = player04.get(0);
										player03.add(card1);
										player04.remove(card1);

									} catch (Exception e) {
										bellosw = new OutputStreamWriter(
												playerSu.get("3key")
														.getOutputStream());
										bellbfw = new BufferedWriter(bellosw);
										bellbfw.write("�й�4ī�����");
										bellbfw.newLine();
										bellbfw.flush();
										playerStream.remove(bellbfw);
										for (int j = 0; j < playerStream.size(); j++) {
											bw = playerStream.get(j);
											bw.write("[4P �й�] 4P�� ���� ī�尡 �����ϴ�.  �й�4ī�����");
											bw.newLine();
											bw.flush();
										} // forend
										playerSu.remove("3key");
										numberOfPlayers--;
									}

								} // elseifEnd
									// }// Outifend
								for (int j = 0; j < playerStream.size(); j++) {// ��ü�޼���
									bw = playerStream.get(j);
									bw.write("[" + thisPlayer + "P " + bell
											+ "] ���� �߸� �������ϴ�" + "!" + "01"
											+ player01.size() + "02"
											+ player02.size() + "03"
											+ player03.size() + "04"
											+ player04.size());
									bw.newLine();
									bw.flush();
								} // OutForEnd

								// System.out.println("4th point �÷��̾�" +
								// playerNumber);
							} // else if (bell.equals("����"))

						} // else if (msg.equals("������"))
						System.out.println("üũ1111111");
						System.out.println(playerStream.size());
						System.out.println("�÷��̾��" + playerSu.size());

						try {
							if (player01.size() == 0) {
								playerSu.remove("0key");
							}
							if (player02.size() == 0) {
								playerSu.remove("1key");
							}
							if (player03.size() == 0) {
								playerSu.remove("2key");
							}
							if (player04.size() == 0) {
								playerSu.remove("3key");
							}
						} catch (Exception e) {
						}

						int winner = 0;
						int p1 = player01.size();// 0
						int p2 = player02.size();// 8
						int p3 = player03.size();// 26
						int p4 = player04.size();// 0

						int[] win = { p1, p2, p3, p4 };
						Arrays.sort(win);
						System.out.println(Arrays.toString(win));

						winner = win[3];

						if (win[3] == player01.size()) {
							winner = 1;
						} else if (win[3] == player02.size()) {
							winner = 2;
						} else if (win[3] == player03.size()) {
							winner = 3;
						} else if (win[3] == player04.size()) {
							winner = 4;
						}

						if (playerSu.size() == 1) {

							System.out.println("üũ44444444");
							for (int i = 0; i < playerStream.size(); i++) {
								bw = playerStream.get(i);
								bw.write("�ڡڡڡڡ� [ " + winner + "P ] �¸� �ڡڡڡڡ�");
								bw.newLine();
								bw.flush();
							}
							break;

						}// if
					}// synchronized
				} // While

			} catch (IOException e) {
				e.getStackTrace();
				HaliGaliServer.position -= 1;
				System.out.println(socket.getInetAddress() + "���� �����̽��ϴ�.");

			} // catch
		}// run

	}// testThread

}