package com.bit.day31;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

import java.sql.*;
import java.util.Properties;

public class Ex15 extends JFrame {
	JLabel[] table=new JLabel[50];

	private JPanel contentPane;
	private JTextField addnum;
	private JTextField addname;
	private JTextField addkor;
	private JTextField addeng;
	private JTextField addmath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex15 frame = new Ex15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 895, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("학생성적관리프로그램(ver 0.4.0)");
		label.setFont(new Font("궁서체", Font.BOLD, 24));
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.EAST);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btn1 = new JButton("\uC804\uCCB4\uBCF4\uAE30");
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.BOTH;
		gbc_btn1.insets = new Insets(0, 0, 5, 0);
		gbc_btn1.gridx = 0;
		gbc_btn1.gridy = 1;
		panel_2.add(btn1, gbc_btn1);
		
		JButton btn2 = new JButton("\uC785\uB825");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn2.insets = new Insets(0, 0, 5, 0);
		gbc_btn2.gridx = 0;
		gbc_btn2.gridy = 3;
		panel_2.add(btn2, gbc_btn2);
		
		JButton btn3 = new JButton("\uC218\uC815");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn3.insets = new Insets(0, 0, 5, 0);
		gbc_btn3.gridx = 0;
		gbc_btn3.gridy = 6;
		panel_2.add(btn3, gbc_btn3);
		
		JButton btn4 = new JButton("\uC0AD\uC81C");
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn4.insets = new Insets(0, 0, 5, 0);
		gbc_btn4.gridx = 0;
		gbc_btn4.gridy = 9;
		panel_2.add(btn4, gbc_btn4);
		
		JButton btn5 = new JButton("\uC885\uB8CC"); // 종료
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn5.gridx = 0;
		gbc_btn5.gridy = 11;
		panel_2.add(btn5, gbc_btn5);
		
		JPanel center = new JPanel();

		
		contentPane.add(center, BorderLayout.CENTER);
		center.setLayout(new GridLayout(11, 5, 0, 0));
		
		JLabel label_1 = new JLabel("\uD559\uBC88");
		center.add(label_1);
		
		JLabel label_2 = new JLabel("\uC774\uB984");
		center.add(label_2);
		
		JLabel label_3 = new JLabel("\uAD6D\uC5B4");
		center.add(label_3);
		
		JLabel label_4 = new JLabel("\uC601\uC5B4");
		center.add(label_4);
		
		JLabel label_5 = new JLabel("\uC218\uD559");
		center.add(label_5);
		
		//////////////////////////////////////////////////////////////////////////
		for(int i=0; i<table.length; i++){
			table[i]=new JLabel("");
			center.add(table[i]);
		}
		//////////////////////////////////////////////////////////////////////////
		JPanel center2 = new JPanel(); // 입력창
			
		center2.setVisible(false);
		contentPane.add(center2, BorderLayout.CENTER);
		GridBagLayout gbl_center2 = new GridBagLayout();
		gbl_center2.columnWidths = new int[]{0, 0, 0};
		gbl_center2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_center2.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_center2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		center2.setLayout(gbl_center2);
		
		JLabel lblNewLabel = new JLabel("\uC785\uB825\uD398\uC774\uC9C0");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		center2.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_0 = new JLabel("\uD559\uBC88");
		GridBagConstraints gbc_lblNewLabel_0 = new GridBagConstraints();
		gbc_lblNewLabel_0.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_0.gridx = 0;
		gbc_lblNewLabel_0.gridy = 1;
		center2.add(lblNewLabel_0, gbc_lblNewLabel_0);
		
		addnum = new JTextField();
		GridBagConstraints gbc_addnum = new GridBagConstraints();
		gbc_addnum.insets = new Insets(0, 0, 5, 0);
		gbc_addnum.fill = GridBagConstraints.HORIZONTAL;
		gbc_addnum.gridx = 1;
		gbc_addnum.gridy = 1;
		center2.add(addnum, gbc_addnum);
		addnum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		center2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		addname = new JTextField();
		GridBagConstraints gbc_addname = new GridBagConstraints();
		gbc_addname.insets = new Insets(0, 0, 5, 0);
		gbc_addname.fill = GridBagConstraints.HORIZONTAL;
		gbc_addname.gridx = 1;
		gbc_addname.gridy = 2;
		center2.add(addname, gbc_addname);
		addname.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uAD6D\uC5B4");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		center2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		addkor = new JTextField();
		GridBagConstraints gbc_addkor = new GridBagConstraints();
		gbc_addkor.insets = new Insets(0, 0, 5, 0);
		gbc_addkor.fill = GridBagConstraints.HORIZONTAL;
		gbc_addkor.gridx = 1;
		gbc_addkor.gridy = 3;
		center2.add(addkor, gbc_addkor);
		addkor.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uC601\uC5B4");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		center2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		addeng = new JTextField();
		GridBagConstraints gbc_addeng = new GridBagConstraints();
		gbc_addeng.insets = new Insets(0, 0, 5, 0);
		gbc_addeng.fill = GridBagConstraints.HORIZONTAL;
		gbc_addeng.gridx = 1;
		gbc_addeng.gridy = 4;
		center2.add(addeng, gbc_addeng);
		addeng.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uC218\uD559");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 5;
		center2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		addmath = new JTextField();
		GridBagConstraints gbc_addmath = new GridBagConstraints();
		gbc_addmath.insets = new Insets(0, 0, 5, 0);
		gbc_addmath.fill = GridBagConstraints.HORIZONTAL;
		gbc_addmath.gridx = 1;
		gbc_addmath.gridy = 5;
		center2.add(addmath, gbc_addmath);
		addmath.setColumns(10);
		JButton addBtn = new JButton("\uC785\uB825");
		GridBagConstraints gbc_addBtn = new GridBagConstraints();
		gbc_addBtn.gridx = 1;
		gbc_addBtn.gridy = 6;
		center2.add(addBtn, gbc_addBtn);
		
		btn1.addActionListener(new ActionListener() { // 전체보기
			@Override
			public void actionPerformed(ActionEvent e) {
				
				center.setVisible(true);
				center2.setVisible(false);
				contentPane.add(center, BorderLayout.CENTER);
				
				String sql = "select * from student";
				new oracle.jdbc.driver.OracleDriver();
				
				String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
				java.util.Properties prop = new Properties();
				prop.setProperty("user", "scott");
				prop.setProperty("password", "tiger");
				
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				
				try {
					conn = DriverManager.getConnection(url, prop);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					int cnt = 0;
					while(rs.next()) {
						for(int i=1; i<6; i++) {
							table[cnt++].setText(rs.getString(i));
						}
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					try {
						if(rs != null) rs.close();
						if(stmt != null) stmt.close();
						if(conn != null) conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				
			}
		});
	
		btn2.addActionListener(new ActionListener() { // 입력

			@Override
			public void actionPerformed(ActionEvent e) {
				center.setVisible(false);
				center2.setVisible(true);
				contentPane.add(center2, BorderLayout.CENTER);
			}
			
		});
		
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String param1 = addnum.getText();
				String param2 = addname.getText();
				String param3 = addkor.getText();
				String param4 = addeng.getText();
				String param5 = addmath.getText();
				addnum.setText("");
				addname.setText("");
				addkor.setText("");
				addeng.setText("");
				addmath.setText("");
				String sql = "insert into student values (";
				sql += param1 + " ,'" + param2 + "',"+ param3 + ","+ param4 + ","+ param5 + ")";
				// insert into student value (100, 'test', 90, 80, 70);
//				System.out.println(sql);
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				Properties prop = new Properties();
				prop.setProperty("user", "scott");
				prop.setProperty("password", "tiger");
				new oracle.jdbc.driver.OracleDriver();
				Connection conn = null;
				Statement stmt = null;
				
				try {
					conn = DriverManager.getConnection(url, prop);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					try {
						if(conn != null) conn.close();
						if(stmt != null) stmt.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				
				
			}
		});
		
		
		
	}
}