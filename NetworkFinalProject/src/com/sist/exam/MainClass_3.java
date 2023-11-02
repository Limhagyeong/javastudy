package com.sist.exam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainClass_3 extends JFrame implements ActionListener{
	JProgressBar[] bar=new JProgressBar[5];
	JButton b1,b2; // 시작 종료 버튼
	static int rank;
	BarThread[] bt=new BarThread[5];
	public MainClass_3()
	{
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(5,1,5,5)); 
		Color[] color={Color.cyan, Color.yellow, Color.pink, Color.orange, Color.magenta};
		for(int i=0;i<5;i++)
		{
			bar[i]=new JProgressBar();
			bar[i].setMinimum(0);
			bar[i].setMaximum(100);
			bar[i].setStringPainted(true);
			// 1%~~100%
			bar[i].setForeground(color[i]);
			bar[i].setBackground(Color.white);
			p.add(bar[i]);
		}
		
		JPanel p2=new JPanel();
		p2.add(b1);p2.add(b2);
		
		add("Center",p);
		add("South",p2);
		
		setSize(640,350);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass_3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==b1)
		{
			for(int i=0;i<5;i++)
			{
				bt[i]=new BarThread(i);
				bt[i].start();
			}
		}
	}
	
	// Thread => bar를 이용한다 (클래스 안에 클래스를 만들어 필드를 가져와서 사용한다! => 선언 필요 없음)
	// => 윈도우가 가지고 있는 모든 데이터 사용 => 객체 생성 없이 사용 가능 => 내부 클래스!
	// 서버 개발, 빅데이터 개발, 쓰레드 개발 등에 자주 사용됨 (클래스끼리 모든 데이터 공유)
	/*
	 *  내부클래스 
	 *  => 멤버 클래스 => 쓰레드 사용 시 주로 이용
	 *      class A
	 *      {
	 *         class B
	 *         {
	 *            A가 가지고있는 모든 데이터 공유
	 *         }
	 *      }
	 *  => 익명의 클래스 => 상속이 없이 오버라이딩 가능
	 *     class A
	 *     {
	 *        B b=new B()
	 *        {
	 *          public void disp(){}
	 *          // 메소드 추가 가능
	 *        }
	 *     }
	 *     class B
	 *     {
	 *        public void disp(){}
	 *     }
	 *     
	 *  => 지역 클래스 (사용 빈도 거의 없음)
	 *     class A
	 *     {
	 *        public void disp()
	 *        {
	 *           class B
	 *           {
	 *           }
	 *        }
	 *     }
	 */
	class BarThread extends Thread
	{
		// 프로그레스바 한개만 동작할 수 있도록 만든다 ==> 5번 부르면 따로 동작
		int index;
		public BarThread(int index)
		{
			this.index=index; // 쓰레드 구분을위해 필요!
		}
		public void run()
		{
			for(int i=0;i<=100;i++)
			{
				bar[index].setValue(i);
				int a=(int)(Math.random()*300); // 일시정지
				try
				{
					Thread.sleep(a);
				}catch(Exception ex) {}
				
				if(i==100)
				{
					rank++;
					interrupt(); // 쓰레드 종료 (100%)
				}
				
			}
			System.out.println((index+1)+"번째:"+rank+"등");
		}
	}

}
