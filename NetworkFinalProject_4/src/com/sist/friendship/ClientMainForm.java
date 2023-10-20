package com.sist.friendship;
import javax.swing.*;

import com.sist.common.ImageChange;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMainForm extends JFrame implements ActionListener{

	MenuPanel mp=new MenuPanel();
    ControllPanel cp=new ControllPanel();
    JLabel logo=new JLabel();
    public ClientMainForm()
    {
    	setLayout(null); // null => 직접 배치 
    	logo.setBounds(10, 20, 200, 150); // 좌우, 위아래, 이미지 가로, 이미지 세로
    	logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.png"), 120, 150)));
    	add(logo);
    	mp.setBounds(10, 175, 100, 250); // 좌표점을 잡아 (100,250 => 버튼 크기)
    	add(mp); // 윈도우에 출력해라
    	
    	cp.setBounds(135, 15, 865, 750);
    	add(cp);
    	setSize(1024, 768);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE); // X버튼 눌렀을 때 종료
    	// 등록
    	mp.b1.addActionListener(this);
    	mp.b2.addActionListener(this);
    	mp.b3.addActionListener(this);
    	mp.b4.addActionListener(this);
    	mp.b5.addActionListener(this);
    	mp.b6.addActionListener(this);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try
	       {
	    	   UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
	       }catch(Exception ex) {}
        new ClientMainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mp.b1)
		{
			cp.card.show(cp, "home");
			
		}
		else if(e.getSource()==mp.b2)
		{
			
		}
		else if(e.getSource()==mp.b3)
		{
			cp.card.show(cp, "chat");
		}
		else if(e.getSource()==mp.b4)
		{
			cp.card.show(cp, "board");
		}
		else if(e.getSource()==mp.b5)
		{
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==mp.b6)
		{
			System.exit(0);
		}
	}

}