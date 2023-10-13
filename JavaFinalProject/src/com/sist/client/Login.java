package com.sist.client;
import javax.swing.*;
import java.awt.*;
public class Login {
    JLabel la1,la2;
    JTextField tf; // 로그인 입력창
    JPasswordField pf; // 비밀번호 * 표시
    JButton b1,b2;
    JFrame fr=new JFrame("로그인");
    
    public Login() {
    	la1=new JLabel("ID");
    	la2=new JLabel("PASSWORD");
    	tf=new JTextField();
    	pf=new JPasswordField();
    	b1=new JButton("로그인");
    	b2=new JButton("취소");
    	
    	// layout 
    	fr.setLayout(null); // => 윈도우에 출력
    	// 직접 배치
    	la1.setBounds(10, 15, 70, 30); // 셋팅
        tf.setBounds(85, 15, 150, 30);
    	la2.setBounds(10, 50, 70, 30);
    	pf.setBounds(85, 50, 150, 30);
    	
    	JPanel p=new JPanel();
    	p.add(b1);
    	p.add(b2);
    	
    	p.setBounds(10, 85, 225, 35);
    	fr.add(la1); // 출력
    	fr.add(la2);
    	fr.add(tf);
    	fr.add(pf);
    	fr.add(p);
    	fr.setSize(265,165);
    	fr.setVisible(true);
    }
    public static void main(String[] args) {
		new Login();
	}
}
