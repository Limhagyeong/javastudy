package com.sist.client;
// Home: 맛집 카테고리 출력
// 검색
// 채팅
// 오늘의 뉴스
// 커뮤니티 => 파일 입출력
import javax.swing.*;
import java.awt.*;
public class MenuPanel extends JPanel{
    public JButton b1,b2,b3,b4,b5,b6,b7;
    public MenuPanel()
    {
    	b1=new JButton("HOME");
    	b2=new JButton("맛집 검색");
    	b3=new JButton("실시간 채팅"); // 핵심
    	b4=new JButton("커뮤니티"); 
    	b5=new JButton("뉴스 검색");
    	b6=new JButton("종료");
    	b7=new JButton("쪽지 보내기");

    	
    	setLayout(new GridLayout(7, 1, 10, 10)); // 5줄에 버튼 하나를 배치하겠다 // 버튼과 버튼 사이의 간ㄴ격
    	add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);

    }
}
