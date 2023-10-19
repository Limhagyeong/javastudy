package com.sist.exception;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 *  예외처리
 *   = 예외 복구 => try catch
 *     try => 정상 수행 문장 => 오류 발생
 *     catch => try를 수행하는 과정 => 에러발생 시 
 *              1) 확인 *** => getMessage() / printStackTrace() => 몇번째 줄에서 에러가 났는지 확인
 *              2) 복구
 *              => 처음부터 수행되게 만든다
 *              => catch는 여러번 사용이 가능하다
 *              => 순서 존재 
 *              
 *   = 예외 회피 => throws
 */
// UpDown Game
// 예외처리 시 고려사항
/*
 * 1. if문으로 가능한지? => 예외처리 할 필요 없음
 * 2. 불가하다면 예외처리
 * 
 * 변수는 항상 명시적 초기화 => 불가하다면 생성자 이용해서 초기값 부여
 */
public class MainClass_4 extends JFrame implements ActionListener{
    JTextField tf;
    JTextArea ta;
    JButton b1,b2; // null => 초기화 필요
    // 난수
    int com; // 0 => 초기화 필요 X
    // 초기화  ==> 생성자
    public MainClass_4()
    {
    	tf=new JTextField(10); // 글자수
    	tf.setEnabled(false); // 비활성화
    	ta=new JTextArea(); //
    	JScrollPane js=new JScrollPane(ta);
    	b1=new JButton("Start");
    	b2=new JButton("Exit");
    	
    	// 윈도우 배치
    	
    	JPanel p=new JPanel();
    	p.add(tf);
    	p.add(b1);
    	p.add(b2);
    	
    	add("North",p);
    	add("Center",js);
    	setSize(300, 450);
    	setVisible(true);
    	
    	// 버튼 클릭 시 => actionPerformed 호출 요청
    	// 이벤트 처리
    	
    	b1.addActionListener(this);
    	//                   위치
    	b2.addActionListener(this);
    	tf.addActionListener(this); // 엔터
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass_4();
	}
    // 버튼 처리, 엔터 처리시 필요한 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) // b1을 누른 경우
		{
			com=(int)(Math.random()*100)+1;
			b1.setEnabled(false);
			tf.setEnabled(true);
			tf.requestFocus(); // b1 버튼을 누르면 포커스 만들어준다 (검색창 누르지 않아도 커서 활성화됨)
			ta.append("게임을 시작합니다\n"); // 채팅 문자를 새겨줌
		}
		if(e.getSource()==b2) // b2를 누른 경우
		{
			dispose(); // 윈도우에 있는 모든 메모리 회수 
			System.exit(0);
		}
		if(e.getSource()==tf) // 엔터 쳤을 때 => 정수 입력을 하지 않았을 경우 오류 처리
		{
			try 
			{
				// 정수 정상 입력
				String num=tf.getText(); // 텍스트필드에 입력한 값을 읽어옴
				int user=Integer.parseInt(num); // 정수로 변환
				// user vs com
				if(user<1 || user>100)
				{
					ta.append("1~100까지 입력이 가능합니다\n");
				}
				else
				{
					if(com>user)
					{
						ta.append("입력값보다 큰 값을 입력하시오\n");
					}
					else if(com<user)
					{
						ta.append("입력값보다 작은 값을 입력하시오\n");
					}
					else
					{
						ta.append("Game Over\n");
						tf.setText("");
						b1.setEnabled(true);  // 버튼을 다시 활성화 시켜줌
						tf.setEnabled(false); // b1버튼을 누르면 "게임을 시작합니다"
					}
				}
               
				tf.setText("");
			}catch(NumberFormatException ex) // 예외 복구 문장 // => RuntimeException 입력해줘도 가능!
			{
				// 정수 외 다른 문자 입력 시 복구
				JOptionPane.showMessageDialog(this, "1~100까지 정수만 입력하시오");
				tf.setText(""); // 검색창에 입력한 텍스트를 공백으로 바꿔주고
				tf.requestFocus(); // 검색창 커서를 활성화 시켜준다

			}
		}
	}

}
