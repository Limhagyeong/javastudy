package com.sist.client;
import javax.swing.*;

import com.sist.common.Function;
import com.sist.common.ImageChange;

import com.sist.manager.FoodManager;
import com.sist.vo.FoodCategoryVO;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.net.*;
/*
 *  FlowLayout : JPanel => 일자로 출력
 *       ------------
 *        버튼 버튼 .. : 일자로 출력
 *       -------------
 *  GridLayout => 일정 간격을 주고 출력
 *       ------------
 *       버튼  버튼  버튼
 *       버튼  버튼  버튼  
 *       ------------
 *  BorderLayout : JFrame
 *        -----------
 *           North 
 *        -----------
 *          |     |
 *    East  |     | West
 *          |     |
 *           Center
 *        -----------
 *           South
 *        -----------
 *  CardLayout => 감췄다가 원하는 위치를 지정하면 전환해줌
 */
public class ClientMainForm extends JFrame implements ActionListener,Runnable{
    MenuPanel mp=new MenuPanel();
    ControllPanel cp=new ControllPanel();
    JLabel logo=new JLabel();
    Login login=new Login();
    FoodManager fm=new FoodManager();
    SendMessage sm=new SendMessage();
    RecvMessage rm=new RecvMessage();
    
    
    //네트워크 관련
    Socket s; // 전화기
    OutputStream out; // 송신
    BufferedReader in; // 수신
  
    public ClientMainForm()
    {
    	setLayout(null); // null => 직접 배치 
    	logo.setBounds(10, 20, 200, 150);
    	logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.png"), 120, 150)));
    	add(logo);
    	mp.setBounds(10, 175, 100, 250); // 좌표점을 잡아 (100,250 => 버튼 크기)
    	add(mp); // 윈도우에 출력해라
    	
    	cp.setBounds(135, 15, 865, 750);
    	add(cp);
    	setSize(1024, 768);
    	//setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE); // X버튼 눌렀을 때 종료
    
    	// 등록
    	mp.b1.addActionListener(this);
    	mp.b2.addActionListener(this);
    	mp.b3.addActionListener(this);
    	mp.b4.addActionListener(this);
    	mp.b5.addActionListener(this);
    	mp.b6.addActionListener(this);
    	mp.b7.addActionListener(this);
  
    	
    	login.b1.addActionListener(this);
    	
    	ArrayList<FoodCategoryVO> list=fm.foodCategoryData(1);
    	//cp.hp.cardInit(list);
    	cp.hp.cardPrint(list);
    	
    	// 채팅 등록
    	cp.cp.tf.addActionListener(this);
    	cp.cp.b6.addActionListener(this);
    	
    	cp.cp.b1.addActionListener(this);//쪽지보내기
    	cp.cp.b2.addActionListener(this);//정보 보기
    	
    	
    	// 쪽지보내기
    	sm.b1.addActionListener(this);
    	sm.b2.addActionListener(this);
    	rm.b1.addActionListener(this);
    	rm.b2.addActionListener(this);
    	cp.cp.b3.addActionListener(this);
    	
   
    	
    	
    	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	
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
			cp.card.show(cp, "find");
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
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch (Exception ex) {
	
			}
		}
		else if(e.getSource()==login.b1)
		{
			//서버 연결
			//login.setVisible(false);
			//setVisible(true);
			String id=login.tf1.getText();
			if(id.trim().length()<1)
			{
				login.tf1.requestFocus();
				return;
			}
			String name=login.tf2.getText();
			if(name.trim().length()<1)
			{
				login.tf2.requestFocus();
				return;
			}
			String sex="";
			if(login.rb1.isSelected())
			{
				sex="남자";
			}
			else
			{
				sex="여자";
			}
			
			// 서버 연결
			connect(id, name, sex);
		}
			else if(e.getSource()==cp.cp.b3)
			{
				// 쪽지보내기
				sm.ta.setText("");
				sm.setVisible(true);
			}
			// 쪽지보내기 관련
			else if(e.getSource()==sm.b2)
			{
				sm.setVisible(false);
			}
			else if(e.getSource()==rm.b2)
			{
				rm.setVisible(false);
			}
			else if(e.getSource()==sm.b1)
			{
				
				
				String youId=sm.tf.getText();
				
				
				String msg=sm.ta.getText();
				if(youId.isEmpty())
				{
					 sm.tf.setText("");
					 sm.setVisible(true);
				}
				if(msg.length()<1)
				{
					sm.ta.requestFocus();
					return;
				}
				
				try
				{
					out.write((Function.MSGSEND+"|"
							+youId+"|"+msg+"\n").getBytes());
					// youId를 찾아서 msg를 보내주는 기능 수행 
				}catch(Exception ex){}
				// 창을 감춘다 
				sm.setVisible(false);
			}
			
		}
		
	
	// 서버 연결
	public void connect(String id,String name,String sex)
	{
		try
		{
			s=new Socket("192.168.0.121",1024); // 서버 연결 // "" => 자신걸로 연결하려면 localhost
			out=s.getOutputStream();
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			out.write((Function.LOGIN+"|"
					+id+"|"+name+"|"+sex+"\n").getBytes());
		}
		catch(Exception ex) {}
		// 서버로부터 들어오는 데이터를 바아서 처리
		new Thread(this).start();
		
	}
	// 쓰레드 => 프로그램을 별도로 동작 => 서버에서 들어오는 값만 처리
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();
				System.out.println("Server=>"+msg);
				StringTokenizer st=new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				// Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos
				switch(protocol)
				{
				case Function.LOGIN:
				{
					String[] data= {
						st.nextToken(),
						st.nextToken(),
						st.nextToken(),
						st.nextToken()
					};
					cp.cp.model2.addRow(data);
				}
				break;
				case Function.MYLOG:
				{
					login.setVisible(false); // 로그인창을 닫고
					setVisible(true); // 닫은 화면을 보여줘라 => 메인창을 띄워라
				}
				break;
				case Function.WAITCHAT:
				{
					cp.cp.bar.setValue(cp.cp.bar.getMaximum());
					cp.cp.pane.append(st.nextToken()+"\n");
				}
				break;
				case Function.MYEXIT:
				{
					System.exit(0);
				}
				break;
				case Function.EXIT:
				{
					String id=st.nextToken();
					for(int i=0;i<cp.cp.model2.getRowCount();i++)
					{
						String temp=cp.cp.model2.getValueAt(i, 0).toString();
						if(id.equals(temp))
						{
							cp.cp.model2.removeRow(i);
							break;
						}
					}
					
				}
				break;
				case Function.MSGSEND:
				  {
					  String id=st.nextToken();
					  String strMsg=st.nextToken();
					  rm.tf.setText(id);
					  rm.ta.setText(strMsg);
					  rm.setVisible(true);
				  }
				  break;
				
				}
			}
		}catch(Exception ex) {}
	}

}
