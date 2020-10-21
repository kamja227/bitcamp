package com.bit.day27;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		// url
		// scheme:[//[user:password@]host[:port]][/]path[?query][#fragment]
		// ��������://������:��Ʈ��ȣ/�н�?����#������
		// ������ - �������(top) ��ư ��
		// https://search.naver.com/search.naver?query=web �� �˻�
		
		String spec = "https://www.seoul.go.kr/news/news_tender.do#view/318319"; // https secret������������ http �Ϲ�
		java.net.URL url = null;
		
		try {
			url = new URL(spec);		
			System.out.println("�������� : " + url.getProtocol()); // http
			System.out.println("������(ip) : " + url.getHost()); // www.seoul.go.kr
			// http - default port : 80;
			// https - default port : 443;
			System.out.println("��Ʈ��ȣ : " + url.getPort()); // -1
			System.out.println("��Ʈ��ȣ(default) : " + url.getDefaultPort()); // 443
			System.out.println("�н���� : " + url.getPath()); // /news/news_tender.do
			System.out.println("url���� : " + url.getQuery()); // null // �������� ����
		} catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
